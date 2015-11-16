package com.example.shiplayer.calculator;

import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        KeyboardView keyboardView = (KeyboardView)findViewById(R.id.keyboardview);
        Keyboard keyboard = new Keyboard(this, R.xml.xmlkv);
    }
}
