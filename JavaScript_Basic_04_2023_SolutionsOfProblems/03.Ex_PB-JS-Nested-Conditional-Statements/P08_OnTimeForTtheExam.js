function onTimeForTheExam(input) {
    let examHour = Number(input[0]);
    let examMinutes = Number(input[1]);
    let arrivalHour = Number(input[2]);
    let arrivalMinutes = Number(input[3]);

    let examTimeMins = examHour * 60 + examMinutes;
    let arrivalTimeMins = arrivalHour * 60 + arrivalMinutes;

    let timeDifference = examTimeMins - arrivalTimeMins;
    let differenceHours = Math.floor(Math.abs(timeDifference) / 60);
    let differenceMinutes = Math.abs(timeDifference) % 60;

    if (timeDifference >= 0 && timeDifference <= 30) {
        console.log("On time");
        if (timeDifference != 0) {
            console.log(`${differenceMinutes} minutes before the start`);
        }
    } else if (timeDifference > 30) {
        console.log("Early");
        if (differenceHours === 0) {
            console.log(`${differenceMinutes} minutes before the start`);
        } else {
            if (differenceMinutes > 9) {
                console.log(`${differenceHours}:${differenceMinutes} hours before the start`);
            } else {
                console.log(`${differenceHours}:0${differenceMinutes} hours before the start`);
            }
        }
    } else {
        console.log("Late");
        if (differenceHours === 0) {
            console.log(`${differenceMinutes} minutes after the start`);
        } else {
            if (differenceMinutes > 9) {
                console.log(`${differenceHours}:${differenceMinutes} hours after the start`);
            } else {
                console.log(`${differenceHours}:0${differenceMinutes} hours after the start`);
            }
        }
    }
}

onTimeForTheExam(["11",
    "30",
    "12",
    "29"])







