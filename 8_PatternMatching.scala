import scala.util.Random

val x: Int = Random.nextInt(10)

val description = x match {
    case 0 => "zero"
    case 1 => "one"
    case 2 => "two"
    case _ => "other"
}

println(description)