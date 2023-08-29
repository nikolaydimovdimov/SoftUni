function walking(input) {
    let daySteps = 0;
    let i = 0;
    while (daySteps < 10000) {
        if (input[i] === "Going home") {
            daySteps += Number(input[i + 1]);
            break;
        }
        daySteps += Number(input[i]);
        i++;
    }
    if (daySteps < 10000) {
        console.log(`${10000 - daySteps} more steps to reach goal.`);
    } else {
        console.log("Goal reached! Good job!");
        console.log(`${daySteps - 10000} steps over the goal!`);
    }
}
walking(["1500",
    "3000",
    "250",
    "1548",
    "2000",
    "Going home",
    "2000"])


