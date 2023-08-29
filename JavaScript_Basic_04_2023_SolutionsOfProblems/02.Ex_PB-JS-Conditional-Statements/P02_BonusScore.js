function bonusScore(input) {
    let pointsStart = Number(input[0]);
    let pointsFinal = 0.0;
    if (pointsStart <= 100) {
        pointsFinal = pointsStart + 5;
    } else if (pointsStart < 1000) {
        pointsFinal = pointsStart * 1.2;
    } else {
        pointsFinal = pointsStart * 1.1;
    }
    if (pointsStart % 2 === 0) {
        pointsFinal = pointsFinal + 1;
    } else if (pointsStart % 10 === 5) {
        pointsFinal = pointsFinal + 2;
    }
    console.log(pointsFinal - pointsStart);
    console.log(pointsFinal);
}

bonusScore(["15875"])