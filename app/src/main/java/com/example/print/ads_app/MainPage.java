package com.example.print.ads_app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.print.ads_app.PageMenu.MenuFive;
import com.example.print.ads_app.PageMenu.MenuFoure;
import com.example.print.ads_app.PageMenu.MenuOne;
import com.example.print.ads_app.PageMenu.MenuSix;
import com.example.print.ads_app.PageMenu.MenuThree;
import com.example.print.ads_app.PageMenu.MenuTwo;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import java.util.ArrayList;

/*
 * Created by print on 10/9/2017.
 */

public class MainPage extends Fragment {

    RecyclerView recyclerView;
    InterstitialAd interstitialAd;
    int CountPage=0;
    AdRequest adRequest;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(layoutManager);
        interstitialAd = new InterstitialAd(getContext());
        adRequest = new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).addTestDevice("D35920536DA5B844062DBE9D5C22D428").build();
        interstitialAd.setAdUnitId("ca-app-pub-8549639420372799/1967421820");

        Card_Adapter adapter = new Card_Adapter(setData(),getContext());
        adapter.setItemClick(new Card_Adapter.OnClickItem() {
            @Override
            public void OnItemClick(View view, int position) {
                interstitialAd.loadAd(adRequest);
                switch (position){
                    case 0:
                        if(interstitialAd.isLoaded()){
                            CountPage=0;
                            interstitialAd.show();
                        }else {
                            CountPage=0;
                        }
                        break;
                    case 1:
                        if(interstitialAd.isLoaded()){
                            CountPage=1;
                            interstitialAd.show();
                        }else {
                            CountPage=1;
                        }
                        break;
                    case 2:
                        if(interstitialAd.isLoaded()){
                            CountPage=2;
                            interstitialAd.show();

                        }else {
                            CountPage=2;
                        }
                        break;
                    case 3:
                        if(interstitialAd.isLoaded()){
                            CountPage=3;
                            interstitialAd.show();
                        }else {
                            CountPage=3;
                        }
                        break;
                    case 4:
                        if(interstitialAd.isLoaded()){
                            CountPage=4;
                            interstitialAd.show();
                        }else {
                            CountPage=4;
                        }
                        break;
                    case 5:
                        if(interstitialAd.isLoaded()){
                            CountPage=5;
                            interstitialAd.show();
                        }else {
                            CountPage=5;
                        }
                        break;
                }
            }
        });
        recyclerView.setAdapter(adapter);

        interstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                interstitialAd.show();
            }

            @Override
            public void onAdClosed() {
                super.onAdClosed();
                switch (CountPage){
                    case 0:
                        ChangPage(new MenuOne());
                        break;
                    case 1:
                        ChangPage(new MenuTwo());
                        break;
                    case 2:
                        ChangPage(new MenuThree());
                        break;
                    case 3:
                        ChangPage(new MenuFoure());
                        break;
                    case 4:
                        ChangPage(new MenuFive());
                        break;
                    case 5:
                        ChangPage(new MenuSix());
                        break;
                }
            }
        });
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_page, container, false);
        recyclerView = view.findViewById(R.id.List);

        return view;
    }

    private ArrayList<Card_model> setData(){
        int[] picture = {R.drawable.ic_1,R.drawable.ic_2,R.drawable.ic_3,
        R.drawable.ic_4,R.drawable.ic_5,R.drawable.ic_6};
        String[] text = {"How To Get Gem & Gem fish","Map Treasure","Make Score Over 1 Million","Cheats 9 Need You Know","Get Coin Technique","Crab Boss"};
        ArrayList<Card_model> models = new ArrayList<>();
        Card_model card_model;
        for(int i=0;i<picture.length;i++){
            card_model = new Card_model();
            card_model.setText(text[i]);
            card_model.setImage(picture[i]);
            models.add(card_model);
        }
        return models;
    }

    private void ChangPage(Fragment fragment){
      FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(R.id.MainActivities, fragment)
              .addToBackStack(null)
              .remove(this).commitAllowingStateLoss();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("WORKAROUND_FOR_BUG_19917_KEY", "WORKAROUND_FOR_BUG_19917_VALUE");
    }


}
