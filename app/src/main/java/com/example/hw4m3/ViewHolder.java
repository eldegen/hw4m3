package com.example.hw4m3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    private TextView title, subTitle;
    private ImageView image;
    private IOnClick iOnClick;

    public ViewHolder(@NonNull View itemView, IOnClick listener) {
        super(itemView);
        iOnClick = listener;
        image = itemView.findViewById(R.id.iv_box_icon);
        title = itemView.findViewById(R.id.title);
        subTitle = itemView.findViewById(R.id.sub_title);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iOnClick.onClick(getAdapterPosition());
            }
        });
    }

    public void onBind(ItemModel model) {
        this.title.setText(model.getTitle());
        this.subTitle.setText(model.getSubTitle());
        image.setImageResource(model.getImage());
    }

}
