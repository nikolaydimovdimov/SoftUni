function yardGreening(input){
    let cost=Number(input[0])*7.61;
    let discount=cost*0.18;
    cost=cost-discount;
    console.log(`The final price is: ${cost} lv.`);
    console.log(`The discount is: ${discount} lv.`);
}
yardGreening(["550"]);