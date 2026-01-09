package com.example.koszykowka3ppiatek;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewPunkty;
    private Button button1, button2,button3;
    private int punkty = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        textViewPunkty = findViewById(R.id.textViewPunkty);
        if(savedInstanceState != null){
            punkty = savedInstanceState.getInt("PUNKTY");
            textViewPunkty.setText(Integer.toString(punkty));
        }
        button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty++;
                        textViewPunkty.setText(String.valueOf(punkty));
                    }
                }
        );
        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty+=2;
                        textViewPunkty.setText(String.valueOf(punkty));
                    }
                }
        );
        button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty+=3;
                        textViewPunkty.setText(String.valueOf(punkty));
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