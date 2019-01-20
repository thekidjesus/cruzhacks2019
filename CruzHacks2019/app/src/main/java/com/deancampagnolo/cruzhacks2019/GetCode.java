package com.deancampagnolo.cruzhacks2019;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;



public class GetCode extends AppCompatActivity {

AlertDialog.Builder b;
EditText input;
String email;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_code);

        /* email input

        b = new AlertDialog.Builder(this);
        b.setTitle("Enter email boi");
        input= new EditText(this);
        b.setView(input);
        b.setPositiveButton("Enter", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                email=input.getText().toString();
                Toast.makeText(getApplicationContext(),"Check your email!",Toast.LENGTH_LONG).show();
            }
        });*/

    }

    public void onButtonClicked(View v){
        switch(v.getId()){
            case R.id.GetCode:
                //TODO Implement

                //user needs to input email address
                //b.show();


                break;

            case R.id.ContinueToSubmit:
                startActivity(new Intent(this, SubmitLocation.class));
                break;
        }
    }
}
