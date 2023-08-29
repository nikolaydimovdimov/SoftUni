function salary(input) {
    let tabCount = Number(input[0]);
    let salarySum = Number(input[1]);

    for (i = 2; i <= tabCount + 2; i++) {
        tabName = input[i];
        switch (tabName) {
            case "Facebook":
                salarySum -= 150;
                break;
            case "Instagram":
                salarySum -= 100;
                break;
            case "Reddit":
                salarySum -= 50;
                break;
        }
        if (salarySum <= 0) {
            console.log("You have lost your salary.");
            break;
        }
    }
    if (salarySum > 0) {
        console.log(salarySum);
    }
}
salary(["3",
    "500",
    "Facebook",
    "Stackoverflow.com",
    "softuni.bg"])


