function harvest(input) {

    let areaSqrM = Number(input[0]);
    let grapePerSqrMKg = Number(input[1]);
    let neededWineLtr = Number(input[2]);
    let numberWorkers = Number(input[3]);

    let producedWineLtr = grapePerSqrMKg * areaSqrM * 0.4 / 2.5;

    if (neededWineLtr > producedWineLtr) {
        console.log(`It will be a tough winter! More ${Math.floor(neededWineLtr - producedWineLtr)} liters wine needed.`)
    } else {
        console.log(`Good harvest this year! Total wine: ${Math.floor(producedWineLtr)} liters.`)
        console.log(`${Math.ceil(producedWineLtr - neededWineLtr)} liters left -> ${Math.ceil((producedWineLtr - neededWineLtr) / numberWorkers)} liters per person.`)
    }
}

harvest(["1020",
    "1.5",
    "425",
    "4"
]

)