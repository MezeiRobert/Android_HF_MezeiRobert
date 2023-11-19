package com.example.hazi5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    ListView myList;
    ArrayAdapter<String> adapter;
    ArrayList<String> listItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myList = findViewById(R.id.myList);
        listItems.addAll(Arrays.asList(getResources().getStringArray(R.array.listItems)));
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listItems);
        myList.setAdapter(adapter);
        registerForContextMenu(myList);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
        int position = info.position;
        int id = item.getItemId();

        if (id == R.id.piros){
            ((TextView)myList.getChildAt(position)).setTextColor(Color.RED);
        } else if (id == R.id.zold){
            ((TextView)myList.getChildAt(position)).setTextColor(Color.GREEN);
        } else if (id == R.id.sarga){
            ((TextView)myList.getChildAt(position)).setTextColor(Color.YELLOW);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.sort) {
            Collections.sort(listItems);
            adapter.notifyDataSetChanged();
        } else if (id == R.id.delete) {
            adapter.clear();
        }
        return true;
    }
}