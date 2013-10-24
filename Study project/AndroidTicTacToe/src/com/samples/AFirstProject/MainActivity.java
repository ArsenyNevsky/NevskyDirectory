package com.samples.AFirstProject;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity
{

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        edText = (EditText)findViewById(R.id.textView);
        tv = (TextView)findViewById(R.id.labelText);
        tv.setText("Добро пожаловать в игру Крестики - Нолики!\n");
        twoPlayersButton = (Button)findViewById(R.id.twoPlayersButton);
        exitButton = (Button)findViewById(R.id.exitButton);
    }


    public void onClick(View v) {
            switch (v.getId()) {
                case R.id.twoPlayersButton:
                    Intent intent = new Intent(this, GameActivity.class);
                    startActivity(intent);
                    break;
                case R.id.exitButton:
                    System.exit(0);
            }
        }


    private Button twoPlayersButton;
    private Button exitButton;
    private EditText edText;
    private TextView tv;
}
