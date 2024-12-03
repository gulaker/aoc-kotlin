import mylibs.runSolution
import kotlin.math.abs

runSolution(part = 1) {
    val allNumbers = readLines().map { line -> line.split("   ").map { it.toInt() } }
    val firstNumbers = allNumbers.map { it.first() }.sorted()
    val secondNumbers = allNumbers.map { it.last() }.sorted()

    firstNumbers.mapIndexed { i, number -> abs(number - secondNumbers[i]) }.sum()
}

runSolution(part = 2) {
    val allNumbers = readLines().map { line -> line.split("   ").map { it.toInt() } }
    val firstNumbers = allNumbers.map { it.first() }
    val secondNumbers = allNumbers.map { it.last() }

    firstNumbers.mapIndexed { i, number -> abs(number * secondNumbers.count { it == number }) }.sum()
}

