package com.example.allnews;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.example.allnews.databinding.ActivityWebViewBinding;
import com.example.allnews.model.News;

public class WebViewActivity extends AppCompatActivity {

    ActivityWebViewBinding binding;
    String name;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWebViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        url = intent.getStringExtra("webLink");
        binding.newsPaperNameTV.setText(name);

        binding.newsWebView.getSettings().setJavaScriptEnabled(true);
        binding.newsWebView.loadUrl(url);

        binding.backBtn.setOnClickListener(view -> {
            ShowAlert();
        });


        binding.newsWebView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                binding.progressBar.setVisibility(View.VISIBLE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                binding.progressBar.setVisibility(View.GONE);
            }
        });

        binding.newsWebView.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
                binding.progressBar.setProgress(newProgress);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.top_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){

            case R.id.reload:
                Toast.makeText(this, "Refreshing...", Toast.LENGTH_SHORT).show();
                binding.newsWebView.reload();
                break;

            case R.id.exit:
                AlertDialog.Builder alertdialog = new  AlertDialog.Builder(WebViewActivity.this);
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
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {

        if (binding.newsWebView.canGoBack()){
            binding.newsWebView.goBack();
        }else {
            ShowAlert();
        }
    }

    private void ShowAlert() {

        AlertDialog.Builder builder = new AlertDialog.Builder(WebViewActivity.this);
        builder.setTitle("Exit from "+name);
        builder.setMessage("Are You Sure?");

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();

    }
}