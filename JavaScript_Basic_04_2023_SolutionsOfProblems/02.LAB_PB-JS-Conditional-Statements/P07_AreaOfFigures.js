function areaOfFigures(input) {
    let figureType = input[0];
    if (figureType === "square") {
        let a = Number(input[1]);
        console.log((a * a).toFixed(3));
    } else if (figureType === "rectangle") {
        let a = Number(input[1]);
        let b = Number(input[2]);
        console.log((a * b).toFixed(3));
    } else if (figureType === "circle") {
        let r = Number(input[1]);
        console.log((r * r * Math.PI).toFixed(3));
    } else if (figureType === "triangle") {
        let a = Number(input[1]);
        let ha = Number(input[2]);
        console.log((a * ha / 2).toFixed(3));
    }
}
areaOfFigures(["triangle",
    "4.5",
    "20"]);