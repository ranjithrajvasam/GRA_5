package com.example.gra.gra;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by RAVI on 4/11/2017.
 */

public class Validation {

    public static boolean isValidPincode(String pincode){
        try{
            int pin = Integer.parseInt(pincode);
            return pincode.length() == 6;
        }
        catch (Exception e){
            return false;
        }
    }

    public static void showAlert(AppCompatActivity className, String msg, String btnMsg) {

        AlertDialog.Builder builder = new AlertDialog.Builder(className);
        builder.setMessage(msg)
                .setNegativeButton(btnMsg,null)
                .create()
                .show();
    }
}
