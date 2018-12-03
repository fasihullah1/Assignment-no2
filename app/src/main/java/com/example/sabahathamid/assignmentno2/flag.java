package com.example.sabahathamid.assignmentno2;

public class flag {
    private String name;
    private int Thumbnail;

    public flag(String name, int thumbnail) {
        this.name = name;
        this.Thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setName(String name) {
       this.name = name;
    }

    public void setThumbnail(int thumbnail) {
        this.Thumbnail = thumbnail;
    }
}
