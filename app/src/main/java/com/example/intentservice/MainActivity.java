package com.example.intentservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startServiceButton = findViewById(R.id.startServiceButton);

        startServiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the IntentService when the button is clicked
                Intent intent = new Intent(MainActivity.this, MyIntentService.class);
                intent.putExtra("data", "Some data to pass to the service");
                startService(intent);
            }
        });
    }
}