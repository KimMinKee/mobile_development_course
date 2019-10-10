package com.example.switchdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String moveCommand;
        moveCommand = "take sword";

        switch (moveCommand) {
            case "go north":
                Log.i("Info:", "Player: Moves to the North");
                break;
            case "go south":
                Log.i("Info:", "Player: Moves to the South");
                break;
            case "go east":
                Log.i("Info:", "Player: Moves to the East");
                break;
            case "go west":
                Log.i("Info:", "Player: Moves to the West");
                break;
            case "take sword":
                Log.i("Info:", "Player: Takes the Silver Sword");
                break;
            default:
                Log.i("Info:", "Sorry, I don't speak Elfish");
                break;
        }
    }
}
