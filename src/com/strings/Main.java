// Class String and its methods

package com.strings;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating string
        String str = new String("I am String");

        // Returning lengths of string
        int length = str.length();
        // Printing length to console
        System.out.println(length); // 11

        // CharAt() returns character at index
        char ch = str.charAt(5);
        // Printing char to console
        System.out.println(ch); // S

        // Returning substring from index i
        int i = 5;
        String substring = str.substring(i);
        // Printing substring to console
        System.out.println(substring); // String

        // Returning substring from index k to j-1 index
        int k = 5;
        int j = 8;
        String substring1 = str.substring(k, j);
        // Printing substring to console
        System.out.println(substring1); // Str

        // String concat(String str) ads one string to the end of another
        // Creating a new string to add to existing one
        String str_sup = "!";
        str = str.concat(str_sup);
        // Printing new string to console
        System.out.println(str); // I am String!
    }
}