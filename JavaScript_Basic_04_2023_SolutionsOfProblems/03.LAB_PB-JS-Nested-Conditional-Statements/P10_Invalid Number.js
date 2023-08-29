function invalidNumber(input) {
    let numberValue = Number(input[0]);

    if (numberValue != 0 && (numberValue < 100 || numberValue > 200)) {
        console.log("invalid");
    }
}

invalidNumber(["0"])