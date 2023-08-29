function cinema(input){
    let cinemaType=input[0];
    let r=Number(input[1]);
    let c=Number(input[2]);

    switch(cinemaType){
        case "Premiere":
            console.log(`${(r*c*12).toFixed(2)} leva`);
            break;
        case "Normal":
            console.log(`${(r*c*7.5).toFixed(2)} leva`);
            break;
        case "Discount":
            console.log(`${(r*c*5).toFixed(2)} leva`);
            break;
    }
}

cinema(["Discount",
"12",
"30"])


