function radianToDegrees(input) {
    let radian = Number(input[0]);
    const ratio = 180 / Math.PI;
    let degrees = radian * ratio;
    console.log(degrees);
}
radianToDegrees(["6.2832"]);