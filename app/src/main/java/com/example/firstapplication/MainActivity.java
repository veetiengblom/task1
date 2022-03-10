package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    String userText;
    TextView text;

    EditText userInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textView);
        text.setText("Replace text!");
        userInput = (EditText) findViewById(R.id.userInput);
    }

    public void button(View v) {
        System.out.println("Hello world!");
        text.setText("Hello world!");
    }

    public void userInputButton(View v) {
        userText = userInput.getText().toString();
        text.setText(userText);
    }

}
