function schoolCamp(input) {

    let seasonType = input[0];
    let groupType = input[1];
    let studentsNumber = Number(input[2]);
    let stayNumber = Number(input[3]);

    let stayCost = 0.0;
    let sportType = "";

    switch (seasonType) {
        case "Winter":
            if (groupType === "boys") {
                sportType = "Judo";
                stayCost = stayNumber * 9.6;
            } else if (groupType === "girls") {
                sportType = "Gymnastics";
                stayCost = stayNumber * 9.6;
            } else {
                sportType = "Ski";
                stayCost = stayNumber * 10;
            }
            break;
        case "Spring":
            if (groupType === "boys") {
                sportType = "Tennis";
                stayCost = stayNumber * 7.2;
            } else if (groupType === "girls") {
                sportType = "Athletics";
                stayCost = stayNumber * 7.2;
            } else {
                sportType = "Cycling";
                stayCost = stayNumber * 9.5;
            }
            break;
        case "Summer":
            if (groupType === "boys") {
                sportType = "Football";
                stayCost = stayNumber * 15;
            } else if (groupType === "girls") {
                sportType = "Volleyball";
                stayCost = stayNumber * 15;
            } else {
                sportType = "Swimming";
                stayCost = stayNumber * 20;
            }
            break;
    }
    if (studentsNumber >= 50) {
        stayCost = stayCost * 0.5;
    } else if (studentsNumber >= 20) {
        stayCost = stayCost * 0.85;
    } else if (studentsNumber >= 10) {
        stayCost = stayCost * 0.95;
    }
    console.log(`${sportType} ${(stayCost * studentsNumber).toFixed(2)} lv.`);
}

schoolCamp(["Spring",
    "girls",
    20,
    7
]);