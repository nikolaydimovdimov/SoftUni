function vacation(input) {
    let tripCost = Number(input[0]);
    let savedMoney = Number(input[1]);
    let i = 2, spendDayCounter = 0;
    while (spendDayCounter < 5 && savedMoney < tripCost) {
        let action = input[i];
        i++;
        if (action === "spend") {
            spendDayCounter++;
            savedMoney -= Number(input[i]);
            if (savedMoney < 0) {
                savedMoney = 0;
            }
        } else {
            spendDayCounter = 0;
            savedMoney += Number(input[i]);
        }
        i++;
    }
    if (spendDayCounter === 5) {
        console.log("You can't save the money.");
        console.log((i - 2) / 2);
    } else {
        console.log(`You saved the money for ${(i - 2) / 2} days.`);
    }
}
vacation(["110",
    "60",
    "spend",
    "10",
    "spend",
    "10",
    "spend",
    "10",
    "spend",
    "10",
    "spend",
    "10"])

