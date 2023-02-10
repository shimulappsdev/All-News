package com.example.allnews.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.allnews.R;
import com.example.allnews.adapter.NewsAdapter;
import com.example.allnews.databinding.FragmentJobBinding;
import com.example.allnews.model.News;

import java.util.ArrayList;
import java.util.List;

public class JobFragment extends Fragment {
    public JobFragment() {
        // Required empty public constructor
    }

    private FragmentJobBinding binding;
    List<News> newsList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentJobBinding.inflate(getLayoutInflater(), container, false);

        newsList = new ArrayList<>();

        newsList.add(new News("Saptahik Chakrir Khabor", "https://othoeb.com/saptahik-chakrir-khobor-potrika/", R.drawable.saptahikchakrirkhobor));
        newsList.add(new News("Chakrir Dak", "https://govjobscircular.com/saptahik-chakrir-khobor/", R.drawable.chakrirdak));
        newsList.add(new News("BD Jobs Today", "https://www.bdjobstoday.com/", R.drawable.bdjobstoday));
        newsList.add(new News("NRB Jobs", "https://www.nrbjobs.com/", R.drawable.nrbjobs));
        newsList.add(new News("Skill Jobs", "https://skill.jobs/", R.drawable.skilljobs));

        NewsAdapter adapter = new NewsAdapter(getContext(),newsList);
        binding.newsRecyclerView.setAdapter(adapter);

        return binding.getRoot();
    }
}