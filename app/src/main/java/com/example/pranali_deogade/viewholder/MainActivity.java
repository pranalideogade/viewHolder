package com.example.pranali_deogade.viewholder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Item> itemList = new ArrayList<Item>();
        ItemArrayAdapter itemArrayAdapter=new ItemArrayAdapter(this,R.layout.list_item,itemList);
        listView=(ListView)findViewById(R.id.item_list);
        listView.setAdapter(itemArrayAdapter);


            itemList.add(new Item("pran","ycce"));
        itemList.add(new Item("amo","gce"));
        itemList.add(new Item("jyo","sighn"));
        itemList.add(new Item("prat","cmmms"));


        // Set up list item onclick listener
        setUpListItemClickListener();
    }

    private void setUpListItemClickListener() {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "item " + position + " clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
