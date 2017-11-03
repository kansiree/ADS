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
import com.google.android.gms.ads.InterstitialAd;

import java.util.ArrayList;

import static com.example.print.ads_app.MainActivity.adRequest1;

/*
 * Created by print on 10/9/2017.
 */

public class MainPage extends Fragment {

    RecyclerView recyclerView;
    InterstitialAd interstitialAd=MainActivity.interstitialAd;
    int CountPage=0;
    int countClick=0;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(layoutManager);

        Card_Adapter adapter = new Card_Adapter(setData(),getContext());

        adapter.setItemClick(new Card_Adapter.OnClickItem() {
            @Override
            public void OnItemClick(View view, int position) {


                switch (position){
                    case 0:
                        if(MainActivity.interstitialAd.isLoaded()){
                            Loadfinish(0);
                            CountPage=0;
                        }else {
                            LoadFail(0);
                        }
                        break;
                    case 1:
                        if(MainActivity.interstitialAd.isLoaded()){
                            Loadfinish(1);
                            CountPage=1;

                        }else {
                            LoadFail(1);
                        }
                        break;
                    case 2:
                        if(MainActivity.interstitialAd.isLoaded()){
                            CountPage=2;
                            Loadfinish(2);
                        }else {
                            CountPage=2;
                            LoadFail(2);
                        }
                        break;
                    case 3:
                        if(MainActivity.interstitialAd.isLoaded()){
                            CountPage=3;
                            Loadfinish(3);
                        }else {
                            CountPage=3;
                            LoadFail(3);
                        }
                        break;
                    case 4:
                        if(MainActivity.interstitialAd.isLoaded()){
                            CountPage=4;
                            Loadfinish(4);
                        }else {
                            CountPage=4;
                            LoadFail(4);
                        }
                        break;
                    case 5:
                        if(MainActivity.interstitialAd.isLoaded()){
                            CountPage=5;
                            Loadfinish(5);
                        }else {
                            LoadFail(5);
                            CountPage=5;
                        }
                        break;
                }
            }
        });
        recyclerView.setAdapter(adapter);

        MainActivity.interstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                System.out.println("loadAd: "+MainActivity.interstitialAd.isLoaded());
            }

            @Override
            public void onAdClosed() {
                super.onAdClosed();
                MainActivity.interstitialAd.loadAd(adRequest1);
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

    private void Loadfinish(int index){
        switch (index){
            case 0:
                if(countClick==0){
                    MainActivity.interstitialAd.show();
                    countClick++;
                }
                else{
                    countClick++;
                    if(countClick>=4){
                        countClick=0;
                    }
                    ChangPage(new MenuOne());
                }
                break;
            case 1:
                if(countClick==0){
                    MainActivity.interstitialAd.show();
                    countClick++;
                }
                else{
                    countClick++;
                    if(countClick>=4){
                        countClick=0;
                    }
                    ChangPage(new MenuTwo());
                }
                break;
            case 2:
                if(countClick==0){
                    MainActivity.interstitialAd.show();
                    countClick++;
                }
                else{
                    countClick++;
                    if(countClick>=4){
                        countClick=0;
                    }
                    ChangPage(new MenuThree());
                }
                break;
            case 3:
                if(countClick==0){
                    MainActivity.interstitialAd.show();
                    countClick++;
                }
                else{
                    countClick++;
                    if(countClick>=4){
                        countClick=0;
                    }
                    ChangPage(new MenuFoure());
                }
                break;
            case 4:
                if(countClick==0){
                    MainActivity.interstitialAd.show();
                    countClick++;
                }
                else{
                    countClick++;
                    if(countClick>=4){
                        countClick=0;
                    }
                    ChangPage(new MenuFive());
                }
                break;
            case 5:
                if(countClick==0){
                    MainActivity.interstitialAd.show();
                    countClick++;
                }
                else{
                    countClick++;
                    if(countClick>=4){
                        countClick=0;
                    }
                    ChangPage(new MenuSix());
                }
                break;
        }
    }

    private void LoadFail(int index){
        switch (index){
            case 0:
                if(countClick>0){
                    countClick++;
                    if(countClick>=4){
                        countClick=0;
                    }
                }
                else if(countClick==0){
                    countClick++;
                }
                CountPage=0;
                ChangPage(new MenuOne());
                break;
            case 1:
                if(countClick>0){
                    countClick++;
                    if(countClick>=4){
                        countClick=0;
                    }
                }
                else if(countClick==0){
                    countClick++;
                }
                CountPage=0;
                ChangPage(new MenuTwo());
                break;
            case 2:
                if(countClick>0){
                    countClick++;
                    if(countClick>=4){
                        countClick=0;
                    }
                }
                else if(countClick==0){
                    countClick++;
                }
                CountPage=0;
                ChangPage(new MenuThree());
                break;
            case 3:
                if(countClick>0){
                    countClick++;
                    if(countClick>=4){
                        countClick=0;
                    }
                }
                else if(countClick==0){
                    countClick++;
                }
                CountPage=0;
                ChangPage(new MenuFoure());
                break;
            case 4:
                if(countClick>0){
                    countClick++;
                    if(countClick>=4){
                        countClick=0;
                    }
                }
                else if(countClick==0){
                    countClick++;
                }
                CountPage=0;
                ChangPage(new MenuFive());
                break;
            case 5:
                if(countClick>0){
                    countClick++;
                    if(countClick>=4){
                        countClick=0;
                    }
                }
                else if(countClick==0){
                    countClick++;
                }
                CountPage=0;
                ChangPage(new MenuSix());
                break;
        }

    }
}
