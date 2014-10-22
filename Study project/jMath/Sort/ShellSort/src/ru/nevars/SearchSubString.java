package ru.nevars;

public class SearchSubString {

    public int searchSubString(String sourceString, String pattern) {
        int M = pattern.length();
        int N = sourceString.length();

        for (int i = 0; i < N - M; i++) {
            int j = 0;
            for (j = 0; j < M; j++) {
                if (sourceString.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == M) {
                return i;
            }
        }
        return -1;
    }
}
