package JF05_1_LAB_Lists;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Examples_DeffReadPrintSort_List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//    DEF- ------------------------------------------
        List<String> textList=new ArrayList<>();
        List<Integer> numberList=new ArrayList<>();

        List<String> stringList=new ArrayList<>(Arrays.asList("a","b","c","d"));
        stringList.remove(1);

//        READ from MANI LINES

        for (int i = 0; i < 10; i++) {
            stringList.add(scanner.nextLine());
        }
        for (int i = 0; i < 10; i++) {
            numberList.add(Integer.parseInt(scanner.nextLine()));
        }

//        READ from ONE LINE------------------------------------------

        List<String>  inputStringList=Arrays
                .stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());



        List<Integer> inputIntList=Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i < inputStringList.size(); i++) {
                inputIntList.add(Integer.parseInt(inputStringList.get(i)));
        }

        List<Double> inputDoubleList=Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

//        PRINT-----------------------------
        String newStr="";
        for (Double elem : inputDoubleList) {
            newStr+=String.format("%s ",elem);
            System.out.println(elem);
        }

        System.out.println();



        System.out.println(joinDoubleListByDelimiter(inputDoubleList, " "));

        System.out.println(inputIntList.toString().replaceAll("[\\[\\],]"," "));

        System.out.println(String.join(";",textList));


//        SORT _--------------------------------
        inputIntList.removeIf(el -> el<0);
        inputIntList.removeIf(el -> el%2==0);


        inputIntList.removeAll(Arrays.asList(4)); //премахва всички елементи 4 - представя се като List - колекция

        Collections.sort(textList);
        Collections.reverse(inputIntList);

        textList.clear(); //изтрива всички елементи




// REMOVE___________________

        inputIntList.remove(Integer.valueOf(5)); // Remove first element ==5
        inputIntList.remove((int) 5); // Remove  element with index 5

//        GET



    }


        public static List<Integer> getRemainingElements (List<Integer> longerList, List<Integer> shorterList) {
            List<Integer> nums = new ArrayList<>();
            for (int i = shorterList.size(); i < longerList.size(); i++)
                nums.add(longerList.get(i));
            return nums;
        }



    public static String joinDoubleListByDelimiter(List<Double> numList, String delimiter) {
        DecimalFormat doubleFormat = new DecimalFormat("0.##");
        String newString = "";
        for (Double aDouble : numList) {
            newString += doubleFormat.format(aDouble) + delimiter;
        }
        return newString;
    }
}
