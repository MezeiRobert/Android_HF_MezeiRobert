package com.example.hazi4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView myList;
    String currencyList[] = {"EUR","USD","GPB","AUD","CAD","CHF","DKK","HUF"};
    String currencyList2[] = {"Euro","Dolar american","Lira sterlina","Dolar australian","Dolar canadian","Franc elvetian","Coroana daneza","Forint maghiar"};
    int currencyImage[] = {R.drawable.european,R.drawable.america,R.drawable.england,R.drawable.australia,R.drawable.canada,R.drawable.switzerland,R.drawable.denmark,R.drawable.flag};
    String buyPrice[] = {"4,4100 RON","3,9750 RON","6,1250 RON","2,9600 RON","3,0950 RON","4,2300 RON","0,5850 RON","0,0136 RON"};
    String sellPrice[] = {"4,5500 RON","4,1450 RON","6,3550 RON","3,0600 RON","3,2650 RON","4,3300 RON","0,6150 RON","0,0146 RON"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myList = findViewById(R.id.myList);
        Activity_List adapter = new Activity_List(this, currencyImage, currencyList2, currencyList, buyPrice, sellPrice);
        myList.setAdapter(adapter);

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                TextView buyPriceText = view.findViewById(R.id.buyPrice);
                TextView sellPriceText = view.findViewById(R.id.sellPrice);
                TextView buyTextView = view.findViewById(R.id.buyText);
                TextView sellTextView = view.findViewById(R.id.sellText);
                TextView shortText = view.findViewById(R.id.shortText);
                TextView longText = view.findViewById(R.id.longText);

                shortText.setText(currencyList[position]);
                longText.setText(currencyList2[position]);
                buyTextView.setText("Cumpara: ");
                sellTextView.setText("Vinde: ");
                buyPriceText.setText(buyPrice[position]);
                sellPriceText.setText(sellPrice[position]);
            }
        });
    }
}
