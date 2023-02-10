package com.example.allnews;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import com.example.allnews.adapter.FragmentAdapter;
import com.example.allnews.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    FragmentManager fragmentManager;
    FragmentAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        fragmentManager = getSupportFragmentManager();
        adapter = new FragmentAdapter(fragmentManager,100);
        binding.viewPager.setAdapter(adapter);
        binding.tabLayout.setupWithViewPager(binding.viewPager,true);


    }

    @Override
    public void onBackPressed() {
        ShowAlert();
    }

    private void ShowAlert() {
        AlertDialog.Builder alertdialog = new  AlertDialog.Builder(MainActivity.this);
        alertdialog.setIcon(R.mipmap.ic_launcher);
        alertdialog.setTitle("Exit");
        alertdialog.setMessage("Are you sure?");
        alertdialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "Exit", Toast.LENGTH_SHORT).show();
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });
        alertdialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        AlertDialog dialog = alertdialog.create();
        dialog.show();

    }
}