package com.example.lovo_kart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button)
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity2();
            }
        });
    }
    public void openactivity2 {
        Intent Intent = new Intent(this, openactivity2.class);
        start(Intent)
    }
}