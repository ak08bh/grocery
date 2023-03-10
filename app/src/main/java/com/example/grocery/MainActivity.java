package com.example.grocery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.grocery.adapter.DiscountedProductsAdapter;
import com.example.grocery.model.DiscountedProducts;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{

    RecyclerView discountRecyclerView;
    DiscountedProductsAdapter discountedProductsAdapter;
    ArrayList<DiscountedProducts> discountedProductsList;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        discountRecyclerView= findViewById(R.id.discountRecyclerView);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        discountRecyclerView.setLayoutManager(layoutManager);
        discountedProductsList= new ArrayList<>();

        discountedProductsList.add(new DiscountedProducts(1,R.drawable.discountberry));
        discountedProductsList.add(new DiscountedProducts(2,R.drawable.discountberry));
       discountedProductsList.add(new DiscountedProducts(3,R.drawable.discountberry));
        discountedProductsList.add(new DiscountedProducts(4,R.drawable.discountberry));
        discountedProductsList.add(new DiscountedProducts(5,R.drawable.discountberry));


discountedProductsAdapter = new DiscountedProductsAdapter(this,discountedProductsList);
discountRecyclerView.setAdapter(discountedProductsAdapter);

    }



}