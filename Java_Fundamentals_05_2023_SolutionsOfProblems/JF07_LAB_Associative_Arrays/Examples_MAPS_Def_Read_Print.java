package JF07_LAB_Associative_Arrays;

import java.sql.Array;
import java.util.*;

public class Examples_MAPS_Def_Read_Print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<Double, Integer> numMap = new HashMap<>();  // Не е подредена ( за подреждане по Values
                                                        // може да се използва обърнат  TreeMap

        Map<String, int[]> nameMap = new LinkedHashMap<>(); // Подредена по ред на добавяне
        nameMap.put("elem1", new int[5]);   // Създава елемент от Map с ключ elem1 и стойност масив int с 5 елемемнта-празни
        nameMap.get("elem1")[0]=3; // Поставя стойност 3 в масива на elem1 на позиция 0

        Map<String,List<String>> staff=new TreeMap<>(); // Подредена по стойност на ключа
        staff.putIfAbsent("Ivan", new ArrayList<>()); // Създава нов елемент, ако няма такъв със стойност ArrayList - празен
        staff.get("Ivan").add("Sofia"); // Добавя стойност Sofia към ListArray на елемент Ivan

         Map<String,LinkedHashMap<Integer,double[]>> myMap= new TreeMap<>();
         myMap.putIfAbsent("Niki",new LinkedHashMap<>()); //Добавя нов елемент ( ако не съществува)
                                                            // с ключ Niki към myMap със стойност празна LinkedMap

         myMap.get("Niki").putIfAbsent(5,new double[3]);    //Добавя нов елемент ( ако не съществува) с ключ 5
                                                            // към стойността - LinkedHashMap от myMap с ключ Niki
                                                            // със стойност празен Array double с 3 елемента

        myMap.get("Niki").get(5)[0]=1.7;        //Поставя стойност 1.7 на позиция 0 в масива на елемент 5
                                                // от LinkedHashMap на елемент Niki от TreeMap

        double[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        for (double number : numbers) {                         // брои различните числа и записва бройката им в Map
            numMap.putIfAbsent(number, 0);
            numMap.put(number, numMap.get(number) + 1);
        }

        // PRINT ........................

        for (Map.Entry<Double, Integer> dEl : numMap.entrySet()) {
            System.out.println(dEl.getKey() + " --> " + dEl.getValue());   // numMap.entrySet().iter
        }
        numMap.forEach((key,value) -> System.out.printf("%.2f --> %d%n",key,value));


        numMap.clear();  // изтрива всички елементи на Map



    }
}

