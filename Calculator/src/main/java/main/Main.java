package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by erafiil on 24.06.15.
 */
public class Main {

    public static void main(String[] args) {
        String s = "(    ( 1+   2) * 3 -    40 / 2.5 - 15    )";
        /*String splitted[] = s.split(" ");
        for (String elem : splitted) {
            System.out.print("'" + elem + "';");
        }*/
        Pattern p = Pattern.compile("[0-9]+\\.?[0-9]+|[0-9]+|\\(|\\)|\\+|\\-|\\*|\\/");
        Matcher m  = p.matcher(s);
        while (m.find()) {
            System.out.print("'" + m.group() + "', ");
        }

    }
}
