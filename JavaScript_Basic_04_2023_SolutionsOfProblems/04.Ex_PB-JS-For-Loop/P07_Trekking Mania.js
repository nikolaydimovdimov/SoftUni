function trekkingMania(input) {
    let groupsNumber = Number(input[0]);
    const peopleByDestination = [0, 0, 0, 0, 0];
    let totalPeople = 0;
    for (let i = 1; i <= groupsNumber; i++) {
        let people = Number(input[i]);
        totalPeople += people;
        if (people < 6) {
            peopleByDestination[0] += people;
        } else if (people < 13) {
            peopleByDestination[1] += people;
        } else if (people < 26) {
            peopleByDestination[2] += people;
        } else if (people < 41) {
            peopleByDestination[3] += people;
        } else {
            peopleByDestination[4] += people;
        }
    }
    for (let i = 0; i < peopleByDestination.length; i++) {
        console.log(`${(peopleByDestination[i] * 100 / totalPeople).toFixed(2)}%`)
    }
}
trekkingMania(["10",
    "10",
    "5",
    "1",
    "100",
    "12",
    "26",
    "17",
    "37",
    "40",
    "78"])
