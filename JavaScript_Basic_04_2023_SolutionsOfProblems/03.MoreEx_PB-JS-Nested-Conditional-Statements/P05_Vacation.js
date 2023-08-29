function vacation(input) {
    let budget = Number(input[0]);
    let seasonType = input[1];

    let accommodation = "";
    let destination = "";
    let holidayCost = 0.0;

    if (budget > 3000) {
        accommodation = "Hotel";
        if (seasonType === "Summer") {
            destination = "Alaska";
        } else {
            destination = "Morocco";
        }
        holidayCost = budget * 0.9;
    } else
        if (budget > 1000) {
            accommodation = "Hut";
            if (seasonType === "Summer") {
                destination = "Alaska";
                holidayCost = budget * 0.8;
            } else {
                destination = "Morocco";
                holidayCost = budget * 0.6;
            }
        } else {
            accommodation = "Camp";
            if (seasonType === "Summer") {
                destination = "Alaska";
                holidayCost = budget * 0.65;
            } else {
                destination = "Morocco";
                holidayCost = budget * 0.45;
            }
        }
    console.log(`${destination} - ${accommodation} - ${holidayCost.toFixed(2)}`);
}

vacation([800,
    "Summer"
])