function tradeCommissions(input) {
    let cityName = input[0];
    let salesValue = Number(input[1]);

    if (salesValue > 10000) {
        switch (cityName) {
            case "Sofia":
                console.log((0.12 * salesValue).toFixed(2));
                break;
            case "Varna":
                console.log((0.13 * salesValue).toFixed(2));
                break;
            case "Plovdiv":
                console.log((0.145 * salesValue).toFixed(2));
                break;
            default:
                console.log("error");
                break;
        }
    } else if (salesValue > 1000) {
        switch (cityName) {
            case "Sofia":
                console.log((0.08 * salesValue).toFixed(2));
                break;
            case "Varna":
                console.log((0.1 * salesValue).toFixed(2));
                break;
            case "Plovdiv":
                console.log((0.12 * salesValue).toFixed(2));
                break;
            default:
                console.log("error");
                break;
        }
    } else if (salesValue > 500) {
        switch (cityName) {
            case "Sofia":
                console.log((0.07 * salesValue).toFixed(2));
                break;
            case "Varna":
                console.log((0.075 * salesValue).toFixed(2));
                break;
            case "Plovdiv":
                console.log((0.08 * salesValue).toFixed(2));
                break;
            default:
                console.log("error");
                break;
        }
    } else if (salesValue > 0) {
        switch (cityName) {
            case "Sofia":
                console.log((0.05 * salesValue).toFixed(2));
                break;
            case "Varna":
                console.log((0.045 * salesValue).toFixed(2));
                break;
            case "Plovdiv":
                console.log((0.055 * salesValue).toFixed(2));
                break;
            default:
                console.log("error");
                break;
        }
    } else {
        console.log("error");
    }
}

tradeCommissions (["Kaspichan",
"50"])




