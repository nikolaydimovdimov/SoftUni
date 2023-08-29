function weekendOrWorkingDay(input) {
    let dayName = input[0];

    switch (dayName) {
        case "Monday":
        case "Tuesday":
        case "Wednesday":
        case "Thursday":
        case "Friday":
            console.log("Working day");
            break;
        case "Saturday":
        case "Sunday":
            console.log("Weekend");
            break;
        default:
            console.log("Error");
            break;
    }
}

weekendOrWorkingDay(["Sunjkjday"])