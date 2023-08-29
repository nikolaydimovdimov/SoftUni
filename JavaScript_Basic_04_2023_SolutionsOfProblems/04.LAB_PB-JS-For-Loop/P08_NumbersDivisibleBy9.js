function numbersDivisibleBy9(input) {
    let numberFirst = Number(input[0]);
    let numberSecond = Number(input[1]);
    let sumDiv9 = 0;
    let outputNumbers = '';


    for (currentNumber = numberFirst; currentNumber <= numberSecond; currentNumber++) {
        if (currentNumber % 9 === 0) {
            sumDiv9 += currentNumber;
            outputNumbers += `${currentNumber}\n`;
        }
    }
    console.log(`The sum: ${sumDiv9}`);
    console.log(outputNumbers);

}

numbersDivisibleBy9(["100", "200"])