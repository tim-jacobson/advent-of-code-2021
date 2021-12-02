package puzzle.day02

import java.io.File

fun main() {
    val sample = """forward 5
down 5
forward 8
up 3
down 8
forward 2""".trim()

    val inputFile = File("src/main/resources/puzzle/day02/puzzle-day-02-input").readLines().joinToString("\n")

    val output = inputFile.split('\n')
        .map { line -> line.split(' ').let { it.first() to it.last().toInt() } }
        .fold(0 to 0) { acc, pair ->
            when (pair.first) {
                "forward" -> acc.copy(first = acc.first + pair.second)
                "down" -> acc.copy(second = acc.second + pair.second)
                "up" -> acc.copy(second = acc.second - pair.second)
                else -> throw Exception("Unknown direction")
            }
        }.let { it.first * it.second }

    println(output)
}
