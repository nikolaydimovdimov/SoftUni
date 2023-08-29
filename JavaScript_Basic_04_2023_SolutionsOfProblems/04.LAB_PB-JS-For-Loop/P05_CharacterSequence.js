function characterSequence(input) {
    let text = input[0];
    for (charNumber = 0; charNumber < text.length; charNumber++) {
        console.log(text[charNumber]);
    }
}

characterSequence(["abcdefgh"]);