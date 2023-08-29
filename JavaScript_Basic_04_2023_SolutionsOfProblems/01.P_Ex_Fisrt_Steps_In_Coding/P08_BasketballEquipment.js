function basketballEquipment(input) {

    let yearCost = Number(input[0]);

    let sneakersCost = yearCost * 0.6;
    let outfitCost = sneakersCost * 0.8;
    let ball = outfitCost / 4;
    let accessories = ball / 5;

    console.log(yearCost + sneakersCost + outfitCost + ball + accessories);

}

basketballEquipment(

    ["550 "]
);