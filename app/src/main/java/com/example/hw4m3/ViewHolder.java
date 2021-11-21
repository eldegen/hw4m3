package com.example.hw4m3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    private TextView title;
    private ImageView image;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.iv_box_icon);
        title = itemView.findViewById(R.id.title);
    }

    public void onBind(ItemModel model) {
        this.title.setText(model.getTitle());
        image.setImageResource(model.getImage());
    }
}
