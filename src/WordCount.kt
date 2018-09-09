fun main(args: Array<String>) {
    // TODO: Read from a file and turn into a string. 
    val allTheWords = "Hello there, my name is Rommel. I really like to eat cheese and I think this is very good!"

    // Make a list of all the words separated out.
    val words = allTheWords
            .toLowerCase()
            .replace(",", "")
            .replace(".", "")
            .replace("!", "")
            .replace("?", "")
            .split(" ")

    // TODO: Get a counted list of all the words.
    // TODO: Sort the list.
    // TODO: Print a sorted list of most popular words.
}