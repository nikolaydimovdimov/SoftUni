function skiTrip(input) {
    let dayStay = Number(input[0]);
    let roomType = input[1];
    let ratingType = input[2];

    let holidayCost = 0.0;

    switch (roomType) {
        case "room for one person":
            holidayCost = (dayStay - 1) * 18;
            break;
        case "apartment":
            holidayCost = (dayStay - 1) * 25;
            if (dayStay > 15) {
                holidayCost = holidayCost * 0.5;
            } else if (dayStay >= 10) {
                holidayCost = holidayCost * 0.65;
            } else {
                holidayCost = holidayCost * 0.7;
            }
            break;
        case "president apartment":
            holidayCost = (dayStay - 1) * 35;
            if (dayStay > 15) {
                holidayCost = holidayCost * 0.8;
            } else if (dayStay >= 10) {
                holidayCost = holidayCost * 0.85;
            } else {
                holidayCost = holidayCost * 0.9;
            }
            break;
    }
    if (ratingType === "positive") {
        holidayCost = holidayCost * 1.25;
    } else {
        holidayCost = holidayCost * 0.9;
    }
    console.log(holidayCost.toFixed(2));
}

skiTrip(["2",
"apartment",
"positive"])



