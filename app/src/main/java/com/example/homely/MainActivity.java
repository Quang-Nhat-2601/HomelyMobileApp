package com.example.homely;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;

    private BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView_flashsale);
        productAdapter = new ProductAdapter(this);

        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        productAdapter.setData(getListProduct());
        recyclerView.setAdapter(productAdapter);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                return true;
            }
        });

        navigationView = findViewById(R.id.bottom_nav);
        navigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.menu_home:
                        break;
                    case R.id.menu_cart:
                        Intent i = new Intent(MainActivity.this, CartActivity.class);
                        startActivity(i);
                        break;
                    case R.id.menu_profile:
                        Toast.makeText(MainActivity.this, "Go To Profile", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });
    }

    private ArrayList<Product> getListProduct() {
        ArrayList<Product> list = new ArrayList<>();
        Product p1 = new Product("Counch", 259.0, "A couch is a large piece of furniture that can seat several people comfortably. It is usually placed in a living room or a family room, where people can relax, watch TV, or socialize.", R.drawable.counch_1);
        Product p2 = new Product("TV Stand", 29.0, "A couch is a large piece of furniture that can seat several people comfortably. It is usually placed in a living room or a family room, where people can relax, watch TV, or socialize.", R.drawable.tv_stand_1);
        Product p3 = new Product("Microwave", 121.99, "A couch is a large piece of furniture that can seat several people comfortably. It is usually placed in a living room or a family room, where people can relax, watch TV, or socialize.", R.drawable.microwave_1);
        Product p4 = new Product("Dinning table", 315.50, "A couch is a large piece of furniture that can seat several people comfortably. It is usually placed in a living room or a family room, where people can relax, watch TV, or socialize.", R.drawable.table_2);
        Product p5 = new Product("Counch Special", 459.0, "A couch is a large piece of furniture that can seat several people comfortably. It is usually placed in a living room or a family room, where people can relax, watch TV, or socialize.", R.drawable.counch_2);
        Product p6 = new Product("Kabu Table", 169.0, "A couch is a large piece of furniture that can seat several people comfortably. It is usually placed in a living room or a family room, where people can relax, watch TV, or socialize.", R.drawable.table_4);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        return list;
    }
}