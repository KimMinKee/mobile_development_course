package com.example.exploringmethodoverloading;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("Info ", printStuff(10));

        Log.i("Info ", printStuff("John Doe"));

        Log.i("Info ", printStuff(10,"Jane Doe"));
    }

    private String printStuff(int myInt){
        return "The parameter for printStuff is int = " +myInt;

    }

    private String printStuff (String myString) {
        return "The parameter for printStuff is String = " + myString;

    }

    private String printStuff (int myInt, String myString) {
        return "The parameters for printStuff is int = " + myInt + ", " + "String = " + myString;

    }

}
