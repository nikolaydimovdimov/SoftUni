function workingHours(input) {
    let timeHours = Number(input[0]);
    let dayOfWeek = input[1];

    switch (dayOfWeek) {
        case "Monday":
        case "Tuesday":
        case "Wednesday":
        case "Thursday":
        case "Friday":
        case "Saturday":
            if (timeHours >= 10 && timeHours <= 18) {
                console.log("open");
            } else {
                console.log("closed");
            }
            break;
        case "Sunday":
            console.log("closed");
            break;
    }
}

workingHours(["11",
    "Sunday"])



