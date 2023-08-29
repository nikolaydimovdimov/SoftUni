function pipesInPool(input) {

    let volumePool = Number(input[0]);
    let flowPipe1 = Number(input[1]);
    let flowPipe2 = Number(input[2]);
    let timeHours = Number(input[3]);

    let volumeWather = (flowPipe1 + flowPipe2) * timeHours;

    if (volumeWather > volumePool) {
        console.log(`For ${timeHours} hours the pool overflows with ${(volumeWather - volumePool).toFixed(2)} liters.`);
    } else {
        console.log(`The pool is ${(100 * volumeWather / volumePool).toFixed(2)}% full. Pipe 1: ${(100 * flowPipe1 / (flowPipe1 + flowPipe2)).toFixed(2)}%. Pipe 2: ${(100 * flowPipe2 / (flowPipe1 + flowPipe2)).toFixed(2)}%.`);
    }
}
pipesInPool(["100",
    "100",
    "100",
    "2.5"
])