function pets(input) {

    let daysNumber = Number(input[0]);
    let foodKg = Number(input[1]);
    let dogPortionKg = Number(input[2]);
    let catPortionKg = Number(input[3]);
    let turtlePortionGr = Number(input[4]);

    let neededFood = daysNumber * (dogPortionKg + catPortionKg + turtlePortionGr / 1000);

    if (neededFood > foodKg) {
        console.log(`${Math.ceil(neededFood - foodKg)} more kilos of food are needed.`);
    } else {
        console.log(`${Math.floor(foodKg - neededFood)} kilos of food left.`);
    }
}

pets([5,
    10,
    2.1,
    0.8,
    321
])