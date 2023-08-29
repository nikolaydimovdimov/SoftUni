function fishland(input) {

    let mackerelCost = Number(input[0]);
    let sprinkleCost = Number(input[1]);
    let bonitoWeght = Number(input[2]);
    let safridWeight = Number(input[3]);
    let musselsWeight = Number(input[4]);

    console.log((bonitoWeght * mackerelCost * 1.6 + safridWeight * sprinkleCost * 1.8 + musselsWeight * 7.5).toFixed(2));
}

fishland(["6.90", "4.20", "1.5", "2.5", "1"])