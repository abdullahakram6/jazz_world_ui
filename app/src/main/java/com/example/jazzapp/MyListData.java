package com.example.jazzapp;

public class MyListData{
    private String description;
    private int imgId  ;
    public MyListData( int imgId , String description) {
        this.imgId = imgId;
        this.description = description;

    }
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public int getImgId() {
        return imgId;
    }
    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}