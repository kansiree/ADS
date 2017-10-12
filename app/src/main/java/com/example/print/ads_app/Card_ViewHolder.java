package com.example.print.ads_app;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by print on 10/6/2017.
 */

public class Card_ViewHolder extends RecyclerView.ViewHolder {
    RelativeLayout card;
    ImageView card_image;
    TextView card_text;
    public Card_ViewHolder(View itemView) {
        super(itemView);
        card = itemView.findViewById(R.id.card_layout);
        card_image = itemView.findViewById(R.id.card_icon);
        card_text = itemView.findViewById(R.id.card_text);
    }
}
