function animalType(input) {
    let animalName = input[0];

    switch (animalName) {
        case "dog":
            console.log("mammal");
            break;
        case "crocodile":
        case "tortoise":
        case "snake":
            console.log("reptile");
            break;
        default:
            console.log("unknown");
            break;
    }
}
animalType(["snakekjjk"])