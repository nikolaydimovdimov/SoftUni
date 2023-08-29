function coins(input) {
    const coinsType = [200, 100, 50, 20, 10, 5, 2, 1];
    let amount = parseInt(Number(input[0]) * 100);
    let coinsCounter = 0;
    let i = 0;
    while (amount > 0) {
        coinsCounter += Math.floor(amount / coinsType[i]);
        amount %= coinsType[i];
        i++;
    }
    console.log(coinsCounter);
}
coins(["2.73"])

