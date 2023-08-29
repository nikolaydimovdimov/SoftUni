function sumNumbers(input) {
    let targetSum = Number(input[0]);
    let sum = 0, i = 1;
    while (sum < targetSum) {
        sum += Number(input[i]);
        i++;
    }
    console.log(sum);
}
sumNumbers(["20",
    "1",
    "2",
    "3",
    "4",
    "5",
    "6"])
