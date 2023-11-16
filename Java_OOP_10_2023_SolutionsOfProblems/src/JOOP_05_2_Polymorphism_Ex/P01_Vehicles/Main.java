package JOOP_05_2_Polymorphism_Ex.P01_Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] token=scanner.nextLine().split("\\s+");
        Vehicle car=new Car(Double.parseDouble(token[1]),Double.parseDouble(token[2]));
        token=scanner.nextLine().split("\\s+");
        Vehicle truck=new Truck(Double.parseDouble(token[1]),Double.parseDouble(token[2]));
        int n=Integer.parseInt(scanner.nextLine());
        while (n-- >0){
            token=scanner.nextLine().split("\\s+");
            if(token[0].equals("Drive")){
                if(token[1].equals("Car")){
                    System.out.println(car.drive(Double.parseDouble(token[2])));
                }else {
                    System.out.println(truck.drive(Double.parseDouble(token[2])));
                }
            }else{
                if(token[1].equals("Car")){
                    car.refuel(Double.parseDouble(token[2]));
                }else {
                    truck.refuel(Double.parseDouble(token[2]));
                }
            }
        }
        System.out.println(car);
        System.out.println(truck);
    }
}
