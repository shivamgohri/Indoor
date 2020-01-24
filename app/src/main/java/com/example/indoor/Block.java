package com.example.indoor;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.bogdwellers.pinchtozoom.ImageMatrixTouchHandler;

public class Block extends AppCompatActivity {

    int flag;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.block);


        flag=-1;
        image = findViewById(R.id.image);
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

                image.setImageResource(R.drawable.floor2);
                image.setVisibility(View.VISIBLE);
                image.setOnTouchListener(new ImageMatrixTouchHandler(Block.this));
            }
        });

        floor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag=2;

                image.setImageResource(R.drawable.floor3);
                image.setVisibility(View.VISIBLE);
                image.setOnTouchListener(new ImageMatrixTouchHandler(Block.this));
            }
        });

        floor3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                flag=3;

                image.setImageResource(R.drawable.floor4);
                image.setVisibility(View.VISIBLE);
                image.setOnTouchListener(new ImageMatrixTouchHandler(Block.this));

            }
        });

        navigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==3){
                    AlertDialog.Builder builder = new AlertDialog.Builder(Block.this);
                    builder.setTitle("Choose Destination");
                    String[] animals = {"414","Lab 418","Lab 419","Lab 410","Lab 411","Lab 412"};
                    builder.setItems(animals, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            switch (which) {
                                case 0: Intent intent = new Intent(Block.this,Open.class);
                                        startActivity(intent);
                                case 1: Intent intent1 = new Intent(Block.this,Open.class);
                                        startActivity(intent1);
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                            }
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }

                if(flag==2){
                    AlertDialog.Builder builder = new AlertDialog.Builder(Block.this);
                    builder.setTitle("Choose Destination");
                    String[] animals = {"314","Lab 318","Lab 319","Lab 310","Lab 311","Lab 312"};
                    builder.setItems(animals, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            switch (which) {
                                case 0: Intent intent = new Intent(Block.this,Open.class);
                                    startActivity(intent);
                                case 1: Intent intent1 = new Intent(Block.this,Open.class);
                                    startActivity(intent1);
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                            }
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }

                if(flag==1){
                    AlertDialog.Builder builder = new AlertDialog.Builder(Block.this);
                    builder.setTitle("Choose Destination");
                    String[] animals = {"214","Lab 218","Lab 219","Lab 210","Lab 211","Lab 212"};
                    builder.setItems(animals, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            switch (which) {
                                case 0: Intent intent = new Intent(Block.this,Open.class);
                                    startActivity(intent);
                                case 1: Intent intent1 = new Intent(Block.this,Open.class);
                                    startActivity(intent1);
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                            }
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }



            }
        });



    }
}

