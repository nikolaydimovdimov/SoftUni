function repainting(input) {
    
    let nylon = Number(input[0]);
    let paint = Number(input[1]);
    let thinner = Number(input[2]);
    let workingHours = Number(input[3]);

    const nylonCost = 1.5;
    const paintCost = 14.5;
    const thinnerCost = 5;

    let materialsCost = (nylon + 2) * nylonCost + paint * 1.1 * paintCost + thinner * thinnerCost + 0.4;
    let totalCost = materialsCost * (1 + workingHours * 0.3);

    console.log(totalCost);
}

repainting(["5 ",
"10 ",
"10 ",
"1 "]



);