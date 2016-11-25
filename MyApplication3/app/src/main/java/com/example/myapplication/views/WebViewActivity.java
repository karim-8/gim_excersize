package com.example.myapplication.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.myapplication.R;

public class WebViewActivity extends AppCompatActivity {

    WebView webView;
    int postion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        webView = (WebView)findViewById(R.id.full_web_view);

        webView.setWebViewClient(new MyBrowser());

        Bundle extras = getIntent().getExtras();


        if (extras != null)
        {
            postion = extras.getInt("postion2");
            //Toast.makeText(DetailsActivity.this," "+postion,Toast.LENGTH_SHORT).show();
            //textView.setText(postion);

            switch (postion) {

                case 0:
                    //textView2.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));

                    webView.getSettings().setLoadsImagesAutomatically(true);
                    webView.getSettings().setJavaScriptEnabled(true);
                    webView.loadUrl("http://www.besthealthmag.ca/best-you/fitness/what-to-know-before-you-join-a-gym/");
                    break;
                case 1:

                    webView.getSettings().setLoadsImagesAutomatically(true);
                    webView.getSettings().setJavaScriptEnabled(true);
                    webView.loadUrl("https://www.buzzfeed.com/robfranklin/eat-more-maca?utm_term=.epeLyeenjx#.goWkW33PZA");
                    break;

                case 2:

                    webView.getSettings().setLoadsImagesAutomatically(true);
                    webView.getSettings().setJavaScriptEnabled(true);
                    webView.loadUrl("https://www.youtube.com/watch?v=JBKej6n_A9I");
                    break;

    }
}



    }


    class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }}