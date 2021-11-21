package com.example.hw4m3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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

        String extra = getIntent().getStringExtra("flag");
        if (extra.equals("br")) {
            Log.d("pizzapizza", "Brazil");
            list2.add(new ItemModel("Сан-Паулу", "Бразилия", R.drawable.ic_launcher_foreground));
            list2.add(new ItemModel("Салвадор", "Бразилия", R.drawable.ic_launcher_foreground));
            list2.add(new ItemModel("Рио-де-Жанейро", "Бразилия", R.drawable.ic_launcher_foreground));
            list2.add(new ItemModel("Манаус", "Бразилия", R.drawable.ic_launcher_foreground));
            list2.add(new ItemModel("Форталеза", "Бразилия", R.drawable.ic_launcher_foreground));
        } else {
            list2.add(new ItemModel("bruh", "for debug", R.drawable.ic_launcher_foreground));
        }

        recyclerAdapter = new SecondRecyclerAdapter(list2, new IOnClick() {
            @Override
            public void onClick(int pos) {
                Toast.makeText(SecondActivity.this, "pos" + pos, Toast.LENGTH_SHORT).show();

            }
        });
        recyclerView.setAdapter(recyclerAdapter);
    }
}