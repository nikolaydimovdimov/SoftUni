function oldBooks(input) {
    let wantedBook = input[0];
    let i = 1;
    while (input[i] !== "No More Books" && input[i] !== wantedBook) {
        i++;
    }
    if (input[i] === wantedBook) {
        console.log(`You checked ${i - 1} books and found it.`);
    } else {
        console.log("The book you search is not here!");
        console.log(`You checked ${i - 1} books.`);
    }
}
oldBooks(["The Spot",
    "Hunger Games",
    "Harry Potter",
    "Torronto",
    "Spotify",
    "No More Books"])

