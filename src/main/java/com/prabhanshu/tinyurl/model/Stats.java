package com.prabhanshu.tinyurl.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Stats {
    @JsonProperty("count_statistics")
    public ArrayList<Stat> countStatistics;

    public Stats(ArrayList<Stat> countStatistics) {
        this.countStatistics = countStatistics;
    }

    public ArrayList<Stat> getCountStatistics() {
        return countStatistics;
    }

    public void setCountStatistics(ArrayList<Stat> countStatistics) {
        this.countStatistics = countStatistics;
    }
}
