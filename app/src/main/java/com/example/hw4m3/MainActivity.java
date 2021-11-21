package com.example.hw4m3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

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
        list.add(new ItemModel("Бразилия", "Бразилия", R.drawable.ic_br_flag));
        list.add(new ItemModel("Аргентино", "Буэнос-Айрес", R.drawable.ic_ar_flag));
        list.add(new ItemModel("Колумбия", "Богота", R.drawable.ic_co_flag));
        list.add(new ItemModel("Уругвей", "Монтевидео", R.drawable.ic_uy_flag));
        list.add(new ItemModel("Чили", "Сантьяго", R.drawable.ic_cl_flag));

        recyclerAdapter = new RecyclerAdapter(list, new IOnClick() {
            @Override
            public void onClick(int pos) {
                Toast.makeText(MainActivity.this, "pos" + pos, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                if (pos == 0) {
                    intent.putExtra("flag", "br"); // Бразилия
                    Log.d("pizza", "br");
                } else if (pos == 1) {
                    intent.putExtra("flag", "ar"); // Аргентино
                    Log.d("pizza", "ar");
                } else if (pos == 2) {
                    intent.putExtra("flag", "co"); // Колумбия
                    Log.d("pizza", "co");
                } else if (pos == 3) {
                    intent.putExtra("flag", "uy"); // Уругвей
                    Log.d("pizza", "uy");
                } else if (pos == 4) {
                    intent.putExtra("flag", "cl"); // Чили
                    Log.d("pizza", "cl");
                }
                startActivity(intent);
            }
        });
        recyclerView.setAdapter(recyclerAdapter);
    }
}