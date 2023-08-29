function transportPrice(input) {

    let n = Number(input[0]);
    let period = input[1];

    if (n >= 100) {
        console.log(`${(n * .06).toFixed(2)}`);
    } else if (n >= 20) {
        console.log(`${(n * .09).toFixed(2)}`);
    } else if (period === "day") {
        console.log(`${((0.7 + n * 0.79)).toFixed(2)
            } `);
    } else {
        console.log(`${(0.7 + n * 0.9).toFixed(2)} `);
    }
}

transportPrice(["25", "day"])