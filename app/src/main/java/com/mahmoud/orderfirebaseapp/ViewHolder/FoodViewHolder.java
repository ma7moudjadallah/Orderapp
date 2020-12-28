package com.mahmoud.orderfirebaseapp.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mahmoud.orderfirebaseapp.R;
import com.mahmoud.orderfirebaseapp.interfaces.ItemClickListener;
import com.nineoldandroids.view.ViewHelper;

public class FoodViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView food_name ;
    public ImageView food_image;

    private ItemClickListener itemClickListener;
    public FoodViewHolder(@NonNull View itemView) {
        super(itemView);
        food_name = itemView.findViewById(R.id.food_name);
        food_image= itemView.findViewById(R.id.food_image);

        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v,getAdapterPosition(),false);

    }
}
