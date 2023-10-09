package JADV6_2_Ex_Defining_Classes_P05_CarSalesman;

import java.util.*;

public class CarSalesman_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Engine> enginesMap=new HashMap<>();
        List<Car> carsInStoreList=new ArrayList<>();
        int n=Integer.parseInt(scanner.nextLine());
        while (n-->0){
            
            String inputLine=scanner.nextLine();

            fillEnginesMap(enginesMap, inputLine);
        }

        int m=Integer.parseInt(scanner.nextLine());
        while (m-->0){

            String inputLine=scanner.nextLine();

            fillCarList(carsInStoreList,inputLine,enginesMap);
        }

        carsInStoreList.forEach(car -> System.out.println(car.toString()));
    }

    private static void fillEnginesMap(Map<String, Engine> enginesMap, String inputLine) {

        String[] input=inputLine.split("\\s+");

        String model= input[0];
        int power=Integer.parseInt(input[1]);
        int displacement;
        String efficiency;

        if(input.length==2) {
            enginesMap.putIfAbsent(model,new Engine(model,power));
        } else if (input.length==4) {
            displacement=Integer.parseInt(input[2]);
            efficiency= input[3];
            enginesMap.putIfAbsent(model,new Engine(model,power,displacement,efficiency));
        } else{
            if(input[2].matches("\\d+")){
                displacement=Integer.parseInt(input[2]);
                enginesMap.putIfAbsent(model,new Engine(model,power,displacement));
            }else {
                efficiency= input[2];
                enginesMap.putIfAbsent(model,new Engine(model,power,efficiency));
            }
        }
    }

    private static void fillCarList(List<Car> carsInStoreList, String inputLine,Map<String, Engine> enginesMap) {

        String[] input=inputLine.split("\\s+");

        String model= input[0];
        Engine engine=enginesMap.get(input[1]);
        int weight;
        String color;

        if(input.length==2) {
            carsInStoreList.add(new Car(model,engine));
        } else if (input.length==4) {
            weight=Integer.parseInt(input[2]);
            color= input[3];
            carsInStoreList.add(new Car(model,engine,weight,color));
        } else{
            if(input[2].matches("\\d+")){
                weight=Integer.parseInt(input[2]);
                carsInStoreList.add(new Car(model,engine,weight));
            }else {
                color= input[2];
                carsInStoreList.add(new Car(model,engine,color));
            }
        }
    }
}
