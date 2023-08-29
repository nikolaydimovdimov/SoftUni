function cleverLily(input) {
    let age = Number(input[0]);
    let washingMachineCost = Number(input[1]);
    let toyCost = Number(input[2]);
    let savedMoney = 0, giftMoney = 10;

    for (let i = 1; i <= age; i += 2) {
        savedMoney += toyCost;
        if (i < age) {
            savedMoney += giftMoney - 1;
            giftMoney += 10;
        }
    }
    if (savedMoney < washingMachineCost) {
        console.log(`No! ${(washingMachineCost - savedMoney).toFixed(2)}`);
    } else {
        console.log(`Yes! ${(savedMoney - washingMachineCost).toFixed(2)}`);
    }
}
cleverLily(["21",
    "1570.98",
    "3"])

