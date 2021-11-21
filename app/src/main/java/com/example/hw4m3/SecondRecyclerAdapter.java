package com.example.hw4m3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SecondRecyclerAdapter extends RecyclerView.Adapter<ViewHolder>{
    private ArrayList<ItemModel> list2 = new ArrayList<>();
    private IOnClick listener;

    public SecondRecyclerAdapter(ArrayList<ItemModel> list, IOnClick listener) {
        this.list2 = list;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler, parent, false);
        return new ViewHolder(view, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list2.get(position));
    }

    @Override
    public int getItemCount() {
        return list2.size();
    }
}
