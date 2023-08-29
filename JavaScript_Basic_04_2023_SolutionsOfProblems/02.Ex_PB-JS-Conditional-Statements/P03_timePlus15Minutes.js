function timePlus15Minutes(input) {
    let hours = Number(input[0]);
    let minutes = Number(input[1]);
    let totalMinutes = hours * 60 + minutes + 15;
    hours = Math.floor(totalMinutes / 60);
    if (hours >= 24) {
        hours = hours - 24;
    }
    minutes = totalMinutes % 60;
    if (minutes < 10) {
        console.log(`${hours}:0${minutes}`);
    } else {
        console.log(`${hours}:${minutes}`);
    }
}

timePlus15Minutes(["1", "46"])
