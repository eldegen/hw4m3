package com.example.hw4m3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        ArrayList<ItemModel> list = new ArrayList<>();
        list.add(new ItemModel("Бразилия", R.drawable.ic_br_flag));
        list.add(new ItemModel("Аргентино", R.drawable.ic_ar_flag));
        list.add(new ItemModel("Колумбия", R.drawable.ic_co_flag));
        list.add(new ItemModel("Уругвей", R.drawable.ic_uy_flag));
        list.add(new ItemModel("Чили", R.drawable.ic_cl_flag));

        recyclerAdapter = new RecyclerAdapter(list);
        recyclerView.setAdapter(recyclerAdapter);
    }
}