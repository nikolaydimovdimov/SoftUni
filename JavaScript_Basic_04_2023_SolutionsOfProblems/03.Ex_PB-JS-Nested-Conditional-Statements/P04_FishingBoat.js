function fishingBoat(input) {
    let budget = Number(input[0]);
    let season = input[1];
    let fishermans = Number(input[2]);

    let boatCost = 0.0;

    switch (season) {
        case "Spring":
            boatCost = 3000;
            if (fishermans % 2 === 0) {
                boatCost = boatCost * 0.95;
            }
            break;
        case "Summer":
            boatCost = 4200;
            if (fishermans % 2 === 0) {
                boatCost = boatCost * 0.95;
            }
            break;
        case "Autumn":
            boatCost = 4200;
            break;
        case "Winter":
            boatCost = 2600;
            if (fishermans % 2 === 0) {
                boatCost = boatCost * 0.95;
            }
            break;
    }
    if (fishermans >= 12) {
        boatCost = boatCost * 0.75;
    } else if (fishermans >= 7) {
        boatCost = boatCost * 0.85;
    } else {
        boatCost = boatCost * 0.9;
    }
    
    if (boatCost > budget) {
        console.log(`Not enough money! You need ${(boatCost - budget).toFixed(2)} leva.`);
    } else {
        console.log(`Yes! You have ${(budget - boatCost).toFixed(2)} leva left.`);
    }
}

fishingBoat(["3600",
"Autumn",
"6"])



