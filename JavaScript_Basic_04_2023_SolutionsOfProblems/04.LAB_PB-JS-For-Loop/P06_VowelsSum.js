function vowelsSum(input) {
    let inputText = String(input[0]);
    let sumText = 0;
    for (charPosition = 0; charPosition < inputText.length; charPosition++) {
        switch (inputText[charPosition]) {
            case 'a':
                sumText += 1;
                break;
            case 'e':
                sumText += 2;
                break;
            case 'i':
                sumText += 3;
                break;
            case 'o':
                sumText += 4;
                break;
            case 'u':
                sumText += 5;
                break;
        }
    }
    console.log(sumText);
}

vowelsSum(["hello"])