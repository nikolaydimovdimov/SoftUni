function renovation(input) {
    let areaToPaint = Math.ceil(4 * Number(input[0]) * Number(input[1]) * (100 - Number(input[2])) / 100);
    let index = 2;

    while (areaToPaint > 0 && input[++index] !== "Tired!") {
        areaToPaint -= Number(input[index]);
    }

    if (areaToPaint > 0) {
        console.log(`${areaToPaint} quadratic m left.`)
    } else if (areaToPaint === 0) {
        console.log(`All walls are painted! Great job, Pesho!`);
    } else {
        console.log(`All walls are painted and you have ${-areaToPaint} l paint left!
       `)
    }

}

renovation(["2",
    "3",
    "25",
    "6",
    "7",
    "8"])



