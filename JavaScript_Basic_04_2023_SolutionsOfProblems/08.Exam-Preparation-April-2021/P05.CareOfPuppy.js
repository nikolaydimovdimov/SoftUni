function careOfPuppy(input) {
    let quantityFoodKg = Number(input[0]);

    let eatenFoodGr = 0;
    let index = 0;

    while (input[++index] !== "Adopted") {
        eatenFoodGr += Number(input[index]);
    }

    if (eatenFoodGr > quantityFoodKg * 1000) {
        console.log(`Food is not enough. You need ${eatenFoodGr - quantityFoodKg * 1000} grams more.`);
    } else {
        console.log(`Food is enough! Leftovers: ${quantityFoodKg * 1000 - eatenFoodGr} grams.`);
    }
}

careOfPuppy(["2",
    "999",
    "456",
    "999",
    "999",
    "123",
    "456",
    "Adopted"])

