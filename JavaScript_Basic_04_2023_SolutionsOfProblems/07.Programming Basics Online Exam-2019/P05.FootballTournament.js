function footballTournament(input) {
    let nameFootballTeam = input[0];
    let numberFootballMatch = Number(input[1]);
    if (numberFootballMatch > 0) {
        let numberWins = 0;
        let numberDraws = 0;
        let numberLosses = 0;

        for (i = 2; i <= numberFootballMatch + 1; i++) {
            switch (input[i]) {
                case "W":
                    numberWins++;
                    break;
                case "D":
                    numberDraws++;
                    break;
                case "L":
                    numberLosses++;
                    break;
            }
        }
        console.log(`${nameFootballTeam} has won ${numberWins * 3 + numberDraws} points during this season.`);
        console.log("Total stats:");
        console.log(`## W: ${numberWins}`);
        console.log(`## D: ${numberDraws}`);
        console.log(`## L: ${numberLosses}`);
        console.log(`Win rate: ${(numberWins * 100 / numberFootballMatch).toFixed(2)}%`)
    } else {
        console.log(`${nameFootballTeam} hasn't played any games during this season.`);
    }
}
footballTournament(["Chelsea",
    "0"])


