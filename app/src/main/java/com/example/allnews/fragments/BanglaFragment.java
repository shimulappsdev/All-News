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
import com.example.allnews.model.News;

import java.util.ArrayList;
import java.util.List;

public class BanglaFragment extends Fragment {

    public BanglaFragment() {
        // Required empty public constructor
    }

    private FragmentBanglaBinding binding;
    List<News> newsList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBanglaBinding.inflate(getLayoutInflater(), container, false);

        newsList = new ArrayList<>();

        newsList.add(new News("Prothom Alo", "https://www.prothomalo.com/", R.drawable.prothomalo));
        newsList.add(new News("Bangladesh Protidin", "https://www.bd-pratidin.com/", R.drawable.bangladeshprotidin));
        newsList.add(new News("Ittefaq", "https://www.ittefaq.com.bd/", R.drawable.ettefak));
        newsList.add(new News("Kaler Kantha", "https://www.kalerkantho.com/", R.drawable.kalerkantha));
        newsList.add(new News("Noya Diganta", "https://www.dailynayadiganta.com/", R.drawable.noyadiganta));
        newsList.add(new News("Amar Sangbad", "https://www.amarsangbad.com/", R.drawable.amadersangbad));
        newsList.add(new News("Protidiner Sangbad", "https://www.protidinersangbad.com/", R.drawable.protidinersangbad));
        newsList.add(new News("Jugantor", "https://www.jugantor.com/", R.drawable.jugantar));
        newsList.add(new News("Doink Sangram", "https://dailysangram.com/", R.drawable.doiniksangram));
        newsList.add(new News("Manab Jamin", "https://mzamin.com/", R.drawable.manabjamin));
        newsList.add(new News("Amader Somoy", "https://www.dainikamadershomoy.com/", R.drawable.amdersomy));
        newsList.add(new News("Samakal", "https://samakal.com/", R.drawable.samakal));
        newsList.add(new News("Doinik Janakantha", "https://www.dailyjanakantha.com/", R.drawable.doinikjanakantha));
        newsList.add(new News("Jay Jay Din", "https://www.jaijaidinbd.com/", R.drawable.jayjaydin));
        newsList.add(new News("Bhorer Kagoj", "https://www.bhorerkagoj.com/", R.drawable.vorerkagojlive));
        newsList.add(new News("Arthaniteer Kagoj", "https://www.arthoniteerkagoj.com/", R.drawable.arthanaitikkagaj));
        newsList.add(new News("Inqlub", "https://www.dailyinqilab.com/", R.drawable.inqlaub));
        newsList.add(new News("Manabkantha", "https://www.manobkantha.com.bd/", R.drawable.manabkantha));
        newsList.add(new News("Supravat", "https://suprobhat.com/", R.drawable.supravat));
        newsList.add(new News("Bangladesh Journal", "https://www.bd-journal.com/", R.drawable.bangladeshjopurnal));
        newsList.add(new News("Alokito Bangladesh", "https://www.alokitobangladesh.com/", R.drawable.alokitbangladesh));
        newsList.add(new News("Ajker Bazar", "https://ajkerbazzar.com/", R.drawable.ajkerbaza));
        newsList.add(new News("Amader Arthanitir", "https://amaderorthoneeti.com/new/", R.drawable.amaderarthaniti));
        newsList.add(new News("Bangladesh Post", "https://bangladeshpost.net/", R.drawable.bangladeshpost));
        newsList.add(new News("Sarejamin Barta", "https://sorejominbarta.com/", R.drawable.sarejaminbarta));
        newsList.add(new News("Doinik KhabarParta", "https://khoborpatrabd.com/", R.drawable.doinikkhabarparta));
        newsList.add(new News("Vorer Pata", "https://www.dailyvorerpata.com/", R.drawable.vorerpata));
        newsList.add(new News("Somoyer Alo", "https://www.shomoyeralo.com/", R.drawable.somoyeralo));
        newsList.add(new News("Natun Barta", "https://natun-barta.com/", R.drawable.natonbarta));
        newsList.add(new News("Share Biz", "https://sharebiz.net/", R.drawable.shearbij));
        newsList.add(new News("Doinik Bartaman", "https://dailybartoman.com/", R.drawable.doinikbartaman));
        newsList.add(new News("Ajkaler Khabar", "https://www.ajkalerkhobor.net/", R.drawable.ajkalerkhabr));
        newsList.add(new News("Gana Kantha", "http://www.gonokantho.com/", R.drawable.ganakantha));
        newsList.add(new News("The Daily Star", "https://www.thedailystar.net/", R.drawable.thedailystar));
        newsList.add(new News("Daily Obserber", "https://observerbd.com/", R.drawable.thedailyobserber));
        newsList.add(new News("Desh Rupantar", "https://www.deshrupantor.com/", R.drawable.deshrupantar));
        newsList.add(new News("Bangladesher Khabar", "https://bangladesherkhabor.net/", R.drawable.bangladesherkhabar));
        newsList.add(new News("Bangladeshe Bulletin", "https://bd-bulletin.com/", R.drawable.bangladeshbuletin));
        newsList.add(new News("Doinik Jagaran", "https://dailyjagaran.com/", R.drawable.doinikjagaran));
        newsList.add(new News("Dhaka Tribune", "https://www.dhakatribune.com/", R.drawable.dhakatribune));
        newsList.add(new News("Business Post", "https://businesspostbd.com/", R.drawable.businesspost));
        newsList.add(new News("Ajker Partika", "https://www.ajkerpatrika.com/", R.drawable.ajkerpartika));

        NewsAdapter adapter = new NewsAdapter(getContext(), newsList);
        binding.newsRecyclerView.setAdapter(adapter);

        return binding.getRoot();
    }
}