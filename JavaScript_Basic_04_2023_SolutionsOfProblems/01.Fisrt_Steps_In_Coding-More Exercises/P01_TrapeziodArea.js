function trapeziodArea(input) {
    let a = Number(input[0]);
    let b = Number(input[1]);
    let h = Number(input[2]);

    console.log(((a + b) * h / 2).toFixed(2));
}

trapeziodArea(["8", "13", "7"]);
