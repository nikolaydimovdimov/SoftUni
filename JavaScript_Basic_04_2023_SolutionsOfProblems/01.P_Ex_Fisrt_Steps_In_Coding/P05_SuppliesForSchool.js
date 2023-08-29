function suppliesForSchool(input) {

    let packegesPens = Number(input[0]);
    let packegesMarkers = Number(input[1]);
    let cleaningDetergent = Number(input[2]);
    let percentDiscount = Number(input[3]);

    const pensCost = 5.8;
    const markersCost = 7.2;
    const detergentCost = 1.2;

    let account = packegesPens * pensCost + packegesMarkers * markersCost + cleaningDetergent * detergentCost;
    account = account * (1 - percentDiscount / 100);

    console.log(account);
}

suppliesForSchool(["4 ",
"2 ",
"5 ",
"13 "]



);
