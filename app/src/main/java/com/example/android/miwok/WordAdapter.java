package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public Context mContext;
    public ArrayList<Word> mWords;
    public int mColorId;

    public WordAdapter(Context context, ArrayList<Word> data, int colorId) {
        super(context, 0, data);
        mColorId = colorId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View wordView = convertView;
        if(wordView == null) {
            wordView = LayoutInflater.from(getContext()).inflate(R.layout.miwok_list_item, parent, false);
        }

        Word currentWord = getItem(position);

        LinearLayout center = (LinearLayout)wordView.findViewById(R.id.centralLayout);
        int color = ContextCompat.getColor(getContext(), mColorId);
        center.setBackgroundColor(color);

        TextView miwokTextView = (TextView) wordView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        TextView englishTextView = (TextView) wordView.findViewById(R.id.english_text_view);
        englishTextView.setText(currentWord.getmEnglishTranslation());

        ImageView imageView = (ImageView) wordView.findViewById(R.id.image);

        if (currentWord.getmImageId() != 0) {
            imageView.setImageResource(currentWord.getmImageId());
        } else {
            imageView.setVisibility(View.GONE);
        }

        return wordView;
    }
}
