function building(input) {
    let floorNumber = Number(input[0]);
    let roomNumber = Number(input[1]);
    let roomType = "L"

    for (let i = floorNumber; i > 0; i--) {
        let lineString = "";

        for (let j = 0; j < roomNumber; j++) {
            lineString += `${roomType}${i}${j} `;
        }

        console.log(lineString);

        if ((i + 1) % 2 === 0) {
            roomType = "O";
        } else {
            roomType = "A";
        }
    }
}
building(["6", "4"])