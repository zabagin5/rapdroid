package com.rapdroid.nyilehkamera;

/**
 * Created by M. HILMI PRASETYA on 5/20/2017.
 */

public class acbum {
    private String name;
    private int numOfAc;
    private int thumbnail;
    public acbum(){

    }
    public acbum(String name, int numOfAc, int thumbnail){
        this.name = name;
        this.numOfAc = numOfAc;
        this.thumbnail = thumbnail;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfAc() {
        return numOfAc;
    }

    public void setNumOfAcs(int numOfAc) {
        this.numOfAc = numOfAc;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
