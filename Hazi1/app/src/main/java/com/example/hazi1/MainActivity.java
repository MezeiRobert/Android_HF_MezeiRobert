package com.example.hazi1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText szam1;
    private EditText szam2;
    private TextView eredmeny;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        szam1 = findViewById(R.id.szam1);
        szam2 = findViewById(R.id.szam2);
        eredmeny = findViewById(R.id.eredmenyid);

        Button osszeadas = findViewById(R.id.osszeadas);
        Button kivonas = findViewById(R.id.kivonas);
        Button szorzas = findViewById(R.id.szorzas);
        Button osztas = findViewById(R.id.osztas);

        osszeadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double num1 = Double.parseDouble(szam1.getText().toString());
                    double num2 = Double.parseDouble(szam2.getText().toString());
                    double eredmeny = num1 + num2;
                    MainActivity.this.eredmeny.setText("Eredmeny: " + String.valueOf(eredmeny));
                } catch (NumberFormatException e) {
                    eredmeny.setText("Hibás bemenet");
                }
            }
        });

        kivonas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double num1 = Double.parseDouble(szam1.getText().toString());
                    double num2 = Double.parseDouble(szam2.getText().toString());
                    double eredmeny = num1 - num2;
                    MainActivity.this.eredmeny.setText("Eredmeny: " + String.valueOf(eredmeny));
                } catch (NumberFormatException e) {
                    eredmeny.setText("Hibás bemenet");
                }
            }
        });

        szorzas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double num1 = Double.parseDouble(szam1.getText().toString());
                    double num2 = Double.parseDouble(szam2.getText().toString());
                    double eredmeny = num1 * num2;
                    MainActivity.this.eredmeny.setText("Eredmeny: " + String.valueOf(eredmeny));
                } catch (NumberFormatException e) {
                    eredmeny.setText("Hibás bemenet");
                }
            }
        });

        osztas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double num1 = Double.parseDouble(szam1.getText().toString());
                    double num2 = Double.parseDouble(szam2.getText().toString());
                    if (num2 != 0) {
                        double eredmeny = num1 / num2;
                        MainActivity.this.eredmeny.setText("Eredmeny: " + String.valueOf(eredmeny));
                    } else {
                        eredmeny.setText("Nullával való osztás");
                    }
                } catch (NumberFormatException e) {
                    eredmeny.setText("Hibás bemenet");
                }
            }
        });
    }
}
