package JADV7_1_Workshop_Custom_Data_Structures_P01_SmartArray;

public class SmartArray_Main {
    public static void main(String[] args) {
        SmartArray myArray=new SmartArray();

        System.out.println();

        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        myArray.add(5);
        myArray.add(6);
        myArray.add(7);
        myArray.add(8);
        myArray.add(9);
        System.out.println( myArray.get(5));
        myArray.add(10);
        myArray.add(11);
        myArray.add(12);
        myArray.add(13);
        myArray.add(14);
        myArray.add(15);
        myArray.add(16);
        myArray.add(17);
        myArray.add(18);
        myArray.add(19);
        myArray.add(20);
        myArray.add(19,100);
        System.out.println(myArray.contains(20));

        myArray.remove(19);
        myArray.remove(0);
        myArray.remove(0);
        myArray.remove(0);
        myArray.remove(0);
        myArray.remove(0);
        myArray.remove(0);
        myArray.remove(0);
        myArray.remove(0);
        myArray.remove(0);
        myArray.remove(0);
        myArray.remove(0);
        myArray.remove(0);
        myArray.remove(0);
        myArray.remove(0);
        myArray.remove(0);
        myArray.remove(0);
        myArray.remove(0);
        myArray.remove(0);
        myArray.remove(0);




        myArray.forEach(i -> System.out.print(i + " "));
    }
}
