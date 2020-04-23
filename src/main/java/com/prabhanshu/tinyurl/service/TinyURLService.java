package com.prabhanshu.tinyurl.service;

import com.prabhanshu.tinyurl.TinyURLRepository;
import com.prabhanshu.tinyurl.model.ShortUrl;
import com.prabhanshu.tinyurl.model.Stat;
import com.prabhanshu.tinyurl.model.Stats;
import com.prabhanshu.tinyurl.model.TinyURL;
import com.prabhanshu.tinyurl.utils.TinyURLUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TinyURLService {
    final TinyURLRepository tinyURLRepository;

    public TinyURLService(TinyURLRepository tinyURLRepository) {
        this.tinyURLRepository = tinyURLRepository;
    }

    public ShortUrl createShortUrl(String url) {
        TinyURL savedObject = tinyURLRepository.save(new TinyURL(url));
        return new ShortUrl(TinyURLUtils.idToShortURL(savedObject.getId()));
    }

    public String getUrlFromShortUrl(String shortUrl) {
        try {
            TinyURL foundUrl = tinyURLRepository.getOne(TinyURLUtils.shortURLtoID(shortUrl));
            foundUrl.setCount(foundUrl.getCount() + 1);
            tinyURLRepository.save(foundUrl);
            return "redirect:" + foundUrl.getURL();
        } catch (Exception e) {
            return "redirect:https://google.com";
        }
    }

    public Stats getAllStats() {
        ArrayList<Stat> statList = new ArrayList<>();
        for (TinyURL tinyURL : tinyURLRepository.findAll()) {
            statList.add(new Stat(tinyURL.getId(), tinyURL.getCount()));
        }
        return new Stats(statList);
    }
}
