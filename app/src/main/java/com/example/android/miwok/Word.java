package com.example.android.miwok;

import android.widget.ImageView;

public class Word {
    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mAudioResourceID;

    private int mImageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;



    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceID){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceID = audioResourceID;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID,
                int audioResourceID){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
        mAudioResourceID = audioResourceID;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public int getAudioResourceID(){return mAudioResourceID;}

    public int getImageResourceID() {return mImageResourceID;}

    public boolean hasImage(){return mImageResourceID != NO_IMAGE_PROVIDED;}

    @Override
    public String toString(){
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation=" +mMiwokTranslation +'\'' +
                ", mAudioResourceID=" + mAudioResourceID +
                ", mImageResourceID+" + mImageResourceID +
                '}';
    }
}
