function minNumber(input) {
    let smallestNumber = Number.MAX_SAFE_INTEGER;
    let i = 0;
    while (input[i] !== "Stop") {
        let currentNumber = Number(input[i]);
        if (currentNumber < smallestNumber) {
            smallestNumber = currentNumber;
        }
        i++;
    }
    console.log(smallestNumber);
}
minNumber(["-10",
    "20",
    "-30",
    "Stop"])
