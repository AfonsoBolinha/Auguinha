package com.example.auguinha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView = (WebView) findViewById(R.id.my_webview);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://docs.google.com/spreadsheets/d/1Kogc-pd0DWvNiKr3_ffDArCDx438S7JsfXvkQpn9G9I/htmlembed/sheet?gid=0&range=D1");
    }
    public void openLink(View view) {
        WebView webView = (WebView) findViewById(R.id.my_webview);
        String url = "https://script.google.com/macros/s/AKfycbwh9D21VMLkyBauqq-wZVO3k7dl8yCIF2PPdvlyu52ox-kThlTgl-hpriALplTgZW3c/exec";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
        try {
            Thread.sleep(3000); // espera 3 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webView.reload();
    }
    public void reload(View view){
        WebView webView = (WebView) findViewById(R.id.my_webview);
        try {
            Thread.sleep(3000); // espera 3 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webView.reload();
    }
}