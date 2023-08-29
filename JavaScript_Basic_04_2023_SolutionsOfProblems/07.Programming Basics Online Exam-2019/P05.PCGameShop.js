function PCGameShop(input) {
    let numberOfSoldGames = Number(input[0]);
    let numberHearthstone = 0;
    let numberFornite = 0;
    let numberOverwatch = 0;
    let numberOthers = 0;

    for (let i = 1; i <= numberOfSoldGames; i++) {
        let gameName = input[i];

        switch (gameName) {
            case "Hearthstone":
                numberHearthstone++;
                break;
            case "Fornite":
                numberFornite++;
                break;
            case "Overwatch":
                numberOverwatch++;
                break;
            default:
                numberOthers++;
                break;
        }
    }

    console.log(`Hearthstone - ${(numberHearthstone * 100 / numberOfSoldGames).toFixed(2)}%`);
    console.log(`Fornite - ${(numberFornite * 100 / numberOfSoldGames).toFixed(2)}%`);
    console.log(`Overwatch - ${(numberOverwatch * 100 / numberOfSoldGames).toFixed(2)}%`);
    console.log(`Others - ${(numberOthers * 100 / numberOfSoldGames).toFixed(2)}%`);
}

PCGameShop(["3",
    "Hearthstone",
    "Diablo 2",
    "Star Craft 2"])

