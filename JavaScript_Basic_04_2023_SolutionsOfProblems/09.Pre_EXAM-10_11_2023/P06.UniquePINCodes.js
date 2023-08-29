function uniquePINCodes(input) {
    let maxNumber1 = Number(input[0]);
    let maxNumber2 = Number(input[1]);
    let maxNumber3 = Number(input[2]);

    for (let n1 = 2; n1 <= maxNumber1; n1++) {
        if (n1 % 2 !== 0) {
            continue;
        }
        for (let n2 = 2; (n2 <= maxNumber2) && (n2 <= 7); n2++) {
            let isPrime = true;
            for (let i = 2; i <= parseInt(n2 / 2); i++) {
                if (n2 % i === 0) {
                    isPrime = false;
                    break;
                }
            }
            if (!isPrime) {
                continue;
            }
            for (let n3 = 2; n3 <= maxNumber3; n3++) {
                if (n3 % 2 !== 0) {
                    continue
                }
                console.log(n1 + " " + n2 + " " + n3);
            }
        }
    }
}

uniquePINCodes(["9",
    "8",
    "8"])

