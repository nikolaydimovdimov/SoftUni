function fuelTankPart2(input) {

    let fuelType = input[0];
    let fuelQuantity = Number(input[1]);
    let haveCard = input[2];
    let fuelCost = 0.0;
    let discount = 0.0;

    if (fuelType === "Gasoline") {
        fuelCost = fuelQuantity * 2.22;
        discount = 0.18;
    } else if (fuelType === "Diesel") {
        fuelCost = fuelQuantity * 2.33;
        discount = 0.12;
    } else if (fuelType === "Gas") {
        fuelCost = fuelQuantity * 0.93;
        discount = 0.08;
    }

    if (haveCard === "Yes") {
        fuelCost = fuelCost - fuelQuantity * discount;
    }

    if (fuelQuantity > 25) {
        fuelCost = fuelCost * 0.9;
    } else if (fuelQuantity > 20) {
        fuelCost = fuelCost * 0.92;
    }

    console.log(`${fuelCost.toFixed(2)} lv.`);
}

fuelTankPart2(["Gas",
    30,
    "Yes"
    ])