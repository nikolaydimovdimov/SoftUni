package JF3_1_LAB_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Examples_Read_Print_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numArray = new int[10]; //definition array numArray with 10 elements with index 0,1,2 ... 9
        String[] textArray = {
                "aaa",
                "bbb",             //initialisation of String Array with 5 elements
                "ccc",
                "ddd",
                "eee"
        };

        // READ >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        for (int i = 0; i < numArray.length; i++) {
            numArray[i]=Integer.parseInt(scanner.nextLine());   //read elements of numArray from mani lines in console
        }

        textArray = scanner.nextLine().split(" "); // read elements of textArray from 1 lines, delimited with " "


        numArray= Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();                                    // read int Array from 1 line with " " delimiter

        numArray=Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(element -> Integer.parseInt(element))
                .toArray();

        textArray= (String[]) Arrays
                .stream(scanner.nextLine().split(", "))      //read elements of textArray with ", " delimiter
                .toArray();                                       // ONLY STRING ARRAY

        char symbolTwo=scanner.nextLine().charAt(0);      // Read 1 char from line


     // PRINT >>>>>>>>>>>>>>>>>>

        for (int elem : numArray) {
            System.out.printf("%d ",elem);    // foreach Loop - READ ONLY
        }


        System.out.println(String.join(", ",textArray)); //print elements of textArray with ", " delimiter
                                                                // ONLY STRING ARRAY

        System.out.println(Arrays
                .toString(numArray)
                .replace("[", "")       // print int Array to 1 line without "["  "]" - INT ARRAY
                .replace("]", ""));


        // CONVERT...........
        String text="avabanna";
        String[] textArr=text.split(""); // CONVERT String to String Array with elements=one char

        char[] textCharArr=text.toCharArray(); // CONVERT String to char Array

        int a=123566;
        String newString=""+a;
        String new2DString=Integer.toString(a);
        String nnnString=String.format("%d",a);




    }


}
