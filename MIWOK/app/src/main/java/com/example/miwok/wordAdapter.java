package com.example.miwok;

import android.app.Activity;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class wordAdapter extends ArrayAdapter<word> {

    private static final String LOG_TAG = wordAdapter.class.getSimpleName();
    private int colorResourceId;


    public wordAdapter(Activity context, ArrayList<word> words, int cResource) {

        super(context, 0, words);
        colorResourceId=cResource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    (R.layout.list), parent, false);
        }


        word currentWord = getItem(position);


        TextView nameTextView = (TextView) listItemView.findViewById(R.id.miwokView);

        nameTextView.setText(currentWord.getMiwok());


        TextView numberTextView = (TextView) listItemView.findViewById(R.id.defaultView);

        numberTextView.setText(currentWord.getDefault());
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentWord.hasImage()) {


            iconView.setImageResource(currentWord.getImageResourceId());
            iconView.setVisibility(View.VISIBLE);
        } else {
            iconView.setVisibility(View.GONE);
        }


        return listItemView;


    }

}