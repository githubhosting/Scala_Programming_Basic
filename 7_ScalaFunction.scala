// def functionName ([list of parameters]) : [return type] = {
//     function body
//     return [expr]
// }

object Demo {
    // Define a function called addInt
    def addInt( a:Int, b:Int ) : Int = {
        var sum:Int = 0
        sum = a + b
        return sum
    }

    // Call the function in main function
    def main(args: Array[String]) {
        println("Returned Value : " + addInt(5,7))
    }
}

