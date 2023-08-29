function cake(input){
    let cakePieces=Number(input[0])*Number(input[1]);
    let i=2;
    while(input[i]!=="STOP"&&cakePieces>0){
        cakePieces-=Number(input[i]);
        i++;
    }
    if(cakePieces>0){
        console.log(`${cakePieces} pieces are left.`);
    }else{
        console.log(`No more cake left! You need ${Math.abs(cakePieces)} pieces more.`);
    }
}
cake(["10",
"2",
"2",
"4",
"6",
"STOP"])

