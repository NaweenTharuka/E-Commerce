package com.example.foodex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AdminCategoryActivity extends AppCompatActivity {

    private ImageView dairy, drinks, fish, fruits, icecream, meat, sausage, vegetables, cereal, biscuits, confection, alcohol;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        dairy=(ImageView) findViewById(R.id.dairy);
        drinks=(ImageView) findViewById(R.id.drinks);
        fish=(ImageView) findViewById(R.id.fish);
        fruits=(ImageView) findViewById(R.id.fruits);
        icecream=(ImageView) findViewById(R.id.icecream);
        meat=(ImageView) findViewById(R.id.meat);
        sausage=(ImageView) findViewById(R.id.sausage);
        vegetables=(ImageView) findViewById(R.id.vegetables);
        cereal=(ImageView) findViewById(R.id.cereal);
        biscuits=(ImageView) findViewById(R.id.biscuits);
        confection=(ImageView) findViewById(R.id.confection);
        alcohol=(ImageView) findViewById(R.id.alcohol);



        dairy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","dairy");
                startActivity(intent);
            }
        });

        drinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","drinks");
                startActivity(intent);
            }
        });

        fish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","fish");
                startActivity(intent);
            }
        });

        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","fruits");
                startActivity(intent);
            }
        });

        icecream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","icecream");
                startActivity(intent);
            }
        });

        meat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","meat");
                startActivity(intent);
            }
        });

        sausage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","sausage");
                startActivity(intent);
            }
        });

        vegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","vegetables");
                startActivity(intent);
            }
        });

        cereal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","cereal");
                startActivity(intent);
            }
        });

        biscuits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","biscuits");
                startActivity(intent);
            }
        });

        confection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","confection");
                startActivity(intent);
            }
        });

        alcohol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","alcohol");
                startActivity(intent);
            }
        });
    }
}
