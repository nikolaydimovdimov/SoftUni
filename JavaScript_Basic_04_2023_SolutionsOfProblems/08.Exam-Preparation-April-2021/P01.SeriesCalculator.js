function seriesCalculator(input) {
    let nameOfFilm = input[0];
    let numberSeaeons = Number(input[1]);
    let numberEpisodes = Number(input[2]);
    let durationMin = Number(input[3]);

    let totalTime = Math.floor(numberSeaeons * (numberEpisodes * durationMin * 1.2 + 10));

    console.log(`Total time needed to watch the ${nameOfFilm} series is ${totalTime} minutes.`);
}

seriesCalculator(["Riverdale",
    "3",
    "21",
    "45"])


