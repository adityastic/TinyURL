package com.prabhanshu.tinyurl.controller;

import com.prabhanshu.tinyurl.service.TinyURLService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HandleURLController {

    final TinyURLService tinyURLService;

    public HandleURLController(TinyURLService tinyURLService) {
        this.tinyURLService = tinyURLService;
    }

    @GetMapping("/{shortUrl}")
    public String createLinkOf(
            @PathVariable String shortUrl) {
        return tinyURLService.getUrlFromShortUrl(shortUrl);
    }
}