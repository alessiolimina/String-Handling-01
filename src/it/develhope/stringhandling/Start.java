package it.develhope.stringhandling;

public class Start {
    public static void main(String[] args) {

        String string1 = "Hello";

        String string2 = "How are you?";

        System.out.println(string1.indexOf("He"));

        System.out.println(string1.indexOf("llo"));

        System.out.println(string2.indexOf("u?"));

        //come trovo la posizione in cui finire dopo u?

        String s3 = string1.substring(0,2);

        String s4 = string2.substring(10,12);

        System.out.println(s3);

        System.out.println(s4);

        String s5 = s3.concat(s4);

        System.out.println(s5);

        char[] charArray = s5.toCharArray();

        for (int i=0; i<charArray.length; i++) {
            System.out.print(charArray[i] + " ");

        }

    }
}
/*
define a string called string1 that has assigned the value "Hello"
define a string called string2 that has assigned the value "How are you?"
take the first 2 characters string1 and the last 2 characters of string2 and combine the 4 chars (Heu?) into a dedicated array called charArray
print charArray
 */