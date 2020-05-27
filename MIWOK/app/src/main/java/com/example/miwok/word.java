package com.example.miwok;

import java.util.ArrayList;

public class word {
    private String miwokL;
    private String defaultL;
    private static final int NO_IMAGE=-1;
    private int imageResourceId=NO_IMAGE;
    private int maudioId;


    public word(String miwokTranslation, String defaultTranslation){
        miwokL=miwokTranslation;
        defaultL=defaultTranslation;
    }
    public word(String miwokTranslation, String defaultTranslation, int imageId,int audioId){
        miwokL=miwokTranslation;
        defaultL=defaultTranslation;
        imageResourceId=imageId;
        maudioId=audioId;
    }
    public int getaudioResourceId(){
        return maudioId;
    }


    public String getMiwok(){
    return miwokL;
    }

    public String getDefault(){
    return defaultL;
    }
    public int getImageResourceId(){
        return imageResourceId;
    }

    public Boolean hasImage(){
        return imageResourceId!=NO_IMAGE;
    }

}
