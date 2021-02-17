package com.rudra.cryptoapp.models;

public class News {

    //Models
    String imageUrl;
    String newsUrl;
    String title;

    public News() {
    }

    public News(String imageUrl, String newsUrl, String title) {
        this.imageUrl = imageUrl;
        this.newsUrl = newsUrl;
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getNewsUrl() {
        return newsUrl;
    }

    public void setNewsUrl(String newsUrl) {
        this.newsUrl = newsUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
