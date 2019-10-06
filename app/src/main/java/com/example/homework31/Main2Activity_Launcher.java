package com.example.homework31;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hw2android1second.R;

public class Main2Activity_Launcher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2__launcher);

        TextView textView = findViewById(R.id.last_result_field_view);
        Intent intent1 = getIntent();
        String text = intent1.getStringExtra("number_text");
        String text2 = intent1.getStringExtra("number_text2");
        String text3 = intent1.getStringExtra("number_text3");
        textView.setText(text + text2 + text3);

    }

    public void onCalculatorEnterForResult(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent, null);

    }
}
