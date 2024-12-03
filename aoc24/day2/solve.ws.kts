import mylibs.runSolution

fun List<Int>.allDecreasing() = this.windowed(2).all { (a, b) -> (a - b) in 1..3 }
fun List<Int>.allIncreasing() = this.windowed(2).all { (a, b) -> (b - a) in 1..3 }

fun List<Int>.allMutations() = listOf(this) + List(this.size) { this.take(it) + this.takeLast(this.size - it - 1) }

runSolution(part = 1) {
    readLines()
        .map { it.split(" ").map(String::toInt) }
        .count { it.allDecreasing() || it.allIncreasing() }
}

runSolution(part = 2) {
    readLines()
        .map { it.split(" ").map(String::toInt) }
        .count { list -> list.allMutations().any { it.allDecreasing() || it.allIncreasing() } }
}

