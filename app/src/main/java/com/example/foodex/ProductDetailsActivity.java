package com.example.foodex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;
import com.rey.material.widget.FloatingActionButton;
import com.rey.material.widget.ImageView;
import com.rey.material.widget.TextView;

public class ProductDetailsActivity extends AppCompatActivity {
    private FloatingActionButton addToCartBtn;
    private ImageView productImage;
    private ElegantNumberButton numberButton;
    private TextView productPrice,productDescription,productName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        addToCartBtn = (FloatingActionButton) findViewById(R.id.add_product_to_cart);
        numberButton = (ElegantNumberButton) findViewById(R.id.number_btn);
        productImage = (ImageView) findViewById(R.id.product_image_details);
        productName = (TextView) findViewById(R.id.product_name_details);
        productDescription = (TextView) findViewById(R.id.product_description_details);
        productPrice = (TextView) findViewById(R.id.product_price_details);
    }
}
