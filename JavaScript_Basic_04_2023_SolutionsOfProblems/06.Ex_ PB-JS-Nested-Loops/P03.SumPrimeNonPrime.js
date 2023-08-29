function sumPrimeNonPrime(input) {
    let sumPrimeNumber = 0;
    let sumNonPrimeNumber = 0;
    let index = 0;

    while (input[index] !== "stop") {
        let currentNumber = Number(input[index]);
        if (currentNumber < 0) {
            console.log("Number is negative.");
            index++;
            continue;
        }
        let isPrime = true;

        for (divisor = 2; divisor <= parseInt(currentNumber / 2); divisor++) {
            if (currentNumber % divisor === 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            sumPrimeNumber += currentNumber;
        } else {
            sumNonPrimeNumber += currentNumber;
        }

        index++;
    }
    console.log(`Sum of all prime numbers is: ${sumPrimeNumber}`);
    console.log(`Sum of all non prime numbers is: ${sumNonPrimeNumber}`);
}

sumPrimeNonPrime(["0",
    "-9",
    "0",
    "stop"])


