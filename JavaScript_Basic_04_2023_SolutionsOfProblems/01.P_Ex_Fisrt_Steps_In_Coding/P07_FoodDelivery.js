function foodDelivery(input) {

    const chickenMenuCost = 10.35;
    const fischMenuCost = 12.40;
    const vegetarianMenuCost = 8.15;

    let chickenMenuNumber = Number(input[0]);
    let fischMenuNumber = Number(input[1]);
    let vegetarianMenuNumber = Number(input[2]);

    let totalBill = (chickenMenuNumber * chickenMenuCost + fischMenuNumber * fischMenuCost +
        vegetarianMenuNumber * vegetarianMenuCost) * 1.2 + 2.5;

    console.log(totalBill);
}

foodDelivery(
    ["9 ",
        "2 ",
        "6 "]



);
