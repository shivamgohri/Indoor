package com.example.indoor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Sub_building extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_building);

        Button block1 = findViewById(R.id.block1);
        Button block2 = findViewById(R.id.block2);
        Button block3 = findViewById(R.id.block3);

        block1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sub_building.this,Block.class);
                startActivity(intent);
            }
        });

        block2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sub_building.this,Block.class);
                startActivity(intent);
            }
        });

        block3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sub_building.this,Block.class);
                startActivity(intent);
            }
        });


    }

}
