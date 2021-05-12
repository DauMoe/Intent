package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.intent.model.student;

import java.util.Arrays;

public class SecondActivity extends AppCompatActivity {
    private TextView tv_show;
    private ImageView img_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv_show = findViewById(R.id.tv_show);
        img_show = findViewById(R.id.img_show);

        //Get intent data
        Intent intent = getIntent();
        String n = intent.getStringExtra("name");
        int a = intent.getIntExtra("age", 0);
        String[] s = intent.getStringArrayExtra("subject");
        student st = (student) intent.getSerializableExtra("student");
        img_show.setImageResource(st.getImgSrc());
        tv_show.setText("Name: "+n + "\nAge: "+a + "\nSubject: "+ Arrays.toString(s));
    }
}