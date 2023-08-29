function accountBalance(input) {
    let i = 0, curreentBalance = 0;
    while (input[i] !== "NoMoreMoney") {
        let money = Number(input[i]);
        if (money < 0) {
            console.log("Invalid operation!")
            break;
        }
        curreentBalance += money;
        console.log(`Increase: ${money.toFixed(2)}`);
        i++;
    }
    console.log(`Total: ${curreentBalance.toFixed(2)}`);
}
accountBalance(["120",
    "45.55",
    "-150"])

