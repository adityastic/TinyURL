package com.prabhanshu.tinyurl.controller;

import com.prabhanshu.tinyurl.model.ShortUrl;
import com.prabhanshu.tinyurl.service.TinyURLService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateURLController {

    final TinyURLService tinyURLService;

    public CreateURLController(TinyURLService tinyURLService) {
        this.tinyURLService = tinyURLService;
    }

    @PostMapping("/create")
    public ShortUrl createLinkOf(
            @RequestParam("url") String url
    ) {
        return tinyURLService.createShortUrl(url);
    }
}