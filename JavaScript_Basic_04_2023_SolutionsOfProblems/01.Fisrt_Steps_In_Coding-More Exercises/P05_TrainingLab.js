function trainingLab(input) {
    let w = Number(input[0]);
    let h = Number(input[1]);

    let columns = Math.floor((h - 1) / 0.7);
    let rows = Math.floor(w / 1.2);

    console.log(columns * rows - 3);
}

trainingLab(["8.4", "5.2"]);