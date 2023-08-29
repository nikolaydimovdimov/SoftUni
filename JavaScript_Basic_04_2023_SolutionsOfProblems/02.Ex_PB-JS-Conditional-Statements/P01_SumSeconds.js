function sumSeconds(input) {
    let time = Number(input[0]) + Number(input[1]) + Number(input[2]);
    let minutes = Math.floor(time / 60);
    let secundes = time % 60;
    if (secundes < 10) {
        console.log(`${minutes}:0${secundes}`);
    } else {
        console.log(`${minutes}:${secundes}`);
    }
}

sumSeconds(["14", "12",
    "10"])
