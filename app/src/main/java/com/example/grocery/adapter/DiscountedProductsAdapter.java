package com.example.grocery.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grocery.R;
import com.example.grocery.model.DiscountedProducts;

import java.util.ArrayList;


public class DiscountedProductsAdapter extends RecyclerView.Adapter<DiscountedProductsAdapter.DiscountedProductViewHolder>
        {


            Context context;
            ArrayList<DiscountedProducts> discountedProductsList;

            public DiscountedProductsAdapter(Context context, ArrayList<DiscountedProducts> discountedProductsList)
            {
                this.context = context;
                this.discountedProductsList = discountedProductsList;
            }

            @NonNull
            @Override
            public DiscountedProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

                View view= LayoutInflater.from(context).inflate(R.layout.discounted_list_items,parent,false);

                return new DiscountedProductViewHolder(view);
            }

            @Override
            public void onBindViewHolder(@NonNull DiscountedProductViewHolder holder, int position) {
                holder.discountImageView.setImageResource(discountedProductsList.get(position).imageurl);

            }

            @Override
            public int getItemCount() {
                return 5;
            }

            public  static  class DiscountedProductViewHolder extends  RecyclerView.ViewHolder
            {

                ImageView discountImageView;
                public DiscountedProductViewHolder(@NonNull View itemView) {
                    super(itemView);

                    discountImageView= itemView.findViewById(R.id.discountImage);
                }
            }

        }
