function equalSumsEvenOddPosition(input) {
    let numberStart = Number(input[0]);
    let numberEnd = Number(input[1]);
    let outputString = "";

    for (let i = numberStart; i <= numberEnd; i++) {
        let sumNumEvenPosition = 0;
        let sumNumOddPosition = 0;
        let currentNumber = i;

        while (currentNumber > 0) {
            sumNumEvenPosition += currentNumber % 10;
            currentNumber = parseInt(currentNumber / 10);
            sumNumOddPosition += currentNumber % 10;
            currentNumber = parseInt(currentNumber / 10);
        }

        if (sumNumEvenPosition === sumNumOddPosition) {
            outputString += i + " ";
        }
    }
    console.log(outputString);
}

equalSumsEvenOddPosition(["100",
    "300"])


