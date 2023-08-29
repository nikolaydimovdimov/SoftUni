function flowers(input) {

    let chrysanthemumsNumber = Number(input[0]);
    let rosesNumber = Number(input[1]);
    let tulipsNumber = Number(input[2]);
    let seasonType = input[3];
    let dayType = input[4];

    let flowersCost = 0.0;

    switch (seasonType) {
        case "Spring":
        case "Summer":
            flowersCost = chrysanthemumsNumber * 2 + rosesNumber * 4.1 + tulipsNumber * 2.5;
            if (dayType === "Y") {
                flowersCost = flowersCost * 1.15;
            }
            if (seasonType === "Spring" && tulipsNumber > 7) {
                flowersCost = flowersCost * 0.95;
            }
            break;
        case "Autumn":
        case "Winter":
            flowersCost = chrysanthemumsNumber * 3.75 + rosesNumber * 4.5 + tulipsNumber * 4.15;
            if (dayType === "Y") {
                flowersCost = flowersCost * 1.15;
            }
            if (seasonType === "Winter" && rosesNumber >= 10) {
                flowersCost = flowersCost * 0.9;
            }
            break;
    }

    if ((chrysanthemumsNumber + rosesNumber + tulipsNumber) > 20) {
        flowersCost = flowersCost * 0.8;
    }
    flowersCost = flowersCost + 2;
    console.log(flowersCost.toFixed(2));
}

flowers([2,
    4,
    8,
    "Spring",
    "Y"
])