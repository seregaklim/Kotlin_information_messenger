
fun main () {
    val user = "Crazy Frog"
    var userTime = 3500
    val timeHours = userTime / 60 / 60
    val timeMinute = userTime / 60

    val hours = textHour (timeHours)
    val minute = minuteText(timeMinute,)
    val agoToText = tutext(userTime, minute, hours)

    println("$user был $agoToText")
}
fun  tutext (userTime: Int, minute: String, hours: String): String = when (userTime){
        in 0..60 -> "только что"
        in 61..3600 -> "$minute назад"
        in 3601..86400 -> "$hours назад"
        in 86401..172800 -> "сегодня"
        in 172801..259200 -> "вчера"
        259200 -> "давно"
        else -> "давно"
    }

fun minuteText (timeMinute: Int,) : String = when  {
        timeMinute % 10 == 1 && timeMinute % 100 !== 11 -> "$timeMinute минуту"
        timeMinute % 10 in 2..4 && timeMinute % 100 !in 11..19 -> "$timeMinute минуты"
        else -> "$timeMinute минут"
   }

fun textHour(timeHours: Int,) : String = when  {
       timeHours % 10 == 1 && timeHours % 100 !== 11 ->"$timeHours час"
        timeHours % 10 in 2..4 && timeHours % 100 !in 11..19 -> "$timeHours часа"
        else -> "$timeHours часов"
}

