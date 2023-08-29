function easterCompetition(input) {
    let numberEasterBread = Number(input[0]);
    let index = 0;
    let winerName = "";
    let maxPoints = 0;

    for (i = 1; i <= numberEasterBread; i++) {
        let bakerName = input[++index];
        let bakerPoints = 0;

        while (input[++index] !== "Stop") {
            bakerPoints += Number(input[index]);
        }

        console.log(`${bakerName} has ${bakerPoints} points.`);

        if (bakerPoints > maxPoints) {
            winerName = bakerName;
            maxPoints = bakerPoints;
            console.log(`${bakerName} is the new number 1!`);
        }
    }
    console.log(`${winerName} won competition with ${maxPoints} points!`);
}

easterCompetition(["2",
    "Chef Angelov",
    "9",
    "9",
    "9",
    "Stop",
    "Chef Rowe",
    "10",
    "10",
    "10",
    "10",
    "Stop"])
