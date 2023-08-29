function housePainting(input) {
    let x = Number(input[0]);
    let y = Number(input[1]);
    let h = Number(input[2]);

    let wallsArea = 2 * (x * (x + y) - 1.2 - 1.5 * 1.5);
    let roofArea = x * (h + 2 * y);

    console.log((wallsArea / 3.4).toFixed(2));
    console.log((roofArea / 4.3).toFixed(2));
}

housePainting(["6", "10", "5.2"])