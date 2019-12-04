package com.pritesh.midterm_spacexdata_android.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.pritesh.midterm_spacexdata_android.R;

public class WebViewActivity extends AppCompatActivity
{

    public static String ARG_WEB_LINK = "weblink";
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        webView = findViewById(R.id.wvLaunchLink);

        WebViewActivity.this.setTitle("Loading...");

        if(getIntent().hasExtra(ARG_WEB_LINK))
        {
            webView.loadUrl(getIntent().getStringExtra(ARG_WEB_LINK));

            webView.setWebViewClient(new WebViewClient() {
                @Override
                public void onPageFinished(WebView view, String url) {
                    WebViewActivity.this.setTitle(view.getTitle());
                }
            });
        }
    }
}
