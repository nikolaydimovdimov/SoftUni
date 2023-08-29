function worldSwimmingRecord(input) {
    let recordSecs = Number(input[0]);
    let distanceMets = Number(input[1]);
    let oneMetsTime = Number(input[2]);

    let currentTime = distanceMets * oneMetsTime + (Math.floor(distanceMets / 15)) * 12.5;

    if (currentTime < recordSecs) {
        console.log(`Yes, he succeeded! The new world record is ${currentTime.toFixed(2)} seconds.`);
    } else {
        console.log(`No, he failed! He was ${(currentTime - recordSecs).toFixed(2)} seconds slower.`);
    }
}

worldSwimmingRecord(["55555.67",
    "3017",
    "5.03"])

