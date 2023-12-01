package com.mattytmn.easyandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mattytmn.easyandroid.R;

public class MainActivity extends AppCompatActivity {

    // FL4G{w3lc0me_to_tr15ky_bus1n3$$}
    // FL4G{
    // w3lc0me_
    // to_tr15ky_
    // bus1n3$$}
    // Once full flag is submitted, a secret email will be returned to submit

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startChallengeOne(View view){
        Intent intent = new Intent(this, ChallengeOneActivity.class);
        startActivity(intent);
    }

    public void startChallengeTwo(View view){
        // Don't start activity, instead export and open with adb
        // Toast saying TODO: implement this button
    }

    public void startChallengeThree(View view){
        Intent intent = new Intent(this, ChallengeThreeActivity.class);
        startActivity(intent);
    }
}