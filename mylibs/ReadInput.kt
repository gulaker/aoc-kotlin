package mylibs

import java.io.File
import java.io.FileNotFoundException

/*
fun INPUT_PATH = "/Users/david/Library/Application Support/JetBrains/IdeaIC2023.2/scratches/aoc23/day$day/input.txt"
val TEST_PATH = "/Users/david/Library/Application Support/JetBrains/IdeaIC2023.2/scratches/aoc23/day$day/input-test.txt"

 */
enum class InputType(val filepath: String) {
    EXAMPLE("./example.txt"),
    TASK("./task.txt");

    fun getFile() = try {
        File(filepath)
    } catch (e: FileNotFoundException) {
        throw Exception("File not found!", e)
    }

    fun readLines() = getFile().readLines().also {
        if (it.isEmpty()) throw Exception("File is empty!")
    }

    fun readText() = getFile().readText().also {
        if (it.isEmpty()) throw Exception("File is empty!")
    }
}
