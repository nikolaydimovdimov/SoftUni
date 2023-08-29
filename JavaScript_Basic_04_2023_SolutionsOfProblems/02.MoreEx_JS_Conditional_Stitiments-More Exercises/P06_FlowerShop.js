function flowerShop(input) {
    
    let magnoliasNumber = Number(input[0]);
    let springFlowersNumber = Number(input[1]);
    let rosesNumber = Number(input[2]);
    let cactiNumber = Number(input[3]);
    let giftCost = Number(input[4]);

    let profit = (magnoliasNumber * 3.25 + springFlowersNumber * 4 + rosesNumber * 3.5 + cactiNumber * 8) * 0.95;

    if (profit < giftCost) {
        console.log(`She will have to borrow ${Math.ceil(giftCost - profit)} leva.`);
    } else {
        console.log(`She is left with ${Math.floor(profit - giftCost)} leva.`);
    }
}