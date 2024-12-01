package mylibs

import kotlin.io.path.Path
import kotlin.io.path.absolutePathString

fun currentDayNumber() = Path("").absolutePathString().split("/day")[1]