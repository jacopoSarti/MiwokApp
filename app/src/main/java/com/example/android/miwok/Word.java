package com.example.android.miwok;

import android.media.Image;

public class Word {

    private String mEnglishTranslation;
    private String mMiwokTranslation;
    private int mImageId;
    private int mAudioId;

    public Word(String english, String miwok, int audioId) {
        mEnglishTranslation = english;
        mMiwokTranslation = miwok;
        mImageId = 0;
        mAudioId = audioId;
    }

    public Word(String english, String miwok, int imageId, int audioId) {
        mEnglishTranslation = english;
        mMiwokTranslation = miwok;
        mImageId = imageId;
        mAudioId = audioId;
    }

    public String getmEnglishTranslation() {
        return this.mEnglishTranslation;
    }

    public String getmMiwokTranslation() {
        return this.mMiwokTranslation;
    }

    public int getmImageId() { return this.mImageId; }
    public int getmAudioId() { return this.mAudioId; }
}
