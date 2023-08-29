function maxNumber(input) {
    let biggestNumber = Number.MIN_SAFE_INTEGER;
    let i = 0;
    while (input[i] !== "Stop") {
        let currentNumber = Number(input[i]);
        if (currentNumber > biggestNumber) {
            biggestNumber = currentNumber;
        }
        i++;
    }
    console.log(biggestNumber);
}
maxNumber(["45",
    "-20",
    "7",
    "99",
    "Stop"])

