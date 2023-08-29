function usdToBGN(input) {
    let usd = Number(input[0]);
    const exchangeRate = 1.79549;
    let bgn = usd * exchangeRate;
    console.log(bgn);
}

usdToBGN(["22"]);
