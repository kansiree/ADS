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
public class MenuFoure extends Fragment {

    TextView textView;
    public MenuFoure() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView.setMovementMethod(new ScrollingMovementMethod());
        String text = "<div style=\"font-size: 18.6667px;\"><div><span style=\"color: rgb(255, 255, 255); font-family: Arial, sans-serif; font-size: medium;\"><font color=\"#FFFFFF\">1. TAKE ADVANTAGE OF THE GOLD RUSH!</font></span><br></div><div><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\"><br></font></div><div><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\">• Each shark that you’ll control has a different points total that’s needed to reach a certain milestone. Each shark also has a different amount of time where the Gold Rush points multiplier stays active. You might want to purchase some shark accessories that extend the time duration for your shark’s Gold Rush.</font></div><div><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\"><br></font></div><div><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\">• When your Gold Rush is active, go nuts and just feast on as many creatures as possible before it goes away. If you access to the game’s entire map, then you should make good use of your Gold Rush points multiplier by swimming into the bottom right most section of the game’s world. There’s a good amount of Gulper, Blob and Angler Fish to feast on and get more points for.</font></div></div><div style=\"font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\"><br></font></div><div style=\"font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\"><div style=\"\"><font color=\"#FFFFFF\">2. Where the Heck are Those Angler and Gulper Fish?</font></div><div style=\"\"><br></div><div style=\"\"><font color=\"#FFFFFF\">• Got your map? You’re looking to eat up 10 Angler and Gulper fish for those two separate missions, right? Well, you’ll have to find those Angler Fish down in some of the lower locations. For instance, you’ll find a good amount of Angler Fish in a undersea cavern that’s full of spiky corners.</font></div><div style=\"\"><br></div><div style=\"\"><font color=\"#FFFFFF\">• Refer to your basic map again and point to the cave that’s farthest on the right. You’ll notice it since it’s right near the bottom of the map near the Dartboard. This location will provide you with the Gulper Fish you need to eat.</font></div><div style=\"\"><br></div><div style=\"\"><font color=\"#FFFFFF\">3. The Best Way to Deal With Submarines</font></div><div style=\"\"><br></div><div style=\"\"><font color=\"#FFFFFF\">• Submarines are pretty powerful enemies that can shoot your shark down if you aren’t too careful. The only way to take these sea behemoths down is simply by boosting into its front side. Move fast and ram ’em.</font></div><div style=\"\"><br></div><div style=\"\"><font color=\"#FFFFFF\">• Taking submarines down without getting damaged a ton means you’ll just have to get the jump on ’em.</font></div><div style=\"\"><br></div><div style=\"\"><font color=\"#FFFFFF\">4. The Megalodon Shark is the Only Shark Who Can Eat Certain Fish and Objects</font></div><div style=\"\"><br></div><div style=\"\"><font color=\"#FFFFFF\">• If you’t have the Megalodon Shark in your possession yet, then you shouldn’t make it habit to try and consume jellyfish, boats, mines or any other massive obstacles. The Megalodon Shark is the only shark capable of eating things such as these.</font></div><div style=\"\"><br></div><div style=\"\"><font color=\"#FFFFFF\">• If you’re all like “FORGET THAT, I CAN STILL TAKE THESE OBSTACLES ON EVEN WITHOUT THE MEGALODON!,” then you’ll need to purchase certain types of gear that will protect your lower level sharks. Purchase the Antidote if you’re looking to take on Jellyfish and the Flak Jacket if you’re looking to protect yourself from mine explosions.</font></div><div style=\"\"><br></div><div style=\"\"><font color=\"#FFFFFF\">• As for how to deal with boats without access to the Megalodon Shark, you’re going to have to boost up on the ship and eat everyone on it.</font></div><div style=\"\"><br></div><div style=\"\"><font color=\"#FFFFFF\">5. These are the Growth Point Totals Needed to Reach New Levels for Your Shark</font></div><div style=\"\"><font color=\"#FFFFFF\">Hungry Shark Evolution&nbsp;</font></div><div style=\"\"><br></div><div style=\"\"><font color=\"#FFFFFF\">• As you go through the game chomping on everything that comes your way, you’ll amass more and more growth points. These growth points play a direct role in leveling up your shark and changing them into fiercer shark types.</font></div><div style=\"\"><br></div><div style=\"\"><font color=\"#FFFFFF\">• You’ll need 1000 growth points to level up to the Reef Shark, 2000 growth points for the Mako Shark (costs 1500 coins), 3,950 growth points for the Hammerhead Shark (costs 6000 coins), 7,350 growth points for the Tiger Shark (costs 15,000), 14,500 growth points for the Great White Shark (costs 35,000 coins) and 42,550 growth points for the almighty Megalodon Shark (50,000 coins).</font></div><div style=\"\"><br></div><div style=\"\"><div style=\"color: rgb(102, 102, 102); font-family: &quot;Lucida Sans Unicode&quot;, &quot;Lucida Grande&quot;, sans-serif; font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\">6. 1st Things 1st – Watch Those Free Video Trailers for Extra Coins and Gems</font></div><div style=\"color: rgb(102, 102, 102); font-family: &quot;Lucida Sans Unicode&quot;, &quot;Lucida Grande&quot;, sans-serif; font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\"><br></font></div><div style=\"color: rgb(102, 102, 102); font-family: &quot;Lucida Sans Unicode&quot;, &quot;Lucida Grande&quot;, sans-serif; font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\">• Before you head out into the sea and start wreaking havoc, make sure you tap into the free coins and gems shop. You can locate it by tapping the diamonds total option (it’s located near the right hand corner on the evolve screen). Each day comes with a select number of trailers to watch. You’ll be granted one gem for every video you choose to watch.</font></div><div style=\"color: rgb(102, 102, 102); font-family: &quot;Lucida Sans Unicode&quot;, &quot;Lucida Grande&quot;, sans-serif; font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\"><br></font></div><div style=\"color: rgb(102, 102, 102); font-family: &quot;Lucida Sans Unicode&quot;, &quot;Lucida Grande&quot;, sans-serif; font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\">• As you watch these videos, you’ll also be granted 100 coins per watch. Make this a daily occurrence before you start playing. But be warned – there will be days when there won’t be any videos to watch.</font></div><div style=\"color: rgb(102, 102, 102); font-family: &quot;Lucida Sans Unicode&quot;, &quot;Lucida Grande&quot;, sans-serif; font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\"><br></font></div><div style=\"color: rgb(102, 102, 102); font-family: &quot;Lucida Sans Unicode&quot;, &quot;Lucida Grande&quot;, sans-serif; font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\">• Make sure you like the game’s Facebook page, too. You’ll gain five free gems for doing so.</font></div><div style=\"color: rgb(102, 102, 102); font-family: &quot;Lucida Sans Unicode&quot;, &quot;Lucida Grande&quot;, sans-serif; font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\"><br></font></div><div style=\"color: rgb(102, 102, 102); font-family: &quot;Lucida Sans Unicode&quot;, &quot;Lucida Grande&quot;, sans-serif; font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\">7. The Best Ways to Deal With Giant Enemy Crabs</font></div><div style=\"color: rgb(102, 102, 102); font-family: &quot;Lucida Sans Unicode&quot;, &quot;Lucida Grande&quot;, sans-serif; font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\"><br></font></div><div style=\"color: rgb(102, 102, 102); font-family: &quot;Lucida Sans Unicode&quot;, &quot;Lucida Grande&quot;, sans-serif; font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\">• Giant Crabs can be located on the basic map by finding each one’s lair on the left-most section. Just seek out those dungeon entrance gates for these big boss fights.</font></div><div style=\"color: rgb(102, 102, 102); font-family: &quot;Lucida Sans Unicode&quot;, &quot;Lucida Grande&quot;, sans-serif; font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\"><br></font></div><div style=\"color: rgb(102, 102, 102); font-family: &quot;Lucida Sans Unicode&quot;, &quot;Lucida Grande&quot;, sans-serif; font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\">• A fully, leveled-up Megalodon Shark can deal with giant crabs much easier, but you can still take them down with other sharks. For instance, you can purchase the Crab Form accessory and deal more damage to giant enemy crabs. Note that the bigger the crab, the longer the range of its attacks are.</font></div><div style=\"color: rgb(102, 102, 102); font-family: &quot;Lucida Sans Unicode&quot;, &quot;Lucida Grande&quot;, sans-serif; font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\"><br></font></div><div style=\"color: rgb(102, 102, 102); font-family: &quot;Lucida Sans Unicode&quot;, &quot;Lucida Grande&quot;, sans-serif; font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\">• Provoke a giant enemy crab, make sure you dodge it’s pincer strikes 3 times to expose it’s glowing weak point. Pull off a boost attack every time. The giant enemy crab’s weak points will change colors to signify its health (Green means full health, orange means 50-percent health and red means close to death).</font></div><div style=\"color: rgb(102, 102, 102); font-family: &quot;Lucida Sans Unicode&quot;, &quot;Lucida Grande&quot;, sans-serif; font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\"><br></font></div><div style=\"color: rgb(102, 102, 102); font-family: &quot;Lucida Sans Unicode&quot;, &quot;Lucida Grande&quot;, sans-serif; font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\">8. Get Yourself a Baby Shark!</font></div><div style=\"color: rgb(102, 102, 102); font-family: &quot;Lucida Sans Unicode&quot;, &quot;Lucida Grande&quot;, sans-serif; font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\"><br></font></div><div style=\"color: rgb(102, 102, 102); font-family: &quot;Lucida Sans Unicode&quot;, &quot;Lucida Grande&quot;, sans-serif; font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\">• Baby Sharks are awesome since they swim alongside your main shark and help you eat whatever’s in your way. You can unlock a baby shark by purchasing it with either coins or gems. Once you select your main shark for play, go into the shop for the shark you want and buy its baby shark version.</font></div><div style=\"color: rgb(102, 102, 102); font-family: &quot;Lucida Sans Unicode&quot;, &quot;Lucida Grande&quot;, sans-serif; font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\"><br></font></div><div style=\"color: rgb(102, 102, 102); font-family: &quot;Lucida Sans Unicode&quot;, &quot;Lucida Grande&quot;, sans-serif; font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\">• As far as baby shark stats go, check out the full list below:</font></div><div style=\"color: rgb(102, 102, 102); font-family: &quot;Lucida Sans Unicode&quot;, &quot;Lucida Grande&quot;, sans-serif; font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\"><br></font></div><div style=\"color: rgb(102, 102, 102); font-family: &quot;Lucida Sans Unicode&quot;, &quot;Lucida Grande&quot;, sans-serif; font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\">– Baby Reef Shark: +5 Stamina (Costs 1000 Coins)</font></div><div style=\"color: rgb(102, 102, 102); font-family: &quot;Lucida Sans Unicode&quot;, &quot;Lucida Grande&quot;, sans-serif; font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\">– Baby Mako Shark: +10 Stamina (Costs 20 Gems)</font></div><div style=\"color: rgb(102, 102, 102); font-family: &quot;Lucida Sans Unicode&quot;, &quot;Lucida Grande&quot;, sans-serif; font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\">– Baby Hammerhead Shark: +15 Stamina (Costs 60 Gems)</font></div><div style=\"color: rgb(102, 102, 102); font-family: &quot;Lucida Sans Unicode&quot;, &quot;Lucida Grande&quot;, sans-serif; font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\">– Baby Tiger Shark: +20 Stamina (Costs 130 Gems)</font></div><div style=\"color: rgb(102, 102, 102); font-family: &quot;Lucida Sans Unicode&quot;, &quot;Lucida Grande&quot;, sans-serif; font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\">– Baby Great White Shark: +25 Stamina (Costs 300 Gems)</font></div><div style=\"color: rgb(102, 102, 102); font-family: &quot;Lucida Sans Unicode&quot;, &quot;Lucida Grande&quot;, sans-serif; font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\">– Baby Megalodon Shark: +30 Stamina (Costs 900 Gems)</font></div><div style=\"color: rgb(102, 102, 102); font-family: &quot;Lucida Sans Unicode&quot;, &quot;Lucida Grande&quot;, sans-serif; font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\"><br></font></div><div style=\"color: rgb(102, 102, 102); font-family: &quot;Lucida Sans Unicode&quot;, &quot;Lucida Grande&quot;, sans-serif; font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\">9. Make it a Habit to Collect the Daily Reward Treasure Chest Everyday</font></div><div style=\"color: rgb(102, 102, 102); font-family: &quot;Lucida Sans Unicode&quot;, &quot;Lucida Grande&quot;, sans-serif; font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\"><br></font></div><div style=\"color: rgb(102, 102, 102); font-family: &quot;Lucida Sans Unicode&quot;, &quot;Lucida Grande&quot;, sans-serif; font-size: 18.6667px;\"><font size=\"3\" face=\"Arial, sans-serif\" color=\"#ffffff\">• In the tunnel below and to the left of where the Reef Shark starts is the daily treasure chest. It opens at midnight and gives 100 coins on day 1, 200 coins on day 2, 300 coins on day 3, 400 coins on day 4 and 5 gems on day 5 before starting the cycle again. Well worth a quick trip using the Reef Shark every day!</font></div></div></font></div></body>\n";
        textView.setText(Html.fromHtml(text));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu_foure, container, false);
        textView = (TextView)view.findViewById(R.id.foure_text);
        return view;
    }

}
