function everest(input) {
    let index = 0;
    let daysCounter = 1;
    let totalClimbedDistance = 5364;

    while (input[index] !== "END"  && totalClimbedDistance < 8848) {
        if (input[index] === "Yes") {
            daysCounter++;
        }
        if(daysCounter>5) break;
        totalClimbedDistance += Number(input[++index]);
        index++;
    }
    if (totalClimbedDistance >= 8848) {
        console.log(`Goal reached for ${daysCounter} days!`);
    } else {
        console.log("Failed!");
        console.log(`${totalClimbedDistance}`);
    }
}

everest(["Yes",
"1254",
"Yes",
"1402",
"No",
"250",
"Yes",
"635"])
