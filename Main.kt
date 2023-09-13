fun main() {
    println("Guten Tag!\nWie heißt du?")
    var name=readln()
    println("Herzlich Willkommen ${name}! Schön dich kennenzulernen.\n\nGehe ich richtig davon aus, du bist hier,\num dein Body-Mass-Index oder kurz:BMI berechnen zu lassen?")
    readln()
    println("Ja? Cool, lass uns starten.\nWie viel Kilogramm wiegst du aktuell?\n" +
            "Gebe dein Körpergewicht in Kilogramm an und benutze einen Punkt statt des Kommas, um die Dezimalzahl anzugeben.")
    var weight: Double= readln().toDouble()
    println("So so, also ${weight}kg.\nWie groß bist du aktuell?\nGebe deine Körpergröße in Meter an und benutze einen Punkt statt des Kommas, um die Dezimalzahl anzugeben.")
    var hight:Double= readln().toDouble()
    println("${hight}m kann sich sehen lassen. Danke, das passt soweit! Dein BMI wird berechnet. Moment bitte!")
    var bmi: Double= weight/(hight*hight)
    println("Es ist soweit fertig! Dein BMI lautet: ${bmi}.\nVielen Dank für dein Vertrauen. Nutze bei Fragen gerne Suchmaschinen oder unseren Support. Bis dahin!")


}