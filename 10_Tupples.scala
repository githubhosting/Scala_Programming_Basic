/**
  * Tuples and Zipping in Scala
  *
  * Tuples:
  * - Tuples are aggregates of values of different types in Scala, allowing grouping of elements into a single structure.
  * - A tuple value is created by enclosing individual values in parentheses.
  * - Example: val myTuple = (1, 3.14, "Fred") // Tuple3[Int, Double, String]
  * - Components of a tuple can be accessed using _1, _2, _3, etc.
  *   Example: val secondElement = myTuple._2 // Accessing the second component
  * - Tuple component positions start with 1, not 0.
  *
  * Zipping:
  * - Zipping is a process of combining elements from multiple collections into pairs.
  * - Example:
  *   val symbols = Array("<", "-", ">")
  *   val counts = Array(2, 10, 2)
  *   val pairs = symbols.zip(counts) // Result: Array(("<", 2), ("-", 10), (">", 2))
  * - Zipping is useful for processing corresponding elements together.
  *   Example:
  *   for ((symbol, count) <- pairs) println(symbol * count) // Prints "<<---------->>"
  *
  * Note: Tuples provide a convenient way to work with heterogeneous data, while zipping facilitates
  * combining elements from different collections into pairs for parallel processing.
  */
object TuplesAndZippingExample {
  def main(args: Array[String]){
    // Example usage of tuples
    val myTuple = (1, 3.14, "Fred")
    val secondElement = myTuple._2 // Accessing the second component of the tuple
    println(s"Second component of the tuple: $secondElement")

    // Example usage of zipping
    val symbols = Array("<", "-", ">")
    val counts = Array(2, 10, 2)
    val pairs = symbols.zip(counts) // Zipping arrays to create pairs
    for ((symbol, count) <- pairs) println(symbol * count) // Prints "<<---------->>"
  }
}
