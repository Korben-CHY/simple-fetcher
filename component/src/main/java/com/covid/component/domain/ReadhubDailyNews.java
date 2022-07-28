package com.covid.component.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ReadhubDailyNews {
    private Integer id;

    private String title;

    private String summary;

    private String siteName;

    private String newsCreatedAt;

    private LocalDate newsDate;

    private LocalDateTime createdAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getNewsCreatedAt() {
        return newsCreatedAt;
    }

    public void setNewsCreatedAt(String newsCreatedAt) {
        this.newsCreatedAt = newsCreatedAt;
    }

    public LocalDate getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(LocalDate newsDate) {
        this.newsDate = newsDate;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", summary=").append(summary);
        sb.append(", siteName=").append(siteName);
        sb.append(", newsCreatedAt=").append(newsCreatedAt);
        sb.append(", newsDate=").append(newsDate);
        sb.append(", createdAt=").append(createdAt);
        sb.append("]");
        return sb.toString();
    }
}