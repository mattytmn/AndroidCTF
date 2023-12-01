package com.mattytmn.easyandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mattytmn.easyandroid.R;

public class SubmitFlagActivity extends AppCompatActivity {

    // Activity to submit final flag to server to verify the value
    // Construct URL from encrypted value

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_flag);
    }
}