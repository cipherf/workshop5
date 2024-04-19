package com.aut;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Character wrapperChar = 'c';

        char primitiveChar  = wrapperChar.charValue();
        primitiveChar = wrapperChar;
        ArrayList<Character> characters = new ArrayList<>();
        characters.add(wrapperChar);
        characters.add(primitiveChar);


    }

    public static void assertResult(int expected, int output){
        // write your code here

    }
}
