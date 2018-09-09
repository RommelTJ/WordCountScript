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

    // Get a counted list of all the words.
    val wordMap = mutableMapOf<String, Int>()
    for (word in words) {
        if (wordMap.containsKey(word)) {
            val currentCount = wordMap[word]!!
            wordMap[word] = currentCount + 1
        } else {
            wordMap[word] = 1
        }
    }

    // Convert map to list
    val wordList = wordMap.toList()

    // Sort the list.
    

    // TODO: Print a sorted list of most popular words.
}