function numberPyramid(input) {
    let number = Number(input[0]);
    let counter = 0;
    let lineString = "";

    for (let i = 1; i <= number; i++) {
        for (let j = 1; j <= i; j++) {
            if (++counter > number) {
                break;
            }
            lineString += counter + " ";
        }
        console.log(lineString);
        lineString = "";
        if (counter > number) break;
    }
}

numberPyramid([15]);
