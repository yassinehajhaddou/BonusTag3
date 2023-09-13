fun rand(start: Int=1,end: Int=100): Int {
    require(start <=end){ "Illegal Argument" }
    return (start..end).random() // Initialisierung des Zufallsgenerators
}

fun main() {
    println("Willkomen! Wir kreieren fünf Zufallszahlen zwischen 1 und 100.")
    // Generiere eine zufällige ganze Zahl zwischen 1 und 100
    val start = 1
    val end = 100

    println("Die fünf zufälligen Zahlen lauten:")
    for (i in 1..5) println(rand(start, end))
}