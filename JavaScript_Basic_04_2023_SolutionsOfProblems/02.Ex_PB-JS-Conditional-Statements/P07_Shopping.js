function shopping(input) {
    let budget = Number(input[0]);
    let videoCards = Number(input[1]);
    let procesors = Number(input[2]);
    let rams = Number(input[3]);

    let totalCost = videoCards * 250;
    totalCost = totalCost * (1 + 0.35 * procesors + 0.1 * rams);

    if (videoCards > procesors) {
        totalCost = totalCost * 0.85;
    }
    if (budget < totalCost) {
        console.log(`Not enough money! You need ${(totalCost - budget).toFixed(2)} leva more!`);
    } else {
        console.log(`You have ${(budget - totalCost).toFixed(2)} leva left!`);
    }
}

shopping(["920.45",
    "3",
    "1",
    "1"])

