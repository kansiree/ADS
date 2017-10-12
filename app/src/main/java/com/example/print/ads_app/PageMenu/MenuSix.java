package com.example.print.ads_app.PageMenu;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.print.ads_app.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MenuSix extends Fragment {

    TextView textView;
    public MenuSix() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView.setMovementMethod(new ScrollingMovementMethod());
        String text = "<div><div style=\"color: #FFFFFF; font-family: Arial, sans-serif; font-size: medium;\"><b><font color=\"#FFFFFF\">Defeating the Giant Crabs</font></b></div>" +
                "<div style=\"color: #FFFFFF; font-family: Arial, sans-serif; font-size: medium;\"><b><br></b></div>" +
                "<div style=\"color: #FFFFFF; font-family: Arial, sans-serif; font-size: medium;\"><font color=\"#FFFFFF\">\t\t\tThe Giant Crabs cannot be instantly eaten like other creatures in Hungry Shark Evolution, even though the largest playable sharks such as Megalodon and Big Daddy may rival them in size. The Giant Crab swipes at your shark with his pincers. You must dodge these pincers, while remaining in range of the crab. After the third swipe, the crab will become exhausted and will reveal his vulnerable \"Weak Spot\". Charging at the \"Weak Spot\" with boost will deal massive damage to the crab. How much damage depends on which shark you are playing as. If you take too long, he will recover and once again hide his weak spot. Repeat this until the crab is in agony, in which he will shriek in pain very loudly and allow you to launch your final attack at his back. He then breaks apart and you get the \"Super Snack!\", \"Mega Meal!\", or \"Giant Tryant!\" Accolades.</font></div>" +
                "<div style=\"color: #FFFFFF; font-family: Arial, sans-serif; font-size: medium;\"><br></div>" +
                "<div style=\"color: #FFFFFF; font-family: Arial, sans-serif; font-size: medium;\"><font color=\"#FFFFFF\">\t\t\tThe Crab Fork can help you kill the crab faster inflicting double damage to him, but it's not available on some devices. It costs 100 gems to purchase. Note: Top Secret Lab sharks don't have access to the accessory shop so they can't equip the crab fork.</font></div>" +
                "<div style=\"color: #FFFFFF; font-family: Arial, sans-serif; font-size: medium;\"><br></div><div style=\"color: rgb(255, 255, 255); font-family: Arial, sans-serif; font-size: medium;\"><font color=\"#FFFFFF\">\t\t\tAvoid using Top Secret Lab sharks except for the Robo Shark. The reasons are since the Electro Shark has an extremely short boost bar so it won't be able to move quickly to dodge the pincers or charge into the Giant Crab's weak spot in time and it has low health. Using the electric charges won't effect the Giant Crab either. The Ice Shark's boosting ability makes this shark move even slower than regular speed which means it will be very difficult to move out of the way of the pincers of the Giant Crabs. The Giant Crab is also immune to the freezing effect. Another factor is the Top Secret Lab sharks can't equip accessories like the crab fork or items that increase boost that standard sharks can equip. Depending on how many mines are left to be shot, the Robo Shark can be a reasonable choice as it has the health close to the Megalodon and the GW Shark and only has the health drain of a Great White Shark which is slower than the Megalodon. The Robo Shark can't boost underwater. However, it doesn't need to boost in order to hit submarines and Giant Crabs and can hit the weak spot just by swimming at a regular speed. If your Robo Shark has mines loaded it can fire the mines when the crab is revealing its weak spot.</font></div><div style=\"color: rgb(255, 255, 255); font-family: Arial, sans-serif; font-size: medium;\"><br></div>" +
                "<div style=\"color: #FFFFFF; font-family: Arial, sans-serif; font-size: medium;\"><font color=\"#FFFFFF\">\t\t\tYour hunger will go down as you fight the crab. It might be hard to eat and dodge the pincers at the same time. You might consider buying a baby to help you consume the crabs, tunas, and blobfish wandering nearby, as well as decreasing health drain.</font></div><div style=\"color: rgb(255, 255, 255); font-family: Arial, sans-serif; font-size: medium;\"><br></div>" +
                "<p class=\"p1\" style=\"margin: 0px 0px 15.2px; font-stretch: normal; font-size: 15px; line-height: normal;\"><font size=\"3\" style=\"\" face=\"Arial, sans-serif\" color=\"#ffffff\"><b>\t\t\tThe&nbsp;Crab Boss</b>&nbsp;is a massive crab that can be found inside the Crab Lair&nbsp;in Hungry Shark Evolution, and in an unknown area in Hungry Shark Part 2 (the area contains red mines). They are powerful enemies that are larger than most of the sharks.&nbsp;There are four types of Giant Crabs (from weakest to strongest):</font></p>" +
                "<ul class=\"ul1\" style=\"list-style-type: disc; font-size: 18.6667px;\"><li class=\"li2\" style=\"font-size: 15px; margin: 0px; font-stretch: normal;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\">\tRed Giant Crab</font></li>" +
                "<li class=\"li2\" style=\"font-size: 15px; margin: 0px; font-stretch: normal;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\">\tYellow Or Green Giant Crab</font></li>" +
                "<li class=\"li2\" style=\"font-size: 15px; margin: 0px; font-stretch: normal;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\">\tBlue Giant Crab</font></li>" +
                "<li class=\"li2\" style=\"font-size: 15px; margin: 0px; font-stretch: normal;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\">\tBlack Giant Crab (largest, can be fought for an unlimited number of times although requires 3-4 minutes to spawn).(It can also appear gray with yellow decorative stripes down the bottom).</font></li></ul></div>\n";
        textView.setText(Html.fromHtml(text));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu_six, container, false);
        textView = view.findViewById(R.id.six_text);
        return view;
    }

}
