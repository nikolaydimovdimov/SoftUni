function moving(input) {
    let volumeOfHouse = Number(input[0]) * Number(input[1]) * Number(input[2]);
    let i = 3;
    while (input[i] !== "Done" && volumeOfHouse > 0) {
        volumeOfHouse -= Number(input[i]);
        i++;
    }
    if (volumeOfHouse > 0) {
        console.log(`${volumeOfHouse} Cubic meters left.`);
    } else {
        console.log(`No more free space! You need ${-volumeOfHouse} Cubic meters more.`);
    }
}
moving(["10",
    "1",
    "2",
    "4",
    "6",
    "Done"])

