package com.mattytmn.easyandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.mattytmn.easyandroid.R;

public class ChallengeTwoActivity extends AppCompatActivity {

    // Launch activity with adb
    // Show flag not flag
    // encrypt flag using random value that can be extracted with frida/objection

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge_two);

    }

    public void showEncryptedFlag (View view){
        Context context = getApplicationContext();
        TextView ans_box = (TextView) findViewById(R.id.flagNotFlagtextView);
        EditText text = (EditText) findViewById(R.id.editTextFlagTwo);
        String value = text.getText().toString();
        String flagValue = getString(R.string.fl4g_Tw0);
        ans_box.setText(flagValue);
    }

    public void submitFlag(View view){
        Context context = getApplicationContext();
        EditText text = (EditText) findViewById(R.id.editTextFlagTwo);
        String value = text.getText().toString();
        String ans = getString(R.string.fl4g_Tw0);

        TextView ans_box = (TextView) findViewById(R.id.textViewAnswer2);
        if(utils.SecretConverter.encrypt(value).equals(ans)){
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
}