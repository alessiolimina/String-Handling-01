package it.develhope.stringhandling;

public class Start {
    public static void main(String[] args) {

        String string1 = "Hello";

        String string2 = "How are you?";

        char[] charArray = new char[4];

        System.out.println(string1.indexOf("He"));

        System.out.println(string2.indexOf("u?"));

        string1.getChars(0,2,charArray, 0);

        string2.getChars(10,12, charArray, 2);

        System.out.println(charArray);

        }

    }

