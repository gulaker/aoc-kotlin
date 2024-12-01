package mylibs

sealed class StraightDirections2D(row: Int, col: Int) : Directions2D(row, col) {
    companion object {
        operator fun invoke() = listOf(UP, LEFT, RIGHT, DOWN)
    }
}
sealed class DiagonalDirections2D(row: Int, col: Int) : Directions2D(row, col) {
    companion object {
        operator fun invoke() = listOf(UPLEFT, UPRIGHT, DOWNLEFT, DOWNRIGHT)
    }
}
sealed class Directions2D(val vector: ListVector2D) {
    constructor(row: Int, col: Int) : this(ListVector2D(row, col))
    companion object {
        operator fun invoke() = listOf(UP, LEFT, RIGHT, DOWN, UPLEFT, UPRIGHT, DOWNLEFT, DOWNRIGHT, STAY)
    }
}

data object UPLEFT : DiagonalDirections2D(-1,-1)
data object UP : StraightDirections2D(-1,0)
data object UPRIGHT : DiagonalDirections2D(-1,1)
data object LEFT : StraightDirections2D(0,-1)
data object STAY : Directions2D(0,0)
data object RIGHT : StraightDirections2D(0,1)
data object DOWNLEFT : DiagonalDirections2D(1,-1)
data object DOWN : StraightDirections2D(1,0)
data object DOWNRIGHT : DiagonalDirections2D(1,1);

@JvmInline
value class ListVector2D(val coordinates: Pair<Int,Int>) {
    constructor(row: Int, col: Int) : this(Pair(row,col))

    val row
        get() = coordinates.first

    val col
        get() = coordinates.second

    override fun toString() = "(row: $row, col: $col)"

    fun move(vector: ListVector2D) = ListVector2D(this.row + vector.row, this.col + vector.col)
    fun move(direction: Directions2D) = move(direction.vector)
}

inline operator fun <reified T: Number> T.plus(other: T): T {
    return when (T::class) {
        Int::class -> this as Int + other as Int
        Long::class -> this as Long + other as Long
        Double::class -> this as Double + other as Double
        Float::class -> this as Float + other as Float
        Short::class -> this as Short + other as Short

        else -> throw Exception("Unrecognized number class ${T::class.simpleName}, could not convert string to number")
    } as T
}

