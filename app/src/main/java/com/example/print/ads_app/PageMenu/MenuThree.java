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
public class MenuThree extends Fragment {

    TextView textView;
    public MenuThree() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView.setMovementMethod(new ScrollingMovementMethod());
        String text = "<div style=\"font-size: 18.6667px;\"><b><span style=\"color: #FFFFFF; font-family: Arial, sans-serif; font-size: medium; \"><font color=\"#FFFFFF\">Recommendations:</font></span><br></b></div>" +
                "<div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">&nbsp; &nbsp; &nbsp;- To unlock the Super Mission 5, unlock and purchase Great White Shark.</font></div>" +
                "<div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">&nbsp; &nbsp; &nbsp;- Max your Great White Shark's Lvl, and upgrade Bite/Speed/Boost if you want.</font></div>" +
                "<div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">&nbsp; &nbsp; &nbsp;- Same method with Megalodon if you are using it.</font></div>" +
                "<div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">&nbsp; &nbsp; &nbsp;- You must have a Basic Map too!</font></div>" +
                "<div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">&nbsp; &nbsp; &nbsp;- Buy a Baby Shark or any Items that will help you eat more, or gain more points.</font></div>" +
                "<div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\"><br></font></div>" +
                "<div style=\"font-size: 18.6667px;\"><div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\"><b>Score/Points Multipliers</b></font></div>" +
                "<div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">&nbsp; &nbsp; &nbsp;- Eat many creatures in quick succession to gain Point Multipliers.</font></div>" +
                "<div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">&nbsp; &nbsp; &nbsp;- While Gold Rush is active, try to maintain the x64 Multiplier as long as you can,</font><span style=\"color: #FFFFFF; font-family: Arial, sans-serif; font-size: medium;\"><font color=\"#FFFFFF\">to gain over 100,000 or 300,000 points per Gold Rush!</font></span></div><div style=\"font-size: 18.6667px;\"><font face=\"Arial, sans-serif\"><br></font></div>" +
                "<div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\"><b>Creatures with High Points</b></font></div>" +
                "<div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">&nbsp; &nbsp; &nbsp;- Some notable creatures with good points are Blob Fish, Gulper Fish and the&nbsp;</font><span style=\"color: #FFFFFF; font-family: Arial, sans-serif; font-size: medium;\"><font color=\"#FFFFFF\">Angler Fish. You can see them all in one place at the bottom right most area of the map. So if you are able to activate Gold Rush! with a good number of Multipliers there, you can easily rake above 100,000 or 200,000 Points per dash!</font></span></div>" +
                "<div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">&nbsp; &nbsp; &nbsp;- Kempy Bass, Gem Fish, Evil Great White, and more are some of those uncommon&nbsp;</font><span style=\"color: #FFFFFF; font-family: Arial, sans-serif; font-size: medium;\"><font color=\"#FFFFFF\">fishes around that packs with some great points too.</font></span></div><div style=\"font-size: 18.6667px;\"><font face=\"Arial, sans-serif\"><br></font></div><div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\"><b>Gems/Diamonds</b></font></div>" +
                "<div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">&nbsp; &nbsp; &nbsp;- Aside from the combos above, survival is also an important part. The longer you&nbsp;</font><span style=\"color: #FFFFFF; font-family: Arial, sans-serif; font-size: medium;\"><font color=\"#FFFFFF\">stay alive, the faster your energy will deplete! So if you want to get the 1 Million mark, you need to be faster too!</font></span></div><div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">&nbsp; &nbsp; &nbsp;- If your shark dies, you have the option to revive it using your Gems or Diamonds.</font></div>" +
                "<div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">This is optional and it is recommended to only use it if you are near your target points.</font></div>" +
                "<div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">&nbsp; &nbsp; &nbsp;- First revive will take 1 Gem/Diamond, second revive = 2, third = 4 and so on.</font></div></div>" +
                "<div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\"><br></font></div><div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\"><b>Share your Accessory Set</b></font></div>" +
                "<div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">&nbsp; &nbsp; &nbsp;- Also share your current accessory set below (comment section) for getting High&nbsp;</font><span style=\"color: #FFFFFF; font-family: Arial, sans-serif; font-size: medium;\"><font color=\"#FFFFFF\">Scores to give other players some ideas!&nbsp;</font></span></div>" +
                "<div style=\"font-size: 18.6667px;\"><font face=\"Arial, sans-serif\"><b><br></b></font></div>" +
                "<div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\"><b>Gold</b> <b>Rush</b></font></div>" +
                "<div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">&nbsp; &nbsp; &nbsp;- Awarded each time you reach a points milestone. As well as coins, it triggers an&nbsp;</font><span style=\"color: #FFFFFF; font-family: Arial, sans-serif; font-size: medium;\"><font color=\"#FFFFFF\">extra points multiplier.</font></span></div>" +
                "<div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">&nbsp; &nbsp; &nbsp;- While Gold Rush is active, quickly move around and eat all creatures that you will&nbsp;</font><span style=\"color: #FFFFFF; font-family: Arial, sans-serif; font-size: medium;\"><font color=\"#FFFFFF\">encounter. Use your Boosts wisely and combo with Multipliers to get higher scores!</font></span></div>" +
                "<div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">&nbsp; &nbsp; &nbsp;- Use your Basic Map to move into a good source of food (preferably on seabed),</font><span style=\"color: #FFFFFF; font-family: Arial, sans-serif; font-size: medium;\"><font color=\"#FFFFFF\">and to avoid dead ends like caves with long tunnel entrances, unless Gold Rush! is not active.</font></span></div>" +
                "<div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\"><br></font></div><div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\"><b>The Gold Rush Bar</b></font></div>" +
                "<div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">&nbsp; &nbsp; &nbsp;- Simply fill up the bar to activate Gold Rush!</font></div>" +
                "<div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">&nbsp; &nbsp; &nbsp;- Scoring points fills up the Goldrush bar. (So make the most of those multiplier&nbsp;</font><span style=\"color: #FFFFFF; font-family: Arial, sans-serif; font-size: medium;\"><font color=\"#FFFFFF\">bonus's awarded for eating streaks)</font></span></div>" +
                "<div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">&nbsp; &nbsp; &nbsp;- The new system spawns lots more fish during a Goldrush than before!</font></div>" +
                "<div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">&nbsp; &nbsp; &nbsp;- The new system gives you Max health when Goldrush is triggered!</font></div>" +
                "<div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">&nbsp; &nbsp; &nbsp;- The new system makes you invincible during Goldrush! (you even get points&nbsp;</font><span style=\"color: #FFFFFF; font-family: Arial, sans-serif; font-size: medium;\"><font color=\"#FFFFFF\">for hitting mines!)</font></span></div>" +
                "<div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">&nbsp; &nbsp; &nbsp;- Each time you trigger a Goldrush the Goldrush Bar fills up 7% making it quicker&nbsp;</font><span style=\"color: #FFFFFF; font-family: Arial, sans-serif; font-size: medium;\"><font color=\"#FFFFFF\">to get the next one. (up to a maximum of 50%)</font></span></div>" +
                "<div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">&nbsp; &nbsp; &nbsp;- Each shark takes a different amount of points to fill the bar up 100%.</font></div>" +
                "<div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">&nbsp; &nbsp; &nbsp;- Each shark has a different Gold Rush duration.</font></div>" +
                "<div style=\"font-size: 18.6667px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">&nbsp; &nbsp; &nbsp;- Equip accessories that gives \"Gold Rush + Seconds\" to extend the duration.</font></div>\n";
        textView.setText(Html.fromHtml(text));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu_three, container, false);
        textView = view.findViewById(R.id.Three_text);
        return view;
    }

}
