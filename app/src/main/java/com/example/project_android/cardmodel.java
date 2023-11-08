package com.example.project_android;

public class cardmodel {
    private String namanama;
    private int img;

    public cardmodel(String namanama, int img) {
        this.namanama = namanama;
        this.img = img;
    }

    public String getNamanama() {
        return namanama;
    }

    public void setNamanama(String namanama) {
        this.namanama = namanama;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
