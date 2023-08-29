function smallShop(input) {
    let productType = input[0];
    let cityName = input[1];
    let quantity = Number(input[2]);
    let productCost = 0.0;

    if (cityName === "Sofia") {
        switch (productType) {
            case "coffee":
                productCost = 0.5;
                break;
            case "water":
                productCost = 0.8;
                break;
            case "beer":
                productCost = 1.2;
                break;
            case "sweets":
                productCost = 1.45;
                break;
            case "peanuts":
                productCost = 1.6;
                break;
        }
    } else if (cityName === "Plovdiv") {
        switch (productType) {
            case "coffee":
                productCost = 0.4;
                break;
            case "water":
                productCost = 0.7;
                break;
            case "beer":
                productCost = 1.15;
                break;
            case "sweets":
                productCost = 1.3;
                break;
            case "peanuts":
                productCost = 1.5;
                break;
        }
    } else if (cityName === "Varna") {
        switch (productType) {
            case "coffee":
                productCost = 0.45;
                break;
            case "water":
                productCost = 0.7;
                break;
            case "beer":
                productCost = 1.1;
                break;
            case "sweets":
                productCost = 1.35;
                break;
            case "peanuts":
                productCost = 1.55;
                break;
        }
    }
    console.log(productCost * quantity);
}

smallShop(["beer",
    "Sofia",
    "2"])


