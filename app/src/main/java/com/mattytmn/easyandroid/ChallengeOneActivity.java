package com.mattytmn.easyandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.mattytmn.easyandroid.R;

public class ChallengeOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge_one);

        Intent intent = getIntent();

        // Function that checks secret value

        // Toast hint: Static secrets are bad

        }

    public void submitFlag(View view){
        Context context = getApplicationContext();
        EditText text = (EditText) findViewById(R.id.editTextFlagOne);
        String value = text.getText().toString();
        String ans = getString(R.string.f14g_0n3);
        TextView ans_box = (TextView) findViewById(R.id.textViewAnswer1);
        if(value.equals(ans)){
//            int duration = Toast.LENGTH_SHORT;
//            Toast toast = Toast.makeText(context, ans, duration);
//            toast.show();
            ans_box.setText("CORRECT");
        }
        else{
            int duration = Toast.LENGTH_SHORT;
            ans_box.setText("INCORRECT");
        }

    }
    public void showHint(View view){
        Context context = getApplicationContext();
        CharSequence text = "What is the worst place to store secrets?";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}