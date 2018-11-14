package com.example.android.miwok;

import android.media.Image;

public class Word {

    private String mEnglishTranslation;
    private String mMiwokTranslation;
    private int mImageId;

    public Word(String english, String miwok) {
        mEnglishTranslation = english;
        mMiwokTranslation = miwok;
        mImageId = 0;
    }

    public Word(String english, String miwok, int imageId) {
        mEnglishTranslation = english;
        mMiwokTranslation = miwok;
        mImageId = imageId;
    }

    public String getmEnglishTranslation() {
        return this.mEnglishTranslation;
    }

    public String getmMiwokTranslation() {
        return this.mMiwokTranslation;
    }

    public int getmImageId() { return this.mImageId; }
}
