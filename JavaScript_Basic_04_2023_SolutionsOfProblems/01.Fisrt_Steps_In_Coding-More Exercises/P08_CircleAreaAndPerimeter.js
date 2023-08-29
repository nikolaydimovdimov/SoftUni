function circleAreaAndPerimeter(input) {
    let r = Number(input[0]);
    console.log((Math.PI * r * r).toFixed(2));
    console.log((2 * Math.PI * r).toFixed(2));
}
circleAreaAndPerimeter(["3"]);
