function histogram(input) {
    let n = Number(input[0]);
    const p = [0, 0, 0, 0, 0];

    for (let i = 1; i <= n; i++) {
        let number = Number(input[i]);
        for (let j = 800; j >= 0; j -= 200) {
            if (number >= j) {
                p[j / 200]++
                break;
            }
        }
    }
    for (let i = 0; i < 5; i++) {
        console.log(`${(p[i] * 100 / n).toFixed(2)}%`);
    }
}
histogram(["3",
    "1",
    "2",
    "1000"])
