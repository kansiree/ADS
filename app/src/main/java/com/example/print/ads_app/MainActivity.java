package com.example.print.ads_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity {
    public static InterstitialAd interstitialAd;
    public static AdRequest adRequest1;
    AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().
                replace(R.id.MainActivities,new MainPage()).commit();
        adView = (AdView)findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).addTestDevice("D35920536DA5B844062DBE9D5C22D428").build();
        adView.loadAd(adRequest);

        interstitialAd = new InterstitialAd(getApplicationContext());
        adRequest1 = new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).addTestDevice("A92764B84BE3A26450D358E83EE9557D").build();
        interstitialAd.setAdUnitId("ca-app-pub-8549639420372799/1967421820");
        System.out.println("Load: "+interstitialAd.isLoaded());
        interstitialAd.loadAd(adRequest1);
    }
}
