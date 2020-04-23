package com.prabhanshu.tinyurl.model;

import javax.persistence.*;

@Entity
@Table(name = "tinyurls")
public class TinyURL {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int count;

    private String URL;

    public TinyURL() {
    }

    public TinyURL(String URL) {
        this.count = 0;
        this.URL = URL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
