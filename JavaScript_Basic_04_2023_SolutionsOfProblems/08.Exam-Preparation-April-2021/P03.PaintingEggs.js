function paintingEggs(input) {
    let eggsSize = input[0];
    let eggsColor = input[1];
    let batchNumber = Number(input[2]);

    let batchCost = 0.0;

    switch (eggsSize) {
        case "Large":
            if (eggsColor === "Red") {
                batchCost = 16;
            } else if (eggsColor === "Green") {
                batchCost = 12;
            } else {
                batchCost = 9;
            }
            break;
        case "Medium":
            if (eggsColor === "Red") {
                batchCost = 13;
            } else if (eggsColor === "Green") {
                batchCost = 9;
            } else {
                batchCost = 7;
            }
            break;
        case "Small":
            if (eggsColor === "Red") {
                batchCost = 9;
            } else if (eggsColor === "Green") {
                batchCost = 8;
            } else {
                batchCost = 5;
            }
            break;
    }

    console.log(`${(batchCost * batchNumber * 0.65).toFixed(2)} leva.`);
}

paintingEggs(["Medium",
    "Green",
    "5"])

