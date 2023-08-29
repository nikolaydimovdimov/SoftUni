function sleepyTomCat(input) {
    let hollydays = Number(input[0]);
    let playTimeMins = (365 - hollydays) * 63 + hollydays * 127;

    if (playTimeMins > 30000) {
        console.log("Tom will run away");
        console.log(`${Math.floor((playTimeMins - 30000) / 60)} hours and ${(playTimeMins - 30000) % 60} minutes more for play`)
    } else {
        console.log("Tom sleeps well");
        console.log(`${Math.floor((30000 - playTimeMins) / 60)} hours and ${(30000 - playTimeMins) % 60} minutes less for play`)
    }
}

sleepyTomCat(["113"]);