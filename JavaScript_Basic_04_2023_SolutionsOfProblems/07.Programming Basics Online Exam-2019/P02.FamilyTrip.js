function familyTrip(input) {
    let budget = Number(input[0]);
    let stayNumber = Number(input[1]);
    let stayCost = Number(input[2]);
    let addCostPercent = Number(input[3]);

    let holidaysCost = stayNumber * stayCost;
    if (stayNumber > 7) holidaysCost *= 0.95;
    holidaysCost += budget * addCostPercent / 100;

    if (holidaysCost > budget) {
        console.log(`${(holidaysCost - budget).toFixed(2)} leva needed.`);
    } else {
        console.log(`Ivanovi will be left with ${(budget - holidaysCost).toFixed(2)} leva after vacation.`)
    }
}

familyTrip([500,
    7,
    66,
    15
])