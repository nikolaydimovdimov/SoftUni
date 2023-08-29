function nameGame(input) {
    let index = 0;
    let nameOfWiner = "";
    let scoreOfWiner = 0;

    while (input[index] !== "Stop") {
        let nameOfPlayer = input[index];
        let score = 0;
        for (i = 0; i < nameOfPlayer.length; i++) {
            if (Number(input[++index]) === nameOfPlayer.charCodeAt(i)) {
                score += 10;
            } else {
                score += 2;
            }
        }
        if (score >= scoreOfWiner) {
            scoreOfWiner = score;
            nameOfWiner = nameOfPlayer;
        }
        index++
    }
    console.log(`The winner is ${nameOfWiner} with ${scoreOfWiner} points!`);
}

nameGame(["Pesho",
    "124",
    "34",
    "111",
    "97",
    "99",
    "Gosho",
    "98",
    "124",
    "88",
    "76",
    "18",
    "Stop"])
