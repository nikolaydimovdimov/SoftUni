function truckDriver(input) {
    let seasonType = input[0];
    let distance = Number(input[1]);

    let payment = 0.0;
    if (distance > 10000) {
        payment = distance * 1.45;
    } else if (distance > 5000) {
        switch (seasonType) {
            case "Spring":
            case "Autumn":
                payment = distance * 0.95;
                break;
            case "Summer":
                payment = distance * 1.1;
                break;
            case "Winter":
                payment = distance * 1.25;
                break;
        }
    } else {
        switch (seasonType) {
            case "Spring":
            case "Autumn":
                payment = distance * 0.75;
                break;
            case "Summer":
                payment = distance * 0.9;
                break;
            case "Winter":
                payment = distance * 1.05;
                break;
        }
    }
    payment = payment * 4;
    payment = payment * 0.9;
    console.log(payment.toFixed(2));
}

truckDriver(["Summer",
    3455
])