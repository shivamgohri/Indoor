package com.example.indoor;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.bogdwellers.pinchtozoom.ImageMatrixTouchHandler;

public class Block extends AppCompatActivity {

    int flag;
    ImageView image_floor3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.block);

        flag=-1;
        image_floor3 = findViewById(R.id.image3);

        Button floor0 = findViewById(R.id.floor0);
        Button floor1 = findViewById(R.id.floor1);
        Button floor2 = findViewById(R.id.floor2);
        Button floor3 = findViewById(R.id.floor3);
        final Button navigate = findViewById(R.id.navigate);

        floor0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag=0;

            }
        });

        floor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag=1;

            }
        });

        floor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag=2;

            }
        });

        floor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag=3;

                image_floor3.setVisibility(View.VISIBLE);
                image_floor3.setOnTouchListener(new ImageMatrixTouchHandler(Block.this));

            }
        });

        navigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==3){
                    AlertDialog.Builder builder = new AlertDialog.Builder(Block.this);
                    builder.setTitle("Choose an animal");

// add a list
                    String[] animals = {"horse", "cow", "camel", "sheep", "goat"};
                    builder.setItems(animals, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            switch (which) {
                                case 0: // horse
                                case 1: // cow
                                case 2: // camel
                                case 3: // sheep
                                case 4: // goat
                            }
                        }
                    });

// create and show the alert dialog
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
            }
        });



    }
}

