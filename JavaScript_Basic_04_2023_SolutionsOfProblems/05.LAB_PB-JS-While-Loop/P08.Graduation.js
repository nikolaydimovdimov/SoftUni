function graduation(input) {
    let studentName = input[0];
    let yearCount = 0, unsuccessfulYears = 0, averageGrade = 0;

    while ((yearCount < 12) && (unsuccessfulYears < 2)) {
        yearCount++;
        let currentGrade = Number(input[yearCount]);
        if (currentGrade < 4) {
            unsuccessfulYears++;
        }
        averageGrade += currentGrade;
    }
    if (unsuccessfulYears === 2) {
        console.log(`${studentName} has been excluded at ${yearCount - 1} grade`);
    } else {
        console.log(`${studentName} graduated. Average grade: ${(averageGrade / 12).toFixed(2)}`);
    }
}
graduation(["Mimi",
    "5",
    "6",
    "5",
    "6",
    "5",
    "6",
    "6",
    "2",
    "3"])
