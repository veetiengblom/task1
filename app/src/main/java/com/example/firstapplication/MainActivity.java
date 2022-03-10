package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.text.TextWatcher;
import android.text.Editable;



public class MainActivity extends AppCompatActivity implements TextWatcher{

    String userText;

    TextView text;

    EditText userInput;
    EditText EditTextOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textView);
        text.setText("Replace text!");
        userInput = (EditText) findViewById(R.id.userInput);
        EditTextOut = (EditText) findViewById(R.id.userInput);
        EditTextOut.addTextChangedListener(this);
    }

    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    public void afterTextChanged(Editable s) {
        text.setText(s);
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
