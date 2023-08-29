function braceletStand(input) {
    let pocketMoney = Number(input[0]);
    let earnedMoneyPerDay = Number(input[1]);
    let totalExpense = Number(input[2]);
    let giftCost = Number(input[3]);

    let savedMoney = 5 * (pocketMoney + earnedMoneyPerDay) - totalExpense;

    if (giftCost > savedMoney) {
        console.log(`Insufficient money: ${(giftCost - savedMoney).toFixed(2)} BGN.`);
    } else {
        console.log(`Profit: ${savedMoney.toFixed(2)} BGN, the gift has been purchased.`);
    }
}

braceletStand(["2.10",
    "17.50",
    "20.20",
    "148.50"])

