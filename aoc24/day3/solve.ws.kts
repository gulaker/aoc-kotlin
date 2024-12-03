import mylibs.runSolution

val pattern = "mul\\(([0-9]{1,3}),([0-9]{1,3})\\)".toRegex()

runSolution(part = 1) {
    pattern.findAll(readText()).map { it.groupValues }.sumOf { (_, a, b) -> a.toInt() * b.toInt() }
}

runSolution(part = 2) {
    readText()
        .split("do()").map { it.split("don't()").first() }
        .sumOf { sequence ->
            pattern.findAll(sequence).map { it.groupValues }.sumOf { (_, a, b) -> a.toInt() * b.toInt() }
        }
}

