package com.samples.AFirstProject;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import Model.Game;
import android.view.Gravity;
import android.widget.Toast;

public class GameActivity extends Activity {

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.game);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        but1 = (Button) findViewById(R.id.but1);
        but2 = (Button) findViewById(R.id.but2);
        but3 = (Button) findViewById(R.id.but3);
        but4 = (Button) findViewById(R.id.but4);
        but5 = (Button) findViewById(R.id.but5);
        but6 = (Button) findViewById(R.id.but6);
        but7 = (Button) findViewById(R.id.but7);
        but8 = (Button) findViewById(R.id.but8);
        but9 = (Button) findViewById(R.id.but9);
        game = new Game();
        String win = "Game end";
    }

    public void onClick(View v) {
        String s;
        int n;
        switch (v.getId()) {
            case R.id.but1:
                but1.setText(game.setXO(1));
                s = game.setXO(0);
                n = game.getNum();
                onClickBot(n, s);
                if (game.isWin()) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Game end",
                            Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
                break;

            case R.id.but2:
                but2.setText(game.setXO(2));
                s = game.setXO(0);
                n = game.getNum();
                onClickBot(n, s);
                if (game.isWin()) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Game end",
                            Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
                break;

            case R.id.but3:
                but3.setText(game.setXO(3));
                s = game.setXO(0);
                n = game.getNum();
                onClickBot(n, s);
                if (game.isWin()) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Game end",
                            Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
                break;

            case R.id.but4:
                but4.setText(game.setXO(4));
                s = game.setXO(0);
                n = game.getNum();
                onClickBot(n, s);
                if (game.isWin()) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Game end",
                            Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
                break;

            case R.id.but5:
                but5.setText(game.setXO(5));
                s = game.setXO(0);
                n = game.getNum();
                onClickBot(n, s);
                if (game.isWin()) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Game end",
                            Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
                break;

            case R.id.but6:
                but6.setText(game.setXO(6));
                s = game.setXO(0);
                n = game.getNum();
                onClickBot(n, s);
                if (game.isWin()) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Game end",
                            Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
                break;

            case R.id.but7:
                but7.setText(game.setXO(7));
                s = game.setXO(0);
                n = game.getNum();
                onClickBot(n, s);
                if (game.isWin()) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Game end",
                            Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
                break;

            case R.id.but8:
                but8.setText(game.setXO(8));
                s = game.setXO(0);
                n = game.getNum();
                onClickBot(n, s);
                if (game.isWin()) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Game end",
                            Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
                break;

            case R.id.but9:
                but9.setText(game.setXO(9));
                s = game.setXO(0);
                n = game.getNum();
                onClickBot(n, s);
                if (game.isWin()) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Game end",
                            Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
                break;
        }
    }

    private void onClickBot(int n, String s) {
        switch (n) {
            case 1:
                but1.setText(s);
                break;

            case 2:
                but2.setText(s);
                break;

            case 3:
                but3.setText(s);
                break;

            case 4:
                but4.setText(s);
                break;

            case 5:
                but5.setText(s);
                break;

            case 6:
                but6.setText(s);
                break;

            case 7:
                but7.setText(s);
                break;

            case 8:
                but8.setText(s);
                break;

            case 9:
                but9.setText(s);
                break;
        }
    }
    private Button but1;
    private Button but2;
    private Button but3;
    private Button but4;
    private Button but5;
    private Button but6;
    private Button but7;
    private Button but8;
    private Button but9;
    private Game game;
}
