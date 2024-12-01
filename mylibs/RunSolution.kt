package mylibs

import java.io.File
import java.io.FileNotFoundException
import kotlin.io.path.Path
import kotlin.io.path.absolutePathString

private enum class InputType(private val filepath: String) {
    EXAMPLE("./example.txt"),
    TASK("./task.txt");

    fun getFile() = try {
        File(filepath).also {
            if (it.readText().isEmpty()) throw Exception("File is empty!")
        }
    } catch (e: FileNotFoundException) {
        throw Exception("File not found!", e)
    }
}

private fun currentDayNumber() = Path("").absolutePathString().split("/day")[1]

fun runSolution(part: Int, exampleOnly: Boolean = false, solution: File.() -> Any) {
    println("-------- Day ${currentDayNumber()}, Part $part --------")
    print("Example: ")
    print(solution(InputType.EXAMPLE.getFile()))
    if(!exampleOnly) {
        print("  |  Solution: ")
        print(solution(InputType.TASK.getFile()))
    }
    println()
    println()
}