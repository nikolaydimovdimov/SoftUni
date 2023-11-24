package JOOP_04_2_Interfaces_and_Abstraction_Ex.P06_MilitaryElite;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Private> privates = new HashMap<>();
        String[] token = scanner.nextLine().split("\\s+");

        while (!token[0].equals("End")) {
            int id = Integer.parseInt(token[1]);
            String firstName = token[2];
            String lastName = token[3];

            Private newPrivate;
            double salary;

            switch (token[0]) {
                case "Spy":
                    Spy spy=new SpyImpl(id, firstName, lastName,token[4]);
                    System.out.println(spy.toString());
                    break;
                case "Private":
                   salary = Double.parseDouble(token[4]);
                    newPrivate = new PrivateImpl(id, firstName, lastName, salary);
                    privates.putIfAbsent(id, newPrivate);
                    System.out.println(newPrivate);
                    break;
                case "LieutenantGeneral":
                    salary = Double.parseDouble(token[4]);
                    LieutenantGeneral general = new LieutenantGeneralImpl(id, firstName, lastName, salary,
                            new HashSet<Private>());
                    for (int i = 5; i < token.length; i++) {
                        general.getPrivs().add(privates.get(Integer.parseInt(token[i])));
                    }
                    System.out.println(general.toString());
                    break;
                case "Engineer":
                    if (isValidEnumValues(token[5])) {
                        salary = Double.parseDouble(token[4]);
                        Engineer engineer = new EngineerImpl(id, firstName, lastName,
                                salary, Corps.valueOf(token[5]), new LinkedHashSet<Repair>());
                        for (int i = 6; i < token.length; i += 2) {
                            engineer.getRepairs().add(new Repair(token[i], Integer.parseInt(token[i + 1])));
                        }
                        System.out.println(engineer);
                    }
                    break;
                case "Commando":
                    if (isValidEnumValues(token[5])) {
                        salary = Double.parseDouble(token[4]);
                        Commando commando = new CommandoImpl(id, firstName, lastName,
                                salary, Corps.valueOf(token[5]), new LinkedHashSet<Mission>());
                        for (int i = 6; i < token.length; i += 2) {
                            if (isValidEnumValues(token[i + 1])) {
                                commando.getMissions().add(new Mission(token[i], State.valueOf(token[i + 1])));
                            }
                        }
                        System.out.println(commando.toString());
                    }
            }
            token = scanner.nextLine().split("\\s+");
        }
    }

    public static boolean isValidEnumValues(String string) {
        boolean a = Arrays.stream(Corps.values()).anyMatch(c -> c.name().equals(string));
        boolean b = Arrays.stream(State.values()).anyMatch(s -> s.name().equals(string));
        return a || b;
    }
}
