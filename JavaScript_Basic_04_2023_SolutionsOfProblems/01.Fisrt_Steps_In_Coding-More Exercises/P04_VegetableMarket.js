function vegetableMarket(input) {

    let vegetablesCost = Number(input[0]);
    let fruitsCost = Number(input[1]);
    let vegetablesWeight = Number(input[2]);
    let fruitsCostWeight = Number(input[3]);

    console.log(((vegetablesWeight * vegetablesCost + fruitsCostWeight * fruitsCost) / 1.94).toFixed(2));
}

vegetableMarket(["0.194", "19.4", "10", "10"]);
