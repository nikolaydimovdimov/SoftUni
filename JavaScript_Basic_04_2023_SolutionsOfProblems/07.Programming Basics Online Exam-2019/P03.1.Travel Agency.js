function travelAgency(input) {
    let dayNumber = Number(input[3]);

    if (dayNumber >= 1) {

        let destination = input[0];
        let packageType = input[1];
        let isVIP = true;

        if (input[2] !== "yes") {
            isVIP = false;
        }

        if (dayNumber > 7) dayNumber--;

        let price = 0.0;
        let isDataCorrect = true;

        switch (destination) {
            case "Bansko":
            case "Borovets":
                if (packageType === "noEquipment") {
                    price = 80;
                    if (isVIP) price *= 0.95;
                } else if (packageType === "withEquipment") {
                    price = 100;
                    if (isVIP) price *= 0.9;
                } else {
                    isDataCorrect = false;
                }
                break;

            case "Varna":
            case "Burgas":
                if (packageType === "noBreakfast") {
                    price = 100;
                    if (isVIP) price *= 0.93;
                } else if (packageType === "withBreakfast") {
                    price = 130;
                    if (isVIP) price *= 0.88;
                } else {
                    isDataCorrect = false;
                }
                break;
            default:
                isDataCorrect = false;
                break;
        }

        if (isDataCorrect) {
            price *= dayNumber;
            console.log(`The price is ${price.toFixed(2)}lv! Have a nice time!`);
        } else {
            console.log("Invalid input!");
        }

    } else {
        console.log("Days must be positive number!");
    }
}

travelAgency(["Varna",
    "withBreakfast",
    "yes",
    5	
    
    
    
    


])