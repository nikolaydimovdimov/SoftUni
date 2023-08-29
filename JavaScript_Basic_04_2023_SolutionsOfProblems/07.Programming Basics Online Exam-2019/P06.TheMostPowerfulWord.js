function theMostPowerfulWord(input) {
    let index = 0;
    let vowelChars = "aeiouy";
    let maxPower = 0;
    let maxPowerWord = "";

    while (input[index] !== "End of words") {
        let powerOfWord = 0;

        for (i = 0; i < input[index].length; i++) {
            powerOfWord += input[index].charCodeAt(i);
        }

        if (vowelChars.includes(input[index].toLowerCase().charAt(0))) {
            powerOfWord *= input[index].length;
        } else {
            powerOfWord = Math.floor(powerOfWord / input[index].length);
        }

        if (powerOfWord > maxPower) {
            maxPower = powerOfWord;
            maxPowerWord = input[index];
        }

        index++
    }

    console.log(`The most powerful word is ${maxPowerWord} - ${maxPower}`);
}

theMostPowerfulWord(["The",
    "Most",
    "Powerful",
    "Word",
    "Is",
    "Experience",
    "End of words"])
