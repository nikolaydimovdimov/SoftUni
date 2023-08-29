function passwordGuess(input) {
    let passW = input[0];
    if (passW === "s3cr3t!P@ssw0rd") {
        console.log("Welcome");
    } else {
        console.log("Wrong password!");
    }
}

passwordGuess(["s3cr3t!P@ssw0rd"]);