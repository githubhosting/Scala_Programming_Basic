// Arrays in Scala
// Syntax:
// var z = new Array[String](3)
// z(0) = "Zara"; z(1) = "Nuha"; z(4/2) = "Ayan"

object Demo {
    def main(args: Array[String]) {
        var z = new Array[String](3)
        z(0) = "Zara"; z(1) = "Nuha"; z(2) = "Ayan"
        println( "Zara: " + z(0) )
        println( "Nuha: " + z(1) )
        println( "Ayan: " + z(2) )
    }
}