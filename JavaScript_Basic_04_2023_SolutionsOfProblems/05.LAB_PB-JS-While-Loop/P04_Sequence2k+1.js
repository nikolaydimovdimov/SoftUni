function sequence2k_1(input) {
    let endNumber = Number(input[0]);
    let nextNumber = 1;
    while (nextNumber <= endNumber) {
        console.log(nextNumber);
        nextNumber = 2 * nextNumber + 1;
    }
}
sequence2k_1(["3"])