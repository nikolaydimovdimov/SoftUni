function specialNumbers(input) {
    let number = Number(input[0]);
    let outputString = "";

    for (counter = 1111; counter <= 9999; counter++) {
        let isSpecial = true;
        let currentNumber = counter;

        while (currentNumber > 0) {
            let digit = currentNumber % 10;
            currentNumber = parseInt(currentNumber / 10);

            if (number % digit !== 0) {
                isSpecial = false;
                break;
            }
        }

        if (isSpecial) {
            outputString += counter + " ";
        }
    }

    console.log(outputString);
}



specialNumbers(["3"]);