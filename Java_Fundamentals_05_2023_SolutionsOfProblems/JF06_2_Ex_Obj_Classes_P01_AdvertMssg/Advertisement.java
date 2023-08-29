package JF06_2_Ex_Obj_Classes_P01_AdvertMssg;

import java.util.Random;

public class Advertisement {

    private  String[]  phrasesArr={"Excellent product.",
        "Such a great product.",
        "I always use that product.",
        "Best product of its category.",
        "Exceptional product.",
        "I can’t live without this product.",
    };

    private String[] eventsArr={"Now I feel good.",
            "I have succeeded with this product.",
            "Makes miracles. I am happy of the results!",
            "I cannot believe but now I feel awesome.",
            "Try it yourself, I am very satisfied.",
            "I feel great!"
    };

    private String[] authorsArr={"Diana",
            "Petya",
            "Stella",
            "Elena",
            "Katya",
            "Iva",
            "Annie",
            "Eva"
    };

    private String[] citiesArr={"Burgas",
            "Sofia",
            "Plovdiv",
            "Varna",
            "Ruse"
    };

    public String massageGenerate(){
        Random rnd=new Random();
        return String.format("%s %s %s - %s",
                phrasesArr[rnd.nextInt(phrasesArr.length)],
                eventsArr[rnd.nextInt(eventsArr.length)],
                authorsArr[rnd.nextInt(authorsArr.length)],
                citiesArr[rnd.nextInt(citiesArr.length)]
        );
    }

}
