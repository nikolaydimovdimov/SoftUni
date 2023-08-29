function traveling(input) {
    let i = 0, j = 0;
    let savedSum = 0;
    while (input[i] !== "End") {
        let destination = input[i];
        i++;
        j = i;
        while (savedSum < input[i]) {
            j++;
            savedSum += Number(input[j]);
        }
        console.log(`Going to ${input[i-1]}!`);
        savedSum = 0;
        i = j + 1;
    }
}
traveling(["France",
    "2000",
    "300",
    "300",
    "200",
    "400",
    "190",
    "258",
    "360",
    "Portugal",
    "1450",
    "400",
    "400",
    "200",
    "300",
    "300",
    "Egypt",
    "1900",
    "1000",
    "280",
    "300",
    "500",
    "End"])
