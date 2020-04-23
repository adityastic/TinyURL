package com.prabhanshu.tinyurl.controller;

import com.prabhanshu.tinyurl.model.Stats;
import com.prabhanshu.tinyurl.service.TinyURLService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StatsURLController {

    final TinyURLService tinyURLService;

    public StatsURLController(TinyURLService tinyURLService) {
        this.tinyURLService = tinyURLService;
    }

    @GetMapping("/statistics")
    @ResponseBody
    public Stats createLinkOf() {
        return tinyURLService.getAllStats();
    }
}