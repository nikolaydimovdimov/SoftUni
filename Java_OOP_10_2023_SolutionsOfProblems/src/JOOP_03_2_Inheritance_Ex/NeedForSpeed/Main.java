package JOOP_03_2_Inheritance_Ex.NeedForSpeed;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle=new Vehicle(1,1);
        Motorcycle motorcycle=new Motorcycle(2,2);
        RaceMotorcycle raceMotorcycle=new RaceMotorcycle(3,3);
        CrossMotorcycle crossMotorcycle=new CrossMotorcycle(4,4);
        Car car=new Car(5,5);
        FamilyCar familyCar=new FamilyCar(6,6);
        SportCar sportCar=new SportCar(7,7);

        System.out.println(vehicle);    //1
        System.out.println(motorcycle); //2
        System.out.println(raceMotorcycle); //3
        System.out.println(crossMotorcycle);    //4
        System.out.println(car);    //5
        System.out.println(familyCar);  //6
        System.out.println(sportCar);   //7
    }
}
