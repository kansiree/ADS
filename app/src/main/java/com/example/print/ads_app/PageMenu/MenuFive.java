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
public class MenuFive extends Fragment {

    TextView textView;
    public MenuFive() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView.setMovementMethod(new ScrollingMovementMethod());
        String text = "<p class=\"p1\" style=\"margin: 0px 0px 16.1px; font-stretch: normal; font-size: 20px; line-height: normal;\"><b style=\"\"><font size=\"3\" color=\"#FFFFFF\" style=\"\" face=\"Arial, sans-serif\">Get coins easily</font></b></p>" +
                "<p class=\"p2\" style=\"margin: 0px 0px 19.5px; font-stretch: normal; font-size: 20px; line-height: normal;\"><ul style=\"font-size: 18.6667px;\">" +
                "<li><font size=\"3\" color=\"#FFFFFF\" face=\"Arial, sans-serif\">\t\t\tFirst be the reef shark.next go near the shore.when there is someone on the shore quickly jump up and eat them.go back into the water and do the process again and you will get a lot of coins and YEAH<br></font></li>" +
                "<li><font size=\"3\" color=\"#FFFFFF\" face=\"Arial, sans-serif\">\t\t\tTake the daily reward then set the dato one day later. Take the daily reward and do it again.<br></font></li>" +
                "<li><font size=\"3\" color=\"#FFFFFF\" face=\"Arial, sans-serif\">\t\t\tYou could also just find as many lost objects as you can(patience and determination is recommended and also hard work)<br></font></li>" +
                "<li><font size=\"3\" color=\"#FFFFFF\" face=\"Arial, sans-serif\">\t\t\tGo to a populated area with lots of fish and enter gold rush mode. Keep it as long as you can and every time you eat a golden fish you get coins! Works best with Megalodon and Great White<br></font></li>" +
                "<li><font size=\"3\" color=\"#FFFFFF\" face=\"Arial, sans-serif\">\t\t\tI got to the daily rewards chest as a reef shark. Once I get my daily reward I go into my settings on my IPhone and click on \"Set date &amp; time\" I put the clock one day and one minute earlier and go back to the game. Then I go back do the daily rewards chest and kept doing the process :3 Hope this helps! :)<br></font></li>" +
                "<li><font size=\"3\" color=\"#FFFFFF\" face=\"Arial, sans-serif\">\t\t\tAnswer from: swiftie Hey for some reason i actually found a golden shell somewhere deep and it gave me 10000 gold. if you want try looking for it. dunno how i found it. that golden shell is really you completing a super mission. stay close to the surface and travel from 1 end to another, works well with megalodon<br></font></li>" +
                "<li><font size=\"3\" color=\"#FFFFFF\" face=\"Arial, sans-serif\">\t\t\tThe most effective way is gold rush and to survive for ages (10mins+) and that will earn you a lot of money (also the reef shark seems to earn more survival money) I got 2000 from a 20 min run with the reef shark and 50,000 points =)</font></li></ul>" +
                "<div><p class=\"p1\" style=\"margin: 0px 0px 17.4px; font-stretch: normal; font-size: 26px; line-height: normal;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\"><b>Get more coins &amp; gems</b></font></p>" +
                "<p class=\"p2\" style=\"margin: 0px 0px 19.5px; font-stretch: normal; font-size: 20px; line-height: normal;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">\t\t\tTo get more gems, you can do one of two things. One of them is to find a gem fish, which is a fat green fish that only pops up every so often, in completely random places, although it usually tends to be in deeper, darker areas of the ocean, and the more advanced the shark, the more it tends to happen. You can also buy more gems at the store.</font></p>" +
                "<p class=\"p3\" style=\"margin: 0px; font-stretch: normal; font-size: 20px; line-height: normal; min-height: 24px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\"><b></b><br></font></p>" +
                "<p class=\"p2\" style=\"margin: 0px 0px 19.5px; font-stretch: normal; font-size: 20px; line-height: normal;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">\t\t\tThere are a number of ways to max out the coins. One of them is to stay alive for as long as you possibly can, to increase the survival bonus. Each minute that goes by causes the survival bonus to increase, and the more fish that you eat, the less fish that there will be for you to eat later (usually), so stretch out the eating of fish, people, pelicans, etc.</font></p>" +
                "<p class=\"p3\" style=\"margin: 0px; font-stretch: normal; font-size: 20px; line-height: normal; min-height: 24px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\"><b></b><br></font></p>" +
                "<p class=\"p2\" style=\"margin: 0px 0px 19.5px; font-stretch: normal; font-size: 20px; line-height: normal;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">\t\t\tAdditionally, there are various items that you can find and/or pick up along the stages, by searching along the bottom of the ocean and the bottom of various caves. There are 15 collection items per stage, each of which nets you 25 coins, and which you can pick up each time that you play. They are in the same locations each time, making them relatively easy to find time and time again. There is also the daily reward chest, which you can collect once per day, but which earns you hundreds of coins each time.</font></p>" +
                "<p class=\"p3\" style=\"margin: 0px; font-stretch: normal; font-size: 20px; line-height: normal; min-height: 24px;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\"><b></b><br></font></p><p class=\"p2\" style=\"margin: 0px 0px 19.5px; font-stretch: normal; font-size: 20px; line-height: normal;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">\t\t\tFinally, any edible creature (fish, crab, human, etc) with coins will be gold in color. Eat them to gain more coins, and eat enough of them in a short time to begin a gold rush, which temporarily turns ALL of the creatures in the water gold, allowing you to max out on coins for this duration.</font></p></div>\n";
        textView.setText(Html.fromHtml(text));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu_five, container, false);
        textView = view.findViewById(R.id.five_text);
        return view;
    }

}
