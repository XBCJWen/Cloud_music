package com.example.yt.cloud_music.bean;

public class IcBean {
    private String name;
    private int imgid;

    public IcBean(String name, int imgid) {
        this.name = name;
        this.imgid = imgid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }
}
