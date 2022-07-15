package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Start_main extends AppCompatActivity{

    private FloatingActionButton camera_btn;
    private FloatingActionButton photo_btn;
    private FloatingActionButton heart_btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_main);

        Button confirm_btn = (Button) findViewById(R.id.confirm_btn);
        confirm_btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                startActivity(intent);
            }
        });

        camera_btn = findViewById(R.id.camera_btn);
        photo_btn = findViewById(R.id.photo_btn);
        heart_btn = findViewById(R.id.heart_btn);

        //카메라 플로팅 버튼 클릭
        camera_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Start_main.this, "카메라 버튼 클릭", Toast.LENGTH_SHORT).show();
            }
        });

        //사진 플로팅 버튼 클릭
        photo_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Start_main.this, "사진 버튼 클릭", Toast.LENGTH_SHORT).show();
            }
        });

        heart_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Start_main.this, "하트 버튼 클릭", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
