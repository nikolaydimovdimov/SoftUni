function club(input) {
    let profitTarget = Number(input[0]);
    let index = 0;
    let profit = 0.0;

    while (profitTarget > profit && input[++index] !== "Party!") {
        let drinkName = input[index];
        let drinkNumber = Number(input[++index]);

        let orderCost = drinkName.length * drinkNumber;
        if (orderCost % 2 !== 0) orderCost *= 0.75;
        profit += orderCost;
    }

    if (profitTarget > profit) {
        console.log(`We need ${(profitTarget - profit).toFixed(2)} leva more.`);
    } else {
        console.log("Target acquired.");
    }

    console.log(`Club income - ${profit.toFixed(2)} leva.`);
}

club(["500",
"Bellini",
"6",
"Bamboo",
"7",
"Party!"])
