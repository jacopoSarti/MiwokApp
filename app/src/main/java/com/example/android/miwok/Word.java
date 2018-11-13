package com.example.android.miwok;

public class Word {

    private String mEnglishTranslation;
    private String mMiwokTranslation;

    public Word(String english, String miwok) {
        mEnglishTranslation = english;
        mMiwokTranslation = miwok;
    }

    public String getmEnglishTranslation() {
        return this.mEnglishTranslation;
    }

    public String getmMiwokTranslation() {
        return this.mMiwokTranslation;
    }
}
