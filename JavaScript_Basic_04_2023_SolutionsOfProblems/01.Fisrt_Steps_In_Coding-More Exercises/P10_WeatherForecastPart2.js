function weatherForecastPart2(input) {
    let degreesC = Number(input[0]);

    if ((degreesC >= 5) && (degreesC <= 35)) {
        if (degreesC < 12) {
            console.log("Cold");
        } else if (degreesC < 15) {
            console.log("Cool");
        } else if (degreesC <= 20) {
            console.log("Mild");
        } else if (degreesC < 26) {
            console.log("Warm");
        } else {
            console.log("Hot");
        }
    } else {
        console.log("unknown");
    }
}

weatherForecastPart2([0]);
