package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public Context mContext;
    public ArrayList<Word> mWords;

    public WordAdapter(Context context, ArrayList<Word> data) {
        super(context, 0, data);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View wordView = convertView;
        if(wordView == null) {
            wordView = LayoutInflater.from(getContext()).inflate(R.layout.miwok_list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwokTextView = (TextView) wordView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        TextView englishTextView = (TextView) wordView.findViewById(R.id.english_text_view);
        englishTextView.setText(currentWord.getmEnglishTranslation());

        return wordView;
    }
}
