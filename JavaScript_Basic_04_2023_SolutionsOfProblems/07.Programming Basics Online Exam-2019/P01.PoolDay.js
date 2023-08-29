function poolDay(input){
    let peopleNumber=Number(input[0]);
    let entranceFee=Number(input[1]);
    let costSunLounger=Number(input[2]);
    let costUmbrella=Number(input[3]);

    let totalCost=peopleNumber*entranceFee;
    totalCost+=Math.ceil(peopleNumber*0.75)*costSunLounger;
    totalCost+=Math.ceil(peopleNumber*0.5)*costUmbrella;

    console.log(`${totalCost.toFixed(2)} lv.`)
}

poolDay([21,
    5.50,
    4.40,
    6.20
    ])