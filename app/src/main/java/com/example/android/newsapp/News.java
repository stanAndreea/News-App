package com.example.android.newsapp;

public class News {

    private String nameArticle;
    private String sectionName;
    private String datePublished;
    private String urlArticle;

    public News(String nameArticle, String sectionName, String datePublished, String urlArticle) {
        this.nameArticle = nameArticle;
        this.sectionName = sectionName;
        this.datePublished = datePublished;
        this.urlArticle = urlArticle;
    }

    public String getNameArticle() {
        return nameArticle;
    }

    public String getSectionName() {
        return sectionName;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public String getUrlArticle() {
        return urlArticle;
    }
}
