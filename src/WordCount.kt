import java.io.File
import java.io.InputStream

fun main(args: Array<String>) {

    // Read from a file and turn into a string.
    val inputStream: InputStream = File("versaceonthefloor-brunomars.txt").inputStream()
    val allTheWords = inputStream.bufferedReader().use { it.readText() }

    // Make a list of all the words separated out.
    val words = allTheWords
            .toLowerCase()
            .replace(",", "")
            .replace(".", "")
            .replace("!", "")
            .replace("?", "")
            .replace("\n", " ")
            .split(" ")

    // Get a counted list of all the words.
    val wordMap = mutableMapOf<String, Int>()
    for (word in words) {
        if (wordMap.containsKey(word)) {
            val currentCount = wordMap[word]!!
            wordMap[word] = currentCount + 1
        } else if (word != "") {
            wordMap[word] = 1
        }
    }

    // Convert map to list
    val wordList = wordMap.toList()

    // Sort the list.
    val sortedList = wordList.sortedWith(compareByDescending({it.second}))

    // Print a sorted list of most popular words.
    for (word in sortedList) {
        println("${word.first} - ${word.second}")
    }

}