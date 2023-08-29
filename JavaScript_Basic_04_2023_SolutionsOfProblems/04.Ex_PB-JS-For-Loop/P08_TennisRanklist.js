function tennisRanklist(input) {
    let tournaments = Number(input[0]);
    let startPoints = Number(input[1]);
    let points = 0, winTournaments = 0;
    for (i = 1; i <= tournaments; i++) {
        let result = input[i + 1];
        switch (result) {
            case "W":
                points += 2000;
                winTournaments++;
                break;
            case "F":
                points += 1200;
                break;
            case "SF":
                points += 720;
                break;
        }
    }
    console.log(`Final points: ${startPoints + points}`);
    console.log(`Average points: ${Math.floor(points / tournaments)}`);
    console.log(`${(winTournaments * 100 / tournaments).toFixed(2)}%`);
}
tennisRanklist(["4",
    "750",
    "SF",
    "W",
    "SF",
    "W"])
