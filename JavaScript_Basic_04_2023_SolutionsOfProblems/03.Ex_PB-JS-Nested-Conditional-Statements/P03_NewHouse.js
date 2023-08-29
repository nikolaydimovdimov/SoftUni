function newHouse(input) {
    let flowersType = input[0];
    let flowersNumber = Number(input[1]);
    let budget = Number(input[2]);

    let flowersCost = 0.0;

    switch (flowersType) {
        case "Roses":
            flowersCost = flowersNumber * 5;
            if (flowersNumber > 80) {
                flowersCost = flowersCost * 0.9;
            }
            break;
        case "Dahlias":
            flowersCost = flowersNumber * 3.8;
            if (flowersNumber > 90) {
                flowersCost = flowersCost * 0.85;
            }
            break;
        case "Tulips":
            flowersCost = flowersNumber * 2.8;
            if (flowersNumber > 80) {
                flowersCost = flowersCost * 0.85;
            }
            break;
        case "Narcissus":
            flowersCost = flowersNumber * 3;
            if (flowersNumber < 120) {
                flowersCost = flowersCost * 1.15;
            }
            break;
        case "Gladiolus":
            flowersCost = flowersNumber * 2.5;
            if (flowersNumber < 80) {
                flowersCost = flowersCost * 1.2;
            }
            break;
    }
    if (flowersCost > budget) {
        console.log(`Not enough money, you need ${(flowersCost - budget).toFixed(2)} leva more.`);
    } else {
        console.log(`Hey, you have a great garden with ${flowersNumber} ${flowersType} and ${(budget - flowersCost).toFixed(2)} leva left.`);
    }
}

newHouse(["Narcissus",
"119",
"360"])


