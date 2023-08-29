function password(input) {
    let userName = input[0]
    let passWord = input[1]
    let i = 2;
    while (input[i] !== passWord) {
        i++;
    }
    console.log(`Welcome ${userName}!`);
}
password(["Gosho",
    "secret",
    "secret"])


