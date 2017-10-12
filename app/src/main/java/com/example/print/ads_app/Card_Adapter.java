package com.example.print.ads_app;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by print on 10/6/2017.
 */

public class Card_Adapter extends RecyclerView.Adapter<Card_ViewHolder> {
    ArrayList<Card_model> card_models;
    Context context;
    OnClickItem item;

    interface OnClickItem{
        public void OnItemClick(View view,int position);
    }

    public void setItem(OnClickItem item){this.item=item;}
    public Card_Adapter.OnClickItem getItemClick(){return item;}
    public void setItemClick(Card_Adapter.OnClickItem item){setItem(item);}


    public Card_Adapter(ArrayList<Card_model> card_models, Context context) {
        this.card_models = card_models;
        this.context = context;
    }

    @Override
    public Card_ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_view,null);
       Card_ViewHolder viewHolder = new Card_ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(Card_ViewHolder holder, final int position) {
        Card_model model = card_models.get(position);
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getItemClick().OnItemClick(view,position);
            }
        });
        holder.card_text.setText(model.getText());
        holder.card_image.setImageResource(model.getImage());
    }

    @Override
    public int getItemCount() {
        return card_models.size();
    }
}
