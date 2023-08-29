function lunchBreak(input) {
    let filmName = input[0];
    let filmTime = Number(input[1]);
    let restTime = Number(input[2]);

    let watchTime = restTime * (1 - (1 / 8) - (1 / 4));

    if (watchTime < filmTime) {
        console.log(`You don't have enough time to watch ${filmName}, you need ${Math.ceil(filmTime - watchTime)} more minutes.`);
    } else {
        console.log(`You have enough time to watch ${filmName} and left with ${Math.ceil(watchTime - filmTime)} minutes free time.`)
    }
}

lunchBreak(["Teen Wolf",
    "48",
    "60"])

