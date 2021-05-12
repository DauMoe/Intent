package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.intent.model.student;

public class MainActivity extends AppCompatActivity {
    private Button btn_open;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_open = findViewById(R.id.btn_open);

        btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int age = 22;
                String[] sub = {"OOP", "Graphic computer", "Android"};
                //open second activity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                String name = "Hello Iam moe";
                intent.putExtra("name", name);
                intent.putExtra("age", age);
                intent.putExtra("subject", sub);
                student st = new student(R.drawable.img1);
                intent.putExtra("student", st);
                startActivity(intent); //start lauch second activity
            }
        });
    }
}