package com.prabhanshu.tinyurl.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShortUrl {
    static String URL = "http://localhost:8080/";

    @JsonProperty("short_url")
    String shortUrl;

    public ShortUrl(String shortUrl) {
        this.shortUrl = URL + shortUrl;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }
}
