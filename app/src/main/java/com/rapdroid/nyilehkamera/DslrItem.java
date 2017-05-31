package com.rapdroid.nyilehkamera;

/**
 * Created by M. HILMI PRASETYA on 5/25/2017.
 */

public class DslrItem {
    private String mName;
    private int mThumbnail;

    public String getName() {
        return mName;
    }

    public void setName(String name){
        this.mName = name;
    }

    public int getThumbnail(){
        return mThumbnail;
    }
    public void setThumbnail(int thumbnail){
        this.mThumbnail = thumbnail;
    }
}
