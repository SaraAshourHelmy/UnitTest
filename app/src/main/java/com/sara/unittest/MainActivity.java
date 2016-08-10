package com.sara.unittest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText tv_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_test = (EditText) findViewById(R.id.tv_test);
    }

    public void ClickTest(View view) {
        if (tv_test.getText().toString().equals("sara")) {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        } else {
            tv_test.setText("Why ??");
        }

    }
}
