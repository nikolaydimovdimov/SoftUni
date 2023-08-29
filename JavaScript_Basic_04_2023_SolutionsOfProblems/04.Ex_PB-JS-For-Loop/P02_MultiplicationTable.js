function multiplicationTable(input) {
    let numberTiMultiplay = Number(input[0]);
    for (let i = 1; i <= 10; i++) {
        console.log(`${i} * ${numberTiMultiplay} = ${i * numberTiMultiplay}`);
    }
}
multiplicationTable([5])