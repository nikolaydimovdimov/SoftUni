function numberInRange(input) {
    let numberValue = Number(input[0]);

    if (numberValue >= -100 && numberValue <= 100 && numberValue != 0) {
        console.log("Yes");
    } else {
        console.log("No");
    }
}

numberInRange([0])