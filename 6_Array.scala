// Arrays in Scala
// Syntax:
// var z = new Array[String](3)
// z(0) = "Zara"; z(1) = "Nuha"; z(4/2) = "Ayan"

object Demo {
    def main() {
        var z = new Array[String](3)
        z(0) = "Zara"; z(1) = "Nuha"; z(2) = "Ayan"
        println( "Zara: " + z(0) )
        println( "Nuha: " + z(1) )
        println( "Ayan: " + z(2) )
    }
}

// Another way of declaring array:
var myList = Array("Zara", "Nuha", "Ayan")

// Accessing elements of array:
for ( x <- myList ) {
    println( x )
}

// Multi-dimensional arrays 3X3
var myMatrix = Array.ofDim[Int](3,3)

// Summing all elements
var total = 0
for (i <- 0 to 2) {
    for ( j <- 0 to 2) {
        total += myMatrix(i)(j);
    }
}
println("Total is: " + total);

// Sum of all diagonal elements
var total = 0
for (i <- 0 to 2) {
    total += myMatrix(i)(i);
}
println("Total of diagnol: " + total);