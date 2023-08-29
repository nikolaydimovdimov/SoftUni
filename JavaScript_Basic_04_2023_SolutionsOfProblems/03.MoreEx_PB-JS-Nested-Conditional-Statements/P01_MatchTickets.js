function matchTickets(input) {
    let budget = Number(input[0]);
    let ticketType = input[1];
    let peopleNumber = Number(input[2]);

    let ticketBudget = 0.0;

    if (peopleNumber >= 50) {
        ticketBudget = budget * 0.75;
    } else if (peopleNumber >= 25) {
        ticketBudget = budget * 0.6;
    } else if (peopleNumber >= 10) {
        ticketBudget = budget * 0.5;
    } else if (peopleNumber >= 5) {
        ticketBudget = budget * 0.4;
    } else {
        ticketBudget = budget * 0.25;
    }

    if (ticketType === "VIP") {
        if (peopleNumber * 499.99 > ticketBudget) {
            console.log(`Not enough money! You need ${(peopleNumber * 499.99 - ticketBudget).toFixed(2)} leva.`);
        } else {
            console.log(`Yes! You have ${(ticketBudget - peopleNumber * 499.99).toFixed(2)} leva left.`);
        }
    } else {
        if (peopleNumber * 249.99 > ticketBudget) {
            console.log(`Not enough money! You need ${(peopleNumber * 249.99 - ticketBudget).toFixed(2)} leva.`);
        } else {
            console.log(`Yes! You have ${(ticketBudget - peopleNumber * 249.99).toFixed(2)} leva left.`);
        }
    }
}

matchTickets([30000,
    "VIP",
    49
])