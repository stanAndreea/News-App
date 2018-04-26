package com.example.android.newsappstage;

public class News {
    private String nameAuthor;
    private String nameArticle;
    private String sectionName;
    private String datePublished;
    private String urlArticle;

    public News(String nameAuthor, String nameArticle, String sectionName, String datePublished, String urlArticle) {
        this.nameAuthor = nameAuthor;
        this.nameArticle = nameArticle;
        this.sectionName = sectionName;
        this.datePublished = datePublished;
        this.urlArticle = urlArticle;
    }

    public String getNameAuthor() {
        return nameAuthor;
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
