package com.example.koszykowka3ppiatek;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.koszykowka3ppiatek.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private int punkty = 0;
    ActivityMainBinding binding;//nazwa klasy od nazwy pliku activity_main.xml
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view  = binding.getRoot();
        setContentView(view);

        if(savedInstanceState != null){
            punkty = savedInstanceState.getInt("PUNKTY");
            binding.textViewPunkty.setText(Integer.toString(punkty));
        }
        binding.button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty++;
                        binding.textViewPunkty.setText(String.valueOf(punkty));
                    }
                }
        );
        binding.button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty+=2;
                        binding.textViewPunkty.setText(String.valueOf(punkty));
                    }
                }
        );
        binding.button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty+=3;
                        binding.textViewPunkty.setText(String.valueOf(punkty));
                    }
                }
        );

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("PUNKTY",punkty);
    }
}