function skeleton(input) {
    let controlTimeMin = Number(input[0]);
    let controlTimeSec = Number(input[1]);
    let distanceM = Number(input[2]);
    let time100M = Number(input[3]);

    let controTime = controlTimeMin * 60 + controlTimeSec;
    let newTime = distanceM * time100M / 100 - distanceM / 120 * 2.5;

    if (newTime <= controTime) {
        console.log("Marin Bangiev won an Olympic quota!");
        console.log(`His time is ${newTime.toFixed(3)}.`);
    } else {
        console.log(`No, Marin failed! He was ${(newTime - controTime).toFixed(3)} second slower.`);
    }
}

skeleton(["1",
    "20",
    "1546",
    "12"])

