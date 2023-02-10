package com.example.allnews.viewholder;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.allnews.R;

public class NewsViewHolder extends RecyclerView.ViewHolder {

    public ImageView recyclerImage;

    public NewsViewHolder(@NonNull View itemView) {
        super(itemView);
        recyclerImage = itemView.findViewById(R.id.recyclerImage);
    }
}
