package com.application;

public class StringFunctions {
    // Reverse of a String
    public String reverse(String string1) {
        String temp = ""; //empty string
        for (int i = string1.length() - 1; i >= 0; i--) {
            temp += string1.charAt(i);
        }
        return temp;
    }
    // Calculate length of a String
    public int calculate_length(String s) {
        int length = s.length();
        return length;
    }



}
