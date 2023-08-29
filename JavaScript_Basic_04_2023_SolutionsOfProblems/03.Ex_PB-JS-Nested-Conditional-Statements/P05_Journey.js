function journey(input) {
    let budget = Number(input[0]);
    let season = input[1];

    let accommodation = "";
    let destination = "";
    let holidaysCost = 0.0;

    if (budget <= 100) {
        destination = "Bulgaria";
        if (season === "summer") {
            accommodation = "Camp";
            holidaysCost = budget * 0.3;
        } else {
            accommodation = "Hotel";
            holidaysCost = budget * 0.7;
        }
    } else if (budget <= 1000) {
        destination = "Balkans";
        if (season === "summer") {
            accommodation = "Camp";
            holidaysCost = budget * 0.4;
        } else {
            accommodation = "Hotel";
            holidaysCost = budget * 0.8;
        }
    } else {
        destination = "Europe";
        accommodation = "Hotel";
        holidaysCost = budget * 0.9;
    }
    console.log(`Somewhere in ${destination}`);
    console.log(`${accommodation} - ${holidaysCost.toFixed(2)}`);
}

journey(["1500", "summer"])