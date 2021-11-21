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
            list2.add(new ItemModel("Сан-Паулу", "Бразилия", R.drawable.ic_br_flag));
            list2.add(new ItemModel("Салвадор", "Бразилия", R.drawable.ic_br_flag));
            list2.add(new ItemModel("Рио-де-Жанейро", "Бразилия", R.drawable.ic_br_flag));
            list2.add(new ItemModel("Манаус", "Бразилия", R.drawable.ic_br_flag));
            list2.add(new ItemModel("Форталеза", "Бразилия", R.drawable.ic_br_flag));
        } else if (extra.equals("ar")) {
            list2.add(new ItemModel("Буэнос-Айрес", "Аргентино", R.drawable.ic_ar_flag));
            list2.add(new ItemModel("Кордова", "Аргентино", R.drawable.ic_ar_flag));
            list2.add(new ItemModel("Росарио", "Аргентино", R.drawable.ic_ar_flag));
            list2.add(new ItemModel("Сальта", "Аргентино", R.drawable.ic_ar_flag));
            list2.add(new ItemModel("Санта-Фе", "Аргентино", R.drawable.ic_ar_flag));
        } else if (extra.equals("co")) {
            list2.add(new ItemModel("Богота", "Колумбия", R.drawable.ic_co_flag));
            list2.add(new ItemModel("Медельин", "Колумбия", R.drawable.ic_co_flag));
            list2.add(new ItemModel("Кали", "Колумбия", R.drawable.ic_co_flag));
            list2.add(new ItemModel("Барранкилья", "Колумбия", R.drawable.ic_co_flag));
            list2.add(new ItemModel("Картахена", "Колумбия", R.drawable.ic_co_flag));
        } else if (extra.equals("uy")) {
            list2.add(new ItemModel("Монтевидео", "Уругвай", R.drawable.ic_uy_flag));
            list2.add(new ItemModel("Сальто", "Уругвай", R.drawable.ic_uy_flag));
            list2.add(new ItemModel("Сьюдад-де-ла-Коста", "Уругвай", R.drawable.ic_uy_flag));
            list2.add(new ItemModel("Пайсанду", "Уругвай", R.drawable.ic_uy_flag));
            list2.add(new ItemModel("Лас-Пьедрас", "Уругвай", R.drawable.ic_uy_flag));
        } else if (extra.equals("cl")) {
            list2.add(new ItemModel("Сантьяго", "Чили", R.drawable.ic_cl_flag));
            list2.add(new ItemModel("Вальпараисо", "Чили", R.drawable.ic_cl_flag));
            list2.add(new ItemModel("Консепсьон", "Чили", R.drawable.ic_cl_flag));
            list2.add(new ItemModel("Ла-Серена", "Чили", R.drawable.ic_cl_flag));
            list2.add(new ItemModel("Антофагаста", "Чили", R.drawable.ic_cl_flag));
        }

        else {
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