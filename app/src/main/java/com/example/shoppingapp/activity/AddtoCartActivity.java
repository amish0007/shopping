package com.example.shoppingapp.activity;

import static com.example.shoppingapp.activity.MainActivity.listCart;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.shoppingapp.adapter.CartAdapter;
import com.example.shoppingapp.databinding.ActivityAddtoCartBinding;
import com.example.shoppingapp.model.ProductModel;

import java.util.ArrayList;
import java.util.List;

public class AddtoCartActivity extends AppCompatActivity {

    ActivityAddtoCartBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityAddtoCartBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        CartAdapter cartAdapter = new CartAdapter(listCart);
        binding.rvCart.setAdapter(cartAdapter);

        binding.imgCartBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        if(cartAdapter.getItemCount()==0)
        {
            Toast.makeText(this, "Your Shopsy Cart is empty", Toast.LENGTH_SHORT).show();
        }
    }
}