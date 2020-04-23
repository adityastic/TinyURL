package com.prabhanshu.tinyurl.utils;

public class TinyURLUtils {
    final static char[] characterMap = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

    public static String idToShortURL(int n) {
        StringBuilder shortURL = new StringBuilder();
        while (n > 0) {
            shortURL.append(characterMap[n % 62]);
            n = n / 62;
        }
        return shortURL.reverse().toString();
    }

    public static int shortURLtoID(String shortURL) {
        int id = 0;
        for (int i = 0; i < shortURL.length(); i++) {
            if ('a' <= shortURL.charAt(i) &&
                    shortURL.charAt(i) <= 'z')
                id = id * 62 + shortURL.charAt(i) - 'a';
            if ('A' <= shortURL.charAt(i) &&
                    shortURL.charAt(i) <= 'Z')
                id = id * 62 + shortURL.charAt(i) - 'A' + 26;
            if ('0' <= shortURL.charAt(i) &&
                    shortURL.charAt(i) <= '9')
                id = id * 62 + shortURL.charAt(i) - '0' + 52;
        }
        return id;
    }
}
