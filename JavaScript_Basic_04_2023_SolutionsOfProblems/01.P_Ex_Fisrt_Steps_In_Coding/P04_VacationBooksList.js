function vacationBookList(input) {
    let numberOfPages = Number(input[0]);
    let pegesPerHour = Number(input[1]);
    let numberOfDays = Number(input[2]);
    let hoursPerDay = numberOfPages / pegesPerHour / numberOfDays;
    console.log(hoursPerDay);
}

vacationBookList(["432 ",
    "15 ",
    "4 "]
);