package com.example.gra.gra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class govtOffcHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_govt_offc_home);

        Button bViewGrievance = (Button) findViewById(R.id.btViewGrievances);
        Button bBlockUser = (Button) findViewById(R.id.btBlockUser);
        Button bUpdateEmergency = (Button) findViewById(R.id.btUpdateEmergency);

        bViewGrievance.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent = new Intent(govtOffcHomeActivity.this,GOGrievanceActivity.class);
                govtOffcHomeActivity.this.startActivity(registerIntent);
            }
        });

        bBlockUser.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent = new Intent(govtOffcHomeActivity.this,GOGrievanceActivity.class);
                govtOffcHomeActivity.this.startActivity(registerIntent);
            }
        });

        bUpdateEmergency.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent = new Intent(govtOffcHomeActivity.this,GOEmergencyActivity.class);
                govtOffcHomeActivity.this.startActivity(registerIntent);
            }
        });
    }
}
