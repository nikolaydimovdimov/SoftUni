function courierExpress(input) {
    let weightShipment = Number(input[0]);
    let serviceType = input[1];
    let distance = Number(input[2]);
    let price = 0.0;
    let markup = 0.0;

    switch (serviceType) {
        case "standard":
            if (weightShipment < 1) {
                price = 0.03;
            } else if (weightShipment < 10) {
                price = 0.05;
            } else if (weightShipment < 40) {
                price = 0.10;
            } else if (weightShipment < 90) {
                price = 0.15;
            } else {
                price = 0.20;
            }
            break;
        case "express":
            if (weightShipment < 1) {
                price = 0.03;
                markup = 0.8 * price * weightShipment;
            } else if (weightShipment < 10) {
                price = 0.05;
                markup = 0.4 * price * weightShipment;
            } else if (weightShipment < 40) {
                price = 0.10;
                markup = 0.05 * price * weightShipment;
            } else if (weightShipment < 90) {
                price = 0.15;
                markup = 0.02 * price * weightShipment;
            } else {
                price = 0.20;
                markup = 0.01 * price * weightShipment;
            }
            break;
    }

    let totalPrice = price * distance + markup * distance;

    console.log(`The delivery of your shipment with weight of ${weightShipment.toFixed(3)} kg. would cost ${(totalPrice).toFixed(2)} lv.`);
}

courierExpress(["87",
"express",
"130"])




