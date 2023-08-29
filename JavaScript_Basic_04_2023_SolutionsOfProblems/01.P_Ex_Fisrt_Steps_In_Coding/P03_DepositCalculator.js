function depositCalculator(input) {
    let depositSum = Number(input[0]);
    let termOfDepositInMounth = Number(input[1]);
    let interstPercent = Number(input[2]);
    let endSum = depositSum + (depositSum * interstPercent / 100) * termOfDepositInMounth / 12;
    console.log(endSum);
}
depositCalculator(["2350",
    "6 ",
    "7 "]
);