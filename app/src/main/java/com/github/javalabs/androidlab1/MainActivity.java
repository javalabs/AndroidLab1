package com.github.javalabs.androidlab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String PARAM_NAME = "name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtn(View view) {
        switch (view.getId()) {
            case R.id.btn_start_activity:
            {
                EditText edt = (EditText)findViewById(R.id.edt_parameter);
                Intent intent = new Intent(this, SecondActivity.class);
                intent.putExtra(PARAM_NAME, edt.getText().toString());
                startActivity(intent);
            }
            break;
        }
    }
}
