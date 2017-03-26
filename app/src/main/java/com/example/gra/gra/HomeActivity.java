package com.example.gra.gra;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.DialogInterface;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent intent = getIntent();

        final Button bLogComplaint = (Button) findViewById(R.id.bLogComplaint);
        final Button bMyComplaint = (Button) findViewById(R.id.bMyComplaint);
        final Button bMyprofile = (Button) findViewById(R.id.bMyProfile);
        final Button bEmergencyDials = (Button) findViewById(R.id.bEmergencyDials);
        final Button bContactUs = (Button) findViewById(R.id.bContactUs);

        bLogComplaint.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent complaintIntent = new Intent(HomeActivity.this,LogComplaintActivity.class);
                HomeActivity.this.startActivity(complaintIntent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Exit?")
                .setMessage("Are you sure you want to close the app?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }

                })
                .setNegativeButton("No", null)
                .show();
    }
}
