package com.example.hazi6;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListViewAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final Integer[] imageArray;
    private final String[] shortArray;
    private final String[] longArray;
    private final String[] buyPriceArray;
    private final String[] sellPriceArray;

    public CustomListViewAdapter(Activity context, Integer[] image, String[] shortText, String[] longText, String[] buyPrice, String[] sellPrice) {
        super(context, R.layout.list_item, shortText);
        this.context = context;
        imageArray = image;
        shortArray = shortText;
        longArray = longText;
        buyPriceArray = buyPrice;
        sellPriceArray = sellPrice;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_item, null, true);

        ImageView image = rowView.findViewById(R.id.image);
        TextView longText = rowView.findViewById(R.id.longText);
        TextView shortText = rowView.findViewById(R.id.shortText);

        image.setImageResource(imageArray[position]);
        longText.setText(longArray[position]);
        shortText.setText(shortArray[position]);

        return rowView;
    }
}
