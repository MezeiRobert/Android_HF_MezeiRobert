package com.example.hazi6;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment2 extends Fragment {
    private static final String ARG_SELECTED_SHORT = "selected_short";
    private static final String ARG_SELECTED_IMAGE = "selected_image";
    private static final String ARG_SELECTED_BUY_PRICE = "selected_buy_price";
    private static final String ARG_SELECTED_SELL_PRICE = "selected_sell_price";
    private static final String ARG_SELECTED_LONG = "selected_long";

    private String selectedShort;
    private int selectedImage;
    private String selectedBuyPrice;
    private String selectedSellPrice;
    private String selectedLong;

    public Fragment2() {
        // Required empty public constructor
    }

    public static Fragment2 newInstance(String selectedShort, int selectedImage, String selectedBuyPrice, String selectedSellPrice, String selectedLong) {
        Fragment2 fragment = new Fragment2();
        Bundle args = new Bundle();
        args.putString(ARG_SELECTED_SHORT, selectedShort);
        args.putInt(ARG_SELECTED_IMAGE, selectedImage);
        args.putString(ARG_SELECTED_BUY_PRICE, selectedBuyPrice);
        args.putString(ARG_SELECTED_SELL_PRICE, selectedSellPrice);
        args.putString(ARG_SELECTED_LONG, selectedLong);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            selectedShort = getArguments().getString(ARG_SELECTED_SHORT);
            selectedImage = getArguments().getInt(ARG_SELECTED_IMAGE);
            selectedBuyPrice = getArguments().getString(ARG_SELECTED_BUY_PRICE);
            selectedSellPrice = getArguments().getString(ARG_SELECTED_SELL_PRICE);
            selectedLong = getArguments().getString(ARG_SELECTED_LONG);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_2, container, false);

        ImageView imageView = rootView.findViewById(R.id.image);
        TextView buyPriceTextView = rootView.findViewById(R.id.buyPrice);
        TextView sellPriceTextView = rootView.findViewById(R.id.sellPrice);
        TextView longTextView = rootView.findViewById(R.id.longText);

        imageView.setImageResource(selectedImage);
        buyPriceTextView.setText(selectedBuyPrice != null ? "Cumpara: " + selectedBuyPrice : "");
        sellPriceTextView.setText(selectedSellPrice != null ? "Vinde: " + selectedSellPrice : "");
        longTextView.setText(selectedLong);

        return rootView;
    }
}