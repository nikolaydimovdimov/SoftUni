function bikeRace(input) {
    let juniorsNumber = Number(input[0]);
    let seniorsNumber = Number(input[1]);
    let routeType = input[2];

    let donatedSum = 0.0;

    switch (routeType) {
        case "trail":
            donatedSum = juniorsNumber * 5.5 + seniorsNumber * 7;
            break;
        case "cross-country":
            donatedSum = juniorsNumber * 8 + seniorsNumber * 9.5;
            if ((juniorsNumber + seniorsNumber) >= 50) {
                donatedSum = donatedSum * 0.75;
            }
            break;
        case "downhill":
            donatedSum = juniorsNumber * 12.25 + seniorsNumber * 13.75;
            break;
        case "road":
            donatedSum = juniorsNumber * 20 + seniorsNumber * 21.5;
            break;
    }

    donatedSum = donatedSum * 0.95;
    console.log(donatedSum.toFixed(2));
}

bikeRace([30,
    25,
    "cross-country" 
    
    
    ])