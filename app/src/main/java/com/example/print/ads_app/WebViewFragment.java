package com.example.print.ads_app;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WebViewFragment extends Fragment {
    WebView webView;
    public WebViewFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        webView.getSettings().setJavaScriptEnabled(true);
//        webView.loadUrl("http://www.google.com");

        String customHTML = "<html><body><h1> Hello </h1><body></html>";
        webView.loadData(customHTML,"text/html","UTF-8");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_web_view, container, false);
        webView = view.findViewById(R.id.webView);
        return view;
    }

}
