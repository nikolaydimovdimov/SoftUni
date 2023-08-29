function examPreparation(input) {
    let badGradeNumber = Number(input[0]);
    let badGradeCounter = 0, sumGrade = 0, i = 1;
    while (input[i] !== "Enough" && badGradeCounter < badGradeNumber) {
        i++;
        currentGrade = Number(input[i]);
        if (currentGrade <= 4) {
            badGradeCounter++;
        }
        sumGrade += currentGrade;
        i++;
    }
    if (badGradeCounter < badGradeNumber) {
        console.log(`Average score: ${(sumGrade / ((i - 1) / 2)).toFixed(2)}`);
        console.log(`Number of problems: ${(i - 1) / 2}`);
        console.log(`Last problem: ${input[i - 2]}`);
    } else {
        console.log(`You need a break, ${badGradeCounter} poor grades.`);
    }
}
examPreparation(["2",
    "Income",
    "3",
    "Game Info",
    "6",
    "Best Player",
    "4"])
