package com.example.hw4m3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private SecondRecyclerAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        recyclerView = findViewById(R.id.recycler2);
        ArrayList<ItemModel> list2 = new ArrayList<>();

        list2.add(new ItemModel("a", "b", R.drawable.ic_launcher_foreground));

        recyclerAdapter = new SecondRecyclerAdapter(list2, new IOnClick() {
            @Override
            public void onClick(int pos) {
                Toast.makeText(SecondActivity.this, "pos" + pos, Toast.LENGTH_SHORT).show();

            }
        });
        recyclerView.setAdapter(recyclerAdapter);
    }
}