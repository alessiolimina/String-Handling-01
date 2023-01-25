package it.develhope.stringhandling;

public class Start {
    public static void main(String[] args) {

        System.out.println("---------Starting--------------");

        String string1 = "Hello";
        String string2 = "How are you?";

        System.out.println(string1.indexOf("He"));
        System.out.println(string2.indexOf("u?"));

        char[] charArray = new char[4];

        string1.getChars(0,2, charArray, 0);
        string2.getChars(10,12, charArray, 2);

        System.out.println(charArray);

        System.out.println("--------------------------------");

        }

    }

