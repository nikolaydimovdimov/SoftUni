function cinemaTickets(input) {
    let index = 0;
    let studentTicketNumber = 0
    let standardTicketNumber = 0
    let kidsTicketNumber = 0

    while (input[index] !== "Finish") {
        let nameOfFilm = input[index];
        let numberOfSeats = Number(input[++index]);
        let counterOfSoldSeats = 0;

        while (counterOfSoldSeats < numberOfSeats && input[++index] !== "End") {
            counterOfSoldSeats++;

            switch (input[index]) {
                case "student":
                    studentTicketNumber++;
                    break;
                case "standard":
                    standardTicketNumber++;
                    break;
                case "kid":
                    kidsTicketNumber++;
                    break;
            }
        }

        console.log(`${nameOfFilm} - ${(counterOfSoldSeats * 100 / numberOfSeats).toFixed(2)}% full.`);
        index++;
    }

    let totalSoldTickets = studentTicketNumber + standardTicketNumber + kidsTicketNumber;
    
    console.log(`Total tickets: ${totalSoldTickets}`);
    console.log(`${(studentTicketNumber * 100 / totalSoldTickets).toFixed(2)}% student tickets.`);
    console.log(`${(standardTicketNumber * 100 / totalSoldTickets).toFixed(2)}% standard tickets.`);
    console.log(`${(kidsTicketNumber * 100 / totalSoldTickets).toFixed(2)}% kids tickets.`);
}

cinemaTickets(["The Matrix",
    "20",
    "student",
    "standard",
    "kid",
    "kid",
    "student",
    "student",
    "standard",
    "student",
    "End",
    "The Green Mile",
    "17",
    "student",
    "standard",
    "standard",
    "student",
    "standard",
    "student",
    "End",
    "Amadeus",
    "3",
    "standard",
    "standard",
    "standard",
    "Finish"])
