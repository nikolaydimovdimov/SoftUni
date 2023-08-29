function evenPowersOf2(input){
    powMax=Number(input[0]);
    for(let pow=0;pow<=powMax;pow+=2){
        console.log(Math.pow(2,pow));
    }
}

evenPowersOf2([6]);