package com.example.komputer.epsonerrorcodes;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //to disable rotation of screen
    }

    public void onButtonClick(View w) {
        EditText editText = (EditText) findViewById(R.id.editText); //getting text from user
        TextView textView = (TextView) findViewById(R.id.textView); //textView is a display
        Spinner spinner = (Spinner) findViewById(R.id.spinner); //object spinner
        String err = (editText.getText().toString()); //assignment of error typed by user to String err
        String epsonChosen = (String)spinner.getSelectedItem(); //reading spinner, = String.valueOf(spinner.getSelectedItem());

        switch(epsonChosen){//displaying accurate info according to choice of user
            case "Epson 9800/7800":
            case "Epson 9880/7880":
            case "Epson 9450/7450":
            {
                textView.setText(Error7800.check7800(err));
                break;
            }
            case "Epson 9600/7600":
            {
                textView.setText(Error7600.check7600(err));
                break;
            }
            case "Epson 4800/4880":
            case "Epson 4450/4400":
            {
                textView.setText(Error4800.check4800(err));
                break;
            }
            case "Epson 4000":
            {
                textView.setText(Error4000.check4000(err));
                break;
            }
            default:
            {
                textView.setText("Switch error!");
                break;
            }


        }//switch


    }//onButtonClick
}
