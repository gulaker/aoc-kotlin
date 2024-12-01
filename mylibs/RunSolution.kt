package mylibs

fun runSolution(part: Int, exampleOnly: Boolean = false, solution: InputType.() -> Any) {
    println("-------- Day ${currentDayNumber()}, Part $part --------")
    print("Example: ")
    print(solution(InputType.EXAMPLE))
    if(!exampleOnly) {
        print("  |  Solution: ")
        print(solution(InputType.TASK))
    }
    println()
    println()
}