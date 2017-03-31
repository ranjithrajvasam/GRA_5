package com.example.gra.gra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MyGrievanceActivity extends AppCompatActivity {

    //handle my grievnance

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_grievance);

        final TextView response1=(TextView) findViewById(R.id.tvMyGrievance);
        Intent intent = getIntent();
        String answer = intent.getStringExtra("response_array");
        response1.setText(answer);
    }
}
