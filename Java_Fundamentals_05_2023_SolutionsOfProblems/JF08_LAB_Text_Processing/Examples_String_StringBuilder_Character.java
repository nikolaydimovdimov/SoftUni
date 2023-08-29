package JF08_LAB_Text_Processing;

import java.util.Scanner;

public class Examples_String_StringBuilder_Character {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text="";

        text.equals("abc");
        text.length();
        text.contains("abc");
        text.charAt(2);
        text.concat("axy");
        text.indexOf("abc");
        text.substring(0,2);
        text.repeat(2);

        String[] textArr=text.split("");

        char[] chArr=text.toCharArray();


        ///   StringBuilder -----  работи много бързо !!!!!

        StringBuilder textBuilder= new StringBuilder();

        textBuilder.append("a");
        textBuilder.charAt(2);
        textBuilder.length();
        textBuilder.isEmpty();
        textBuilder.deleteCharAt(0);



        /// Character --------------------

        Character.isDigit('a');
        Character.isUpperCase('a');
        Character.isLetterOrDigit('a');





    }
}
