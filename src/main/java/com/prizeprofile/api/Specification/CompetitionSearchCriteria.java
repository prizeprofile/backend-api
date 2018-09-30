package com.prizeprofile.api.Specification;

public class CompetitionSearchCriteria {
    private Integer minEntrants;

    private Integer maxEntrants;

    private Boolean onlyVerified;

    private String entryMethods;

    private Boolean onlyRecent;

    private String pattern;

    public Integer getMinEntrants() {
        return minEntrants;
    }

    public void setMinEntrants(Integer minEntrants) {
        this.minEntrants = minEntrants;
    }

    public Integer getMaxEntrants() {
        return maxEntrants;
    }

    public void setMaxEntrants(Integer maxEntrants) {
        this.maxEntrants = maxEntrants;
    }

    public Boolean getOnlyVerified() {
        return onlyVerified;
    }

    public void setOnlyVerified(Boolean verified) {
        this.onlyVerified = verified;
    }

    public String getEntryMethods() {
        return entryMethods;
    }

    public void setEntryMethods(String entryMethods) {
        this.entryMethods = entryMethods;
    }

    public Boolean getOnlyRecent() {
        return onlyRecent;
    }

    public void setOnlyRecent(Boolean onlyRecent) {
        this.onlyRecent = onlyRecent;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
