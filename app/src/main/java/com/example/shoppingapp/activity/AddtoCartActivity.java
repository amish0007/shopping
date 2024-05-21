package com.example.shoppingapp.activity;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.shoppingapp.databinding.ActivityAddtoCartBinding;

public class AddtoCartActivity extends AppCompatActivity {

    ActivityAddtoCartBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityAddtoCartBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}