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
public class MenuTwo extends Fragment {

    TextView textView;
    public MenuTwo() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView.setMovementMethod(new ScrollingMovementMethod());
        String text = "<p class=\"p1\" style=\"text-align: left; margin: 0px; font-stretch: normal; font-size: 15px; line-height: normal;\"><font color=\"#FFFFFF\" size=\"3\" style=\"\" face=\"Arial, sans-serif\"><b>Legend</b>&nbsp;</font></p>" +
                "<p class=\"p1\" style=\"margin: 0px; font-stretch: normal; font-size: 15px; line-height: normal; text-align: center;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\"><br></font></p>" +
                "<p class=\"p1\" style=\"margin: 0px; font-stretch: normal; font-size: 15px; line-height: normal;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">&nbsp; &nbsp;- Blue Circles: Shows the locations of the Red Dots (Treasures).</font></p>" +
                "<p class=\"p1\" style=\"margin: 0px; font-stretch: normal; font-size: 15px; line-height: normal;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\"><br></font></p>" +
                "<p class=\"p1\" style=\"margin: 0px; font-stretch: normal; font-size: 15px; line-height: normal;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">&nbsp; &nbsp;- Red Dots: Shows the specific locations of the Treasures!</font></p>" +
                "<p class=\"p1\" style=\"margin: 0px; font-stretch: normal; font-size: 15px; line-height: normal;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\"><br></font></p>" +
                "<p class=\"p1\" style=\"margin: 0px; font-stretch: normal; font-size: 15px; line-height: normal;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">&nbsp; &nbsp;- Treasures near the surface = easier to get.</font></p>" +
                "<p class=\"p1\" style=\"margin: 0px; font-stretch: normal; font-size: 15px; line-height: normal;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\"><br></font></p>" +
                "<p class=\"p1\" style=\"margin: 0px; font-stretch: normal; font-size: 15px; line-height: normal;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">&nbsp; &nbsp;- Treasures near the bottom = harder and it might take some time to get.</font></p>" +
                "<p class=\"p1\" style=\"margin: 0px; font-stretch: normal; font-size: 15px; line-height: normal;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\"><br></font></p>" +
                "<p class=\"p1\" style=\"margin: 0px; font-stretch: normal; font-size: 15px; line-height: normal;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">&nbsp; &nbsp;- There are 15 total Treasure Items in the game, the below map screenshots will show you where to get them all. Note that some of the Sunken Items can be seen multiple times below, please study the maps carefully.</font></p>" +
                "<p class=\"p1\" style=\"margin: 0px; font-stretch: normal; font-size: 15px; line-height: normal;\"><br></p>" +
                "<p class=\"p1\" style=\"margin: 0px; font-stretch: normal; font-size: 15px; line-height: normal;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">&nbsp; &nbsp;- Note: The treasure (Radio) at the upper right corner is actually located on land, yup with those people. To reach that area, let your Shark jump as far as possible to the right (if you are coming from the left), then keep moving towards the center until you reach the Radio.</font></p>" +
                "<p class=\"p1\" style=\"margin: 0px; font-stretch: normal; font-size: 15px; line-height: normal;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\"><br></font></p>" +
                "<p class=\"p1\" style=\"text-align: left; margin: 0px; font-stretch: normal; font-size: 15px; line-height: normal;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\"><b>Some Tips</b></font></p>" +
                "<p class=\"p1\" style=\"text-align: left; margin: 0px; font-stretch: normal; font-size: 15px; line-height: normal;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\"><br></font></p>" +
                "<p class=\"p1\" style=\"margin: 0px; font-stretch: normal; font-size: 15px; line-height: normal;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\">&nbsp; &nbsp;- Note that you can't get all the treasures early game because the game developers designed that all Sharks will have their own depth limit, so only get what you can.</font></p>" +
                "<p class=\"p1\" style=\"margin: 0px; font-stretch: normal; font-size: 15px; line-height: normal;\"><font color=\"#FFFFFF\" size=\"3\" face=\"Arial, sans-serif\"><br></font></p><p class=\"p1\" style=\"margin: 0px; font-stretch: normal; font-size: 15px; line-height: normal;\"><font color=\"#FFFFFF\" size=\"3\" style=\"\" face=\"Arial, sans-serif\">&nbsp; &nbsp;- The number of treasures that you can get per run also depends on the survivability rate of your current shark and how you play them, but thankfully, you can also get them by doing multiple runs per day.</font></p>\n";
        textView.setText(Html.fromHtml(text));    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu_two, container, false);
        textView = view.findViewById(R.id.Two_text);
        return view;
    }

}
