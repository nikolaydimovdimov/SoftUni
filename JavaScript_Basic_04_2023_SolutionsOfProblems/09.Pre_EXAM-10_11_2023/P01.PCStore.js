function pCStore(input) {
    let processorCostUSD = Number(input[0]);
    let videoCardCostUSD = Number(input[1]);
    let rAMCostUSD = Number(input[2]);
    let numberRAM = Number(input[3]);
    let discountPercent = Number(input[4]);

    let totalCostBGN = ((processorCostUSD + videoCardCostUSD) * (1 - discountPercent) + rAMCostUSD * numberRAM) * 1.57


    console.log(`Money needed - ${totalCostBGN.toFixed(2)} leva.`);
}

pCStore(["1200",
    "850",
    "120",
    "4",
    "0.1"])

