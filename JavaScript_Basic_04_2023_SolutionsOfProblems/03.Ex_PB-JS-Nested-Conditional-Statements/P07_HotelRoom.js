function hotelRoom(input) {
    let monthName = input[0];
    let stayNumber = Number(input[1]);

    let totalCostStudio = 0.0;
    let totalCostApartment = 0.0;

    switch (monthName) {
        case "May":
        case "October":
            totalCostApartment = stayNumber * 65;
            totalCostStudio = stayNumber * 50;
            if (stayNumber > 14) {
                totalCostStudio = totalCostStudio * 0.7;
                totalCostApartment = totalCostApartment * 0.9;
            } else if (stayNumber > 7) {
                totalCostStudio = totalCostStudio * 0.95;
            }
            break;
        case "June":
        case "September":
            totalCostApartment = stayNumber * 68.7;
            totalCostStudio = stayNumber * 75.2;
            if (stayNumber > 14) {
                totalCostStudio = totalCostStudio * 0.8;
                totalCostApartment = totalCostApartment * 0.9;
            }
            break;
        case "July":
        case "August":
            totalCostApartment = stayNumber * 77;
            totalCostStudio = stayNumber * 76;
            if (stayNumber > 14) {
                totalCostApartment = totalCostApartment * 0.9;
            }
            break;
    }
    console.log(`Apartment: ${totalCostApartment.toFixed(2)} lv.`);
    console.log(`Studio: ${totalCostStudio.toFixed(2)} lv.`);
}

hotelRoom(["August",
    "20"])


