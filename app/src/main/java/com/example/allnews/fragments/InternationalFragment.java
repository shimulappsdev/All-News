package com.example.allnews.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.allnews.R;
import com.example.allnews.adapter.NewsAdapter;
import com.example.allnews.databinding.FragmentBanglaBinding;
import com.example.allnews.databinding.FragmentInternationalBinding;
import com.example.allnews.model.News;

import java.util.ArrayList;
import java.util.List;

public class InternationalFragment extends Fragment {

    public InternationalFragment() {
        // Required empty public constructor
    }

    private FragmentInternationalBinding binding;
    List<News> newsList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentInternationalBinding.inflate(getLayoutInflater(), container, false);

        newsList = new ArrayList<>();

        newsList.add(new News("BBC", "https://www.bbc.com/", R.drawable.bbc));
        newsList.add(new News("The New York Times", "https://www.nytimes.com/", R.drawable.thenewyorktimes));
        newsList.add(new News("The Washington Post", "https://www.washingtonpost.com/", R.drawable.washington));
        newsList.add(new News("China Daily", "https://www.chinadaily.com.cn/", R.drawable.chinadaily));
        newsList.add(new News("SMH", "https://www.smh.com.au/", R.drawable.smh));
        newsList.add(new News("Telegraph", "https://www.telegraph.co.uk/", R.drawable.telegraph));
        newsList.add(new News("The Time of India", "https://timesofindia.indiatimes.com/", R.drawable.thetimesofindia));
        newsList.add(new News("Dawn", "https://www.dawn.com/", R.drawable.dawn));
        newsList.add(new News("USA Today", "https://www.usatoday.com/", R.drawable.usatoday));
        newsList.add(new News("The Guardian", "https://www.theguardian.com/international", R.drawable.theguardian));
        newsList.add(new News("The Wall Street Journal", "https://www.wsj.com/", R.drawable.thewallstreetlogo));
        newsList.add(new News("New York Post", "https://nypost.com/", R.drawable.newyorkpost));
        newsList.add(new News("The Wall Street Journal Asia", "https://www.wsj.com/news/types/asia-news", R.drawable.wsjasia));
        newsList.add(new News("The Wall Street Journal Europe", "https://www.wsj.com/news/types/europe-news", R.drawable.wsjeurop));
        newsList.add(new News("The Irishecho", "https://www.irishecho.com/", R.drawable.theirishecho));
        newsList.add(new News("The Epoch Times", "https://www.theepochtimes.com/", R.drawable.theepochtimes));
        newsList.add(new News("The Cambodia Daily", "https://english.cambodiadaily.com/", R.drawable.thecomdiadaily));
        newsList.add(new News("The Christian Science Monitor", "https://www.csmonitor.com/", R.drawable.thechristiansciencemonitor));


        NewsAdapter adapter = new NewsAdapter(getContext(), newsList);
        binding.newsRecyclerView.setAdapter(adapter);

        return binding.getRoot();
    }
}