package JOOP_02_2_Encapsulation_Ex.P03_ShoppingSpree;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Person> personsMap = new LinkedHashMap<>();

        Arrays.stream(scanner.nextLine().split(";"))
                .forEach(el -> personsMap.put(getInputPersonsData(el).getName(),
                        getInputPersonsData(el)));

        Map<String, Product> productsMap = new LinkedHashMap<>();

        Arrays.stream(scanner.nextLine().split(";"))
                .forEach(el -> productsMap.put(getInputProductsData(el).getName(),
                        getInputProductsData(el)));

        String[] command = scanner.nextLine().split("\\s+");

        while (!command[0].equals("END")) {
            String name = command[0];
            String product = command[1];
            if (personsMap.containsKey(name) && productsMap.containsKey(product)) {
                sellProduct(personsMap, name, productsMap, product);
            }
            command = scanner.nextLine().split("\\s+");
        }
        personsMap.forEach((key, value) -> System.out.println(value));


    }

    private static void sellProduct(Map<String, Person> personsMap, String name, Map<String, Product> productsMap, String product) {
        personsMap.get(name).buyProduct(productsMap.get(product));
    }


    private static Person getInputPersonsData(String str) {
        String[] personData = str.split("=");
        Person person = new Person("n", 0);
        try {
            person = new Person(personData[0], Double.parseDouble(personData[1]));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.exit(-1);
        }
        return person;
    }

    private static Product getInputProductsData(String str) {
        String[] productData = str.split("=");
        Product product=new Product("n",0);
        try {
            product=new Product(productData[0], Double.parseDouble(productData[1]));
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.exit(-1);
        }
        return product;
    }

}
