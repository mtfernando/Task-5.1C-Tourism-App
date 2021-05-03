package com.example.task51ctourismapp;

public class Destination {
    public String imageRes;
    public String header;
    public String desc;

    public Destination(String imageRes, String header, String desc){
        this.imageRes = imageRes;
        this.header = header;
        this.desc = desc;
    }

    public void setImageRes(String imageRes) {
        this.imageRes = imageRes;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImageRes() {
        return imageRes;
    }

    public String getHeader() {
        return header;
    }

    public String getDesc() {
        return desc;
    }
}
