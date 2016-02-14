package com.github.javalabs.androidlab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = (TextView)findViewById(R.id.textView);

        Intent intent = getIntent();
        textView.setText(
                String.format("%s %s",
                        getString(R.string.txt_view_param),
                        intent.getStringExtra(MainActivity.PARAM_NAME)
                ));
    }
}
