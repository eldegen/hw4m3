package com.example.hw4m3;

public class ItemModel {
    private String title;
    private String subTitle;
    private int image;

    public ItemModel(String title, String subTitle, int image) {
        this.title = title;
        this.image = image;
        this.subTitle = subTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
