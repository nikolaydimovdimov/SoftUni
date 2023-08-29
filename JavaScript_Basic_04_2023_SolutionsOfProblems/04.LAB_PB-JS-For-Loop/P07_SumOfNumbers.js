function sumOfNumbers(input) {
    let numberInputText = input.toString();
    let sumOfDigits = 0;

    for (i = 0; i < numberInputText.length; i++) {
        sumOfDigits += Number(numberInputText[i]);
    }
    console.log(`The sum of the digits is:${sumOfDigits}`);
}

sumOfNumbers(["12345"])

