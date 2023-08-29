function oscars(input) {
    let nameOfArtist = input[0];
    let points = Number(input[1]);
    let numberOfJury = Number(input[2]);

    for (let i = 0; i < numberOfJury; i++) {
        points += input[i * 2 + 3].length * input[i * 2 + 4] / 2;
        if (points > 1250.5) {
            console.log(`Congratulations, ${nameOfArtist} got a nominee for leading role with ${points.toFixed(1)}!`);
            break;
        }
    }
    if (!(points > 1250.5)) {
        console.log(`Sorry, ${nameOfArtist} you need ${(1250.5 - points).toFixed(1)} more!`);
    }

}
oscars(["Zahari Baharov",
    "205",
    "4",
    "Johnny Depp",
    "45",
    "Will Smith",
    "29",
    "Jet Lee",
    "10",
    "Matthew Mcconaughey",
    "39"])
