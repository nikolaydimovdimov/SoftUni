function sumOfTwoNumbers(input) {
    let startNumber = Number(input[0]);
    let endNumber = Number(input[1]);
    let magicNumber = Number(input[2]);
    let counter = 0;
    let isFindMagicSum = false;

    for (let i = startNumber; i <= endNumber; i++) {
        for (let j = startNumber; j <= endNumber; j++) {
            counter++;
            if (i + j === magicNumber) {
                console.log(`Combination N:${counter} (${i} + ${j} = ${magicNumber})`);
                isFindMagicSum = true;
                break;
            }
        }
        if (isFindMagicSum) {
            break;
        }
    }
    if (!isFindMagicSum) {
        console.log(`${counter} combinations - neither equals ${magicNumber}`);
    }
}
sumOfTwoNumbers(["88", 
"888", 
"2000"])

