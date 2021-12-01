import java.io.File

val sample = """199
200
208
210
200
207
240
269
260
263""".trim()

val inputFile = File("src/main/resources/puzzle/day01/puzzle-day-01-input").readLines().joinToString("\n")

val output = inputFile.split('\n').map(String::toInt).zipWithNext().count { (a, b) -> a < b }

fun main() {
    println(output)
}
