function celsiusToFahrenheit(input) {
    let degreesC = Number(input[0]);

    console.log((degreesC * 1.8 + 32).toFixed(2));
}

celsiusToFahrenheit(["38"]);
