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
public class MenuOne extends Fragment {

    TextView textView;
    public MenuOne() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView.setMovementMethod(new ScrollingMovementMethod());
        String text = "<div style=\"text-align: left;\"><font size=\"3\" color=\"#ffffff\" face=\"Arial, sans-serif\" style=\"\"><b style=\"\">Hunting Gemfish</b></font></div><div style=\"text-align: left;\">" +
                "<div style=\"\"><ul style=\"\"><li style=\"\"><font face=\"Arial, sans-serif\" size=\"3\" color=\"#ffffff\">\t\t\tYou can only get up to 3 gems/diamonds per game run, so after reaching 2 or 3,&nbsp;</font>" +
                "<font face=\"Arial, sans-serif\" color=\"#ffffff\" size=\"3\">just let your shark die. Start a new game run again, but this time, do not go back to where you found those previous gems/diamonds because it is unlikely to appear at that locations again.</font></li>" +
                "<li><font face=\"Arial, sans-serif\" size=\"3\" color=\"#ffffff\">" + "\t\t\tWait for a while or wait until you are able to collect the new Daily Reward. If you&nbsp;</font>" +
                "<font face=\"Arial, sans-serif\" color=\"#ffffff\" size=\"3\">did, then it is now ok to revisit those previous Gemfish locations</font>.</li>" +
                "<li><font face=\"Arial, sans-serif\" size=\"3\" color=\"#ffffff\">\t\t\tThe fastest way to earn Gems or Diamonds, is to hunt all Gemfish around the map.<br></font></li>" +
                "<li><font face=\"Arial, sans-serif\" size=\"3\" color=\"#ffffff\">See screenshot above for sample Gemfish.<br></font></li>" +
                "<li><font face=\"Arial, sans-serif\" size=\"3\" color=\"#ffffff\">\t\t\tFirst, unlock the Great White Shark to easily dash around the right most section of&nbsp;</font><font face=\"Arial, sans-serif\" size=\"3\" color=\"#ffffff\">the map (this area is full of Gemfish!) Make sure that you have the \"Basic Map\" item too.</font></li>" +
                "<li><font face=\"Arial, sans-serif\" size=\"3\" color=\"#ffffff\">\t\t\tUse the maps below to locate those Gemfish. They spawn in random locations, so&nbsp;</font><font face=\"Arial, sans-serif\" size=\"3\" color=\"#ffffff\">if they are not in there, just try the other locations.</font></li>" +
                "</ul></div></div><div style=\"\"><font size=\"3\" color=\"#ffffff\" face=\"Arial, sans-serif\"><b>Notes:</b></font></div><div style=\"\"><ul style=\"\">" +
                "<li style=\"\"><font face=\"Arial, sans-serif\" size=\"3\" color=\"#ffffff\">\t\t\tThe Maps above isn't complete and I did not include the left most part of the mapbecause it has the least number of Gemfish.</font></li>" +
                "<li style=\"\"><font face=\"Arial, sans-serif\" style=\"\" size=\"3\" color=\"#ffffff\">Don't forget to claim your Daily Rewards! You can get 5 there too.</font></li></ul></div>\n";
        textView.setText(Html.fromHtml(text));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu_one,container,false);
        textView = view.findViewById(R.id.One_text);
        return view;
    }

}
