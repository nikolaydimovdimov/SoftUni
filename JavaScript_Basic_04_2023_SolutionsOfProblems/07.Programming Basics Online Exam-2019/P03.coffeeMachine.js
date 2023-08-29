function coffeeMachine(input) {
    let drinkType = input[0];
    let sugarQuantity = input[1];
    let drinkNumber = Number(input[2]);
    let price = 0.0;

    switch (drinkType) {
        case "Espresso":
            if (sugarQuantity === "Without") {
                price = 0.9 * 0.65;
            } else if (sugarQuantity === "Normal") {
                price = 1;
            } else if (sugarQuantity === "Extra") {
                price = 1.2;
            }

            if (drinkNumber >= 5) price *= 0.75;

            break;

        case "Cappuccino":

            if (sugarQuantity === "Without") {
                price = 1 * 0.65;
            } else if (sugarQuantity === "Normal") {
                price = 1.2;
            } else if (sugarQuantity === "Extra") {
                price = 1.6;
            }

            break;

        case "Tea":

            if (sugarQuantity === "Without") {
                price = 0.5 * 0.65;
            } else if (sugarQuantity === "Normal") {
                price = 0.6;
            } else if (sugarQuantity === "Extra") {
                price = 0.7;
            }

            break;

    }

    price *= drinkNumber;

    if (price > 15) price *= 0.8;

    console.log(`You bought ${drinkNumber} cups of ${drinkType} for ${price.toFixed(2)} lv.`);
}

coffeeMachine(["Tea",
    "Extra",
    3


])

