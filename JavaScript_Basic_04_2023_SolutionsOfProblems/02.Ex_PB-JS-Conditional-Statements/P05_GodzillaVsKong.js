function godzillaVsKong(input) {
    let filmBudget = Number(input[0]);
    let actorNumber = Number(input[1]);
    let wearCost = Number(input[2]);
    let filmCost = actorNumber * wearCost;
    if (actorNumber > 150) {
        filmCost = filmCost * 0.9;
    }
    filmCost = filmCost + filmBudget * 0.1;
    if (filmCost > filmBudget) {
        console.log("Not enough money!");
        console.log(`Wingard needs ${(filmCost - filmBudget).toFixed(2)} leva more.`);
    } else {
        console.log("Action!");
        console.log(`Wingard starts filming with ${(filmBudget - filmCost).toFixed(2)} leva left.`)
    }
}

godzillaVsKong(["9587.88",
    "222",
    "55.68"])


