package com.example.homely;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class CartActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CartItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        recyclerView = findViewById(R.id.recycleView_cart);
        adapter = new CartItemAdapter(this);

        LinearLayoutManager layout = new LinearLayoutManager(CartActivity.this, LinearLayoutManager.VERTICAL, false);

        adapter.setData(getListItemInCart());
        recyclerView.setLayoutManager(layout);
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<CartItem> getListItemInCart() {
        ArrayList<CartItem> list = new ArrayList<>();

        Product p1 = new Product("Counch", 259.0, "A couch is a large piece of furniture that can seat several people comfortably. It is usually placed in a living room or a family room, where people can relax, watch TV, or socialize.", R.drawable.counch_1);
        Product p2 = new Product("TV Stand", 29.0, "A couch is a large piece of furniture that can seat several people comfortably. It is usually placed in a living room or a family room, where people can relax, watch TV, or socialize.", R.drawable.tv_stand_1);
        Product p3 = new Product("Microwave", 121.0, "A couch is a large piece of furniture that can seat several people comfortably. It is usually placed in a living room or a family room, where people can relax, watch TV, or socialize.", R.drawable.microwave_1);
        Product p4 = new Product("Dinning table", 315.50, "A couch is a large piece of furniture that can seat several people comfortably. It is usually placed in a living room or a family room, where people can relax, watch TV, or socialize.", R.drawable.table_2);

        list.add(new CartItem(p1, 1));
        list.add(new CartItem(p2, 2));
        list.add(new CartItem(p3, 3));
        list.add(new CartItem(p4, 4));

        return list;
    }
}