package com.example.gra.gra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MyProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        final EditText aadharNo = (EditText)findViewById(R.id.etAadhar);
        final EditText phoneNo = (EditText)findViewById(R.id.etPhoneNo);
        final EditText emailAddr = (EditText)findViewById(R.id.etEmail);
        setEditTextFields(aadharNo, phoneNo, emailAddr);

        final Button updateButton = (Button)findViewById(R.id.bUpdateProfile);
        final Button changePswdButton = (Button)findViewById(R.id.bChangePswd);
    }

    private void setEditTextFields(EditText aadharNo, EditText phoneNo, EditText emailAddr) {
        aadharNo.setText(MyGlobalVariable.getMyAadharNumber());
        phoneNo.setText(MyGlobalVariable.getMobileNumber());
        emailAddr.setText(MyGlobalVariable.getEmail());
    }
}
