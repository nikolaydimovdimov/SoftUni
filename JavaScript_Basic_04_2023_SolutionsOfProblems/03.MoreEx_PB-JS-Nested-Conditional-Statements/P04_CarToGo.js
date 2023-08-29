function carToGo(input) {
    let budget = Number(input[0]);
    let seasonType = input[1];

    let classType = "";
    let carType = "";
    let carCost = 0.0;


    if (budget > 500) {
        classType = "Luxury class";
        carType = "Jeep";
        carCost = budget * 0.9;
    } else if (budget > 100) {
        classType = "Compact class";
        if (seasonType === "Summer") {
            carType = "Cabrio";
            carCost = budget * 0.45;
        } else {
            carType = "Jeep";
            carCost = budget * 0.8;
        }
    } else {
        classType = "Economy class";
        if (seasonType === "Summer") {
            carType = "Cabrio";
            carCost = budget * 0.35;
        } else {
            carType = "Jeep";
            carCost = budget * 0.65;
        }
    }
    console.log(classType);
    console.log(`${carType} - ${carCost.toFixed(2)}`);
}

carToGo([450,
    "Winter"
])