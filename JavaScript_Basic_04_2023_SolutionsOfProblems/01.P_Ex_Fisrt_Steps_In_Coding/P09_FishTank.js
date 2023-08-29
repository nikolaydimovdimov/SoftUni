function fishTank(input) {

    let lengthOfThankcm = Number(input[0]);
    let widthOfThankcm = Number(input[1]);
    let heightOfThankcm = Number(input[2]);
    let percentOfSand = Number(input[3]);

    let volumeOfThankdm = lengthOfThankcm * widthOfThankcm * heightOfThankcm / 1000;

    console.log(volumeOfThankdm * (1 - percentOfSand / 100));

}

fishTank(
    ["105 ",
        "77 ",
        "89 ",
        "18.5 "]



);