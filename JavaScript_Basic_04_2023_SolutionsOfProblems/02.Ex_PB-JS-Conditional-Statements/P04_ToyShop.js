function toyShop(input) {

    let tripCost = Number(input[0]);
    let puzzles = Number(input[1]);
    let dolls = Number(input[2]);
    let bears = Number(input[3]);
    let minions = Number(input[4]);
    let tracks = Number(input[5]);

    let profit = puzzles * 2.6 + dolls * 3 + bears * 4.1 + minions * 8.2 + tracks * 2;
    if (puzzles + dolls + bears + minions + tracks >= 50) {
        profit = profit * 0.75;
    }
    profit = profit * 0.9;
    if (profit < tripCost) {
        console.log(`Not enough money! ${(tripCost - profit).toFixed(2)} lv needed.`);
    } else {
        console.log(`Yes! ${(profit - tripCost).toFixed(2)} lv left.`);
    }
}

toyShop(["320",
    "8",
    "2",
    "5",
    "5",
    "1"])


