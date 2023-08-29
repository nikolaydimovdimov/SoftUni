function fruitShop(input) {
    let fruitType = input[0];
    let weekDay = input[1];
    let quantityFruits = Number(input[2]);
    let fruitCost = 0.0;

    switch (weekDay) {
        case "Monday":
        case "Tuesday":
        case "Wednesday":
        case "Thursday":
        case "Friday":
            switch (fruitType) {
                case "banana":
                    fruitCost = 2.5;
                    break;
                case "apple":
                    fruitCost = 1.2;
                    break;
                case "orange":
                    fruitCost = 0.85;
                    break;
                case "grapefruit":
                    fruitCost = 1.45;
                    break;
                case "kiwi":
                    fruitCost = 2.7;
                    break;
                case "pineapple":
                    fruitCost = 5.5;
                    break;
                case "grapes":
                    fruitCost = 3.85;
                    break;
                default:
                    console.log("error")
                    break;
            }
            break;
        case "Saturday":
        case "Sunday":
            switch (fruitType) {
                case "banana":
                    fruitCost = 2.7;
                    break;
                case "apple":
                    fruitCost = 1.25;
                    break;
                case "orange":
                    fruitCost = 0.9;
                    break;
                case "grapefruit":
                    fruitCost = 1.6;
                    break;
                case "kiwi":
                    fruitCost = 3;
                    break;
                case "pineapple":
                    fruitCost = 5.6;
                    break;
                case "grapes":
                    fruitCost = 4.2;
                    break;
                default:
                    console.log("error")
                    break;
            }
            break;
        default:
            console.log("error")
            break;
    }
    if (fruitCost > 0) {
        console.log((fruitCost * quantityFruits).toFixed(2));
    }
}

fruitShop(["tomato",
    "Monday",
    "0.5"])




