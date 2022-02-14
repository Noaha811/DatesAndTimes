//Noah Anderson
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

//main function to run the program
fun main() {

    //declares most variables used in the program
    val formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")
    val today = LocalDate.now()
    val formattedToday = today.format(formatter)
    val initialFullMoonDate = LocalDate.of(2022, 1, 17)
    var nextFullMoon = initialFullMoonDate

    //prints out today's date and the amount of time since the last full moon
    println("Today is $formattedToday")


    //calculates when the next full moon will be (roughly ~30 days since the last full moon, starting
    //from the initial full moon date
    do {
        nextFullMoon = nextFullMoon.plusDays(30)
    }while((today.until(nextFullMoon, ChronoUnit.DAYS)) < 0)

    //formats and calculates how many days are left until the next full moon, then prints it
    val daysUntil = today.until(nextFullMoon, ChronoUnit.DAYS)
    val nextFullMoonFormatted = nextFullMoon.format(formatter)
    println("There are $daysUntil days until the next full moon. on $nextFullMoonFormatted")
}