function numbers1ToNWithStep3(input) {
    let numbers = Number(input[0]);
    for (let i = 1; i <= numbers; i += 3) {
        console.log(i);
    }
}
numbers1ToNWithStep3([12]);