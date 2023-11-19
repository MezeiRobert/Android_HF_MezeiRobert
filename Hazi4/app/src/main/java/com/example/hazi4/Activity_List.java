package com.example.hazi4;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Activity_List extends ArrayAdapter<String> {
    private final Activity context;
    private final int[] currencyImage;
    public Activity_List(Activity context, int[] image, String[] shortCurrency, String[] longCurrency, String[] buy, String[] sell) {
        super(context, R.layout.activity_list, shortCurrency);
        this.context = context;
        currencyImage = image;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View view = inflater.inflate(R.layout.activity_list, null, true);

        ImageView imageView = view.findViewById(R.id.flagImage);
        imageView.setImageResource(currencyImage[position]);

        return view;
    }
}