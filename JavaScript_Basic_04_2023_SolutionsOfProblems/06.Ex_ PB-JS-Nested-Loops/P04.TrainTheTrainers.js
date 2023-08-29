function trainTheTrainers(input) {
    let index = 0;
    let numberOfJury = Number(input[index]);
    let sumOfAverageGrades = 0;
    let numberOfPresentation = 0;

    while (input[++index] !== "Finish") {
        let nameOfPresentation = input[index];
        let sumOfGrades = 0;

        for (let counterOfGrades = 1; counterOfGrades <= numberOfJury; counterOfGrades++) {
            sumOfGrades += Number(input[++index]);
        }

        let currentAverageGrade = sumOfGrades / numberOfJury;
        console.log(`${nameOfPresentation} - ${currentAverageGrade.toFixed(2)}.`);
        sumOfAverageGrades += currentAverageGrade;
        numberOfPresentation++;
    }
    console.log(`Student's final assessment is ${(sumOfAverageGrades / numberOfPresentation).toFixed(2)}.`);
}

trainTheTrainers(["2",
    "Objects and Classes",
    "5.77",
    "4.23",
    "Dictionaries",
    "4.62",
    "5.02",
    "RegEx",
    "2.88",
    "3.42",
    "Finish"])

