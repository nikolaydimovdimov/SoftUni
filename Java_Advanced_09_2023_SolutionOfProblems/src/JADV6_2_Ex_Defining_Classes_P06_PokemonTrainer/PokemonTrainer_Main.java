package JADV6_2_Ex_Defining_Classes_P06_PokemonTrainer;

import java.util.*;

public class PokemonTrainer_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Trainer> trainersMap = new LinkedHashMap<>();

        String[] input = scanner.nextLine().split("\\s+");

        while (!input[0].equals("Tournament")) {

            String trainerName = input[0];
            String pokemonName = input[1];
            String element = input[2];
            int power = Integer.parseInt(input[3]);
            if (trainersMap.containsKey(trainerName)) {
                trainersMap.get(trainerName).getPokemonsList()
                        .add(new Pokemon(pokemonName, element, power));
            } else {
                trainersMap.put(trainerName, new Trainer(trainerName, 0, new ArrayList<>()));
                trainersMap.get(trainerName).getPokemonsList()
                        .add(new Pokemon(pokemonName, element, power));
            }
            input = scanner.nextLine().split("\\s+");
        }

        String elements = scanner.nextLine();

        while (!elements.equals("End")) {
            for (Map.Entry<String, Trainer> trainer : trainersMap.entrySet()) {
                Boolean isTherePokemon = false;
                Boolean isNewBadge=false;
                for (Pokemon pokemon : trainer.getValue().getPokemonsList()) {
                    if (pokemon.getElement().equals(elements)) {
                        if(!isNewBadge) {
                            trainer.getValue().setBadges(trainer.getValue().getBadges() + 1);
                            isNewBadge=true;
                        }
                        isTherePokemon = true;
                    }
                }
                if (!isTherePokemon) {
                    trainer.getValue().getPokemonsList().forEach(el -> el.setHealth(el.getHealth() - 10));
                    trainer.getValue().getPokemonsList().removeIf(el -> el.getHealth() <= 0);
                }
            }

            elements = scanner.nextLine();
        }

        while (!trainersMap.isEmpty()) {
            int maxBadges = -1;
            String maxName = "";
            for (Map.Entry<String, Trainer> trainer : trainersMap.entrySet()) {
                if (trainer.getValue().getBadges() > maxBadges) {
                    maxBadges = trainer.getValue().getBadges();
                    maxName = trainer.getKey();
                }
            }
            System.out.println(trainersMap.get(maxName).toString());
            trainersMap.remove(maxName);
        }


    }
}
