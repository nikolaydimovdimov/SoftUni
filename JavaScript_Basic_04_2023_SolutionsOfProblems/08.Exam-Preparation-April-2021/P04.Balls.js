function balls(input) {
    let numberOfBalls = Number(input[0]);
    let redBalls = 0;
    let orangeBalls = 0;
    let yellowBalls = 0;
    let whiteBalls = 0;
    let blackBalls = 0;
    let othersBalls = 0;
    let totalPoints = 0;

    for (i = 1; i <= numberOfBalls; i++) {
        switch (input[i]) {
            case "red":
                redBalls++;
                totalPoints += 5;
                break;
            case "orange":
                orangeBalls++;
                totalPoints += 10;
                break;
            case "yellow":
                yellowBalls++;
                totalPoints += 15;
                break;
            case "white":
                whiteBalls++;
                totalPoints += 20;
                break;
            case "black":
                blackBalls++;
                totalPoints = parseInt(totalPoints / 2);
                break;
            default:
                othersBalls++;
                break;
        }
    }

    console.log(`Total points: ${totalPoints}`);
    console.log(`Red balls: ${redBalls}`);
    console.log(`Orange balls: ${orangeBalls}`);
    console.log(`Yellow balls: ${yellowBalls}`);
    console.log(`White balls: ${whiteBalls}`);
    console.log(`Other colors picked: ${othersBalls}`);
    console.log(`Divides from black balls: ${blackBalls}`);

}

balls(["5",
    "red",
    "red",
    "ddd",
    "ddd",
    "ddd"])
