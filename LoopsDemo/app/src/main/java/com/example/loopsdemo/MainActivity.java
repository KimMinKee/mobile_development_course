package com.example.loopsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void countUp(View v){
        Toast.makeText(this, "Count up, Success, Check Log.", Toast.LENGTH_SHORT) .show();
        Log.i("Message:", "In countUp Method");

        int x=0;

        while(true){

            x++;
            Log.i("x=", ""+x);

            if (x == 9) {
                break;
            }
        }
    }

    public void countDown(View v){
        Toast.makeText(this, "Count down, Success, Check Log.", Toast.LENGTH_SHORT) .show();
        Log.i("Message:", "In countDown Method");

        int x=10;

        while(true){

            x--;
            Log.i("x=", "" +x );

            if (x == 1) {
                break;
            }
        }
    }

    public void nested(View v){
        Toast.makeText(this, "Nested, Success", Toast.LENGTH_SHORT) .show();
        Log.i("Message:", "In nested Method");

        for (int i=0; i<10; i++){
            for (int j=10; j>0; j--){
                Log.i("i = " + i, "j = " + j);
            }
        };
    }
}
