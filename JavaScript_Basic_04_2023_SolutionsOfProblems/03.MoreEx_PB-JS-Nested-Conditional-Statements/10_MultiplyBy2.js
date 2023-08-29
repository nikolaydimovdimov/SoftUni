function multiplyBy2(input) {
    let i = 0;
    let realNumber = Number(input[0]);
    do {
        console.log(`Result: ${(realNumber * 2).toFixed(2)}`);
        i++;
        realNumber = Number(input[i]);
    } while (realNumber >= 0);
    console.log("Negative number!");
}

multiplyBy2([2, 3, -1])