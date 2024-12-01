package mylibs

data class Coordinate2D<T:Number>(
    val x: T,
    val y: T,
) {
    override fun toString() = "(x=$x, y=$y)"

    companion object {
        inline fun <reified T: Number>fromCommaSeparatedString(commaSeparatedString: String): Coordinate2D<T> =
            commaSeparatedString.split(",").let { (x,y) -> Coordinate2D(x.toNumber(),y.toNumber()) }
    }
}

data class Coordinate3D<T:Number>(
    val x: T,
    val y: T,
    val z: T,
) {
    override fun toString() = "(x=$x, y=$y, z=$z)"

    companion object {
        inline fun <reified T: Number>fromCommaSeparatedString(commaSeparatedString: String): Coordinate3D<T> =
            commaSeparatedString.split(",").let { (x,y,z) -> Coordinate3D(x.toNumber(),y.toNumber(),z.toNumber()) }
    }
}

data class ListCoordinate2D<T:Number>(
    val row: T,
    val col: T,
) {
    override fun toString() = "(row=$row, col=$col)"

    companion object {
        inline fun <reified T: Number>fromCommaSeparatedString(commaSeparatedString: String): Coordinate2D<T> =
            commaSeparatedString.split(",").let { (row,col) -> Coordinate2D(row.toNumber(),col.toNumber()) }
    }
}

inline fun <reified T: Number> String.toNumber() : T = when (T::class) {
    Int::class -> toInt() as T
    Long::class -> toLong() as T
    Double::class -> toDouble() as T
    Float::class -> toFloat() as T
    Short::class -> toShort() as T
    else -> throw Exception("Unrecognized number class ${T::class.simpleName}, could not convert string to number")
}

inline fun <reified T: Number> Number.toNumber() : T = when (T::class) {
    Int::class -> toInt() as T
    Long::class -> toLong() as T
    Double::class -> toDouble() as T
    Float::class -> toFloat() as T
    Short::class -> toShort() as T
    else -> throw Exception("Unrecognized number class ${T::class.simpleName}, could not convert string to number")
}

