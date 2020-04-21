package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CodingChallengeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coding_challenge);
        TextView text = findViewById(R.id.text_view);

        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra(MainActivity.BUTTON_NUMBER, 0);
        if (intValue == 0) {
            text.setText(R.string.error_message);
        } else if (intValue == R.id.text_button_1) {
            text.setText(R.string.paragraph1);
        } else if (intValue == R.id.text_button_2) {
            text.setText(R.string.paragraph2);
        } else if (intValue == R.id.text_button_3) {
            text.setText(R.string.paragraph3);
        }

    }
}
