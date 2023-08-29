function fuelTank(input) {
    let fuelType = input[0];
    let fuelQuantity = Number(input[1]);

    if (fuelType === "Diesel" || fuelType === "Gasoline" || fuelType === "Gas") {
        if (fuelQuantity < 25) {
            console.log(`Fill your tank with ${fuelType.toLowerCase()}!`);
        } else {
            console.log(`You have enough ${fuelType.toLowerCase()}.`);
        }
    } else {
        console.log("Invalid fuel!");
    }
}

fuelTank(["Diesel",
    10]
)