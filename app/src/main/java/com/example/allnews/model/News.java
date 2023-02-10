package com.example.allnews.model;

public class News {

    String name;
    String webLink;
    int image;

    public News(String name, String webLink, int image) {
        this.name = name;
        this.webLink = webLink;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getWebLink() {
        return webLink;
    }

    public int getImage() {
        return image;
    }
}
