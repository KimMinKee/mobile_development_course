package com.example.minkeekimassignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int number;

    EditText numberInput;

    Button buttonTop;
    Button buttonBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberInput = (EditText) findViewById(R.id.numberInput);

        buttonTop = (Button) findViewById(R.id.buttonTop);
        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = Integer.valueOf(numberInput.getText().toString());

                countUp (numberInput);
            }
        });
        buttonBottom = (Button) findViewById(R.id.buttonBottom);
        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = Integer.valueOf(numberInput.getText().toString());

                countDown (numberInput);
            }
        });
    }

    public void countUp (View v){
        if (number >= 1 && number <= 10){
            while(true) {
                Toast.makeText(this, getText(number++), Toast.LENGTH_SHORT) .show();
                number++;

                if (number == 11) {
                    break;
                }
            }
        }

        else {
            Toast.makeText(this, "Number value MUST be 1-10", Toast.LENGTH_SHORT) .show();
        }
    }

    public void countDown (View v){
        if(number >= 1 && number <= 10) {
            while(true){
                Toast.makeText(this, getText(number--), Toast.LENGTH_SHORT) .show();
                number--;

                if (number == 0) {
                    break;
                }
            }
        }

        else {
            Toast.makeText(this, "Number value MUST be 1-10", Toast.LENGTH_SHORT) .show();
        }
    }
}
