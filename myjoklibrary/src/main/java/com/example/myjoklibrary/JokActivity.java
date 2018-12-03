package com.example.myjoklibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class JokActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jok);

        Intent intent= getIntent();
        textView = findViewById(R.id.Lib_text);

        textView.setText(intent.getStringExtra("joke"));
    }
}
