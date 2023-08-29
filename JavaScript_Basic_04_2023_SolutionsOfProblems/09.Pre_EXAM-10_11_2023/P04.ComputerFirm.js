function computerFirm(input) {
    let numberTypes = Number(input[0]);
    let sumRating = 0;
    let sumPossibleSales = 0;

    for (index = 1; index <= numberTypes; index++) {
        let inputNumber = Number(input[index]);
        let rating = inputNumber % 10;
        let possibleSales = parseInt(inputNumber / 10);
        switch (rating) {
            case 2:
                possibleSales = 0;
                break;
            case 3:
                possibleSales *= 0.5;
                break;
            case 4:
                possibleSales *= 0.7;
                break;
            case 5:
                possibleSales *= 0.85;
                break;
            case 6:
                break;
        }
        sumPossibleSales += possibleSales;
        sumRating += rating;
    }
    console.log(`${sumPossibleSales.toFixed(2)}`);
    console.log(`${(sumRating / numberTypes).toFixed(2)}`)
}

computerFirm(["2",
"204",
"206"])


