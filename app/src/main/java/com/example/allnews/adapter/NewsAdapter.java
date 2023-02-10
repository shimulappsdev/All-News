package com.example.allnews.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.allnews.R;
import com.example.allnews.WebViewActivity;
import com.example.allnews.model.News;
import com.example.allnews.viewholder.NewsViewHolder;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsViewHolder> {

    private Context context;
    private List<News> newsList;

    public NewsAdapter(Context context, List<News> newsList) {
        this.context = context;
        this.newsList = newsList;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NewsViewHolder(LayoutInflater.from(context).inflate(R.layout.news_list_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {

        News news = newsList.get(position);
        holder.recyclerImage.setImageResource(news.getImage());

        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(context, WebViewActivity.class);
            intent.putExtra("name",news.getName());
            intent.putExtra("webLink",news.getWebLink());
            context.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }
}
