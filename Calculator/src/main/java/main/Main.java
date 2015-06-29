package main;

import frame.DarkFrame;

import javax.swing.*;

/**
 * Created by erafiil on 24.06.15.
 */
public class Main {


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DarkFrame();
            }
        });
    }
}
