// Spark program to create an array of 10 elements and find the maximum element in an array 
// and add the maximum element to all the elements and display

// Import necessary Spark classes
import org.apache.spark.{SparkConf, SparkContext}

// Define the object MaxElementAddition
object MaxElementAddition {
  def main(){
    // Create a SparkConf and SparkContext
    val conf = new SparkConf().setAppName("MaxElementAddition")
    val sc = new SparkContext(conf)

    // Create an array of 10 elements
    val inputArray = Array(5, 8, 2, 15, 7, 10, 3, 12, 9, 6)

    // Parallelize the array into an RDD (Resilient Distributed Dataset)
    val inputRDD = sc.parallelize(inputArray)

    // Find the maximum element in the array using the max() transformation
    val maxElement = inputRDD.max()

    // Add the maximum element to all elements in the array using the map() transformation
    val resultRDD = inputRDD.map(element => element + maxElement)

    // Display the result
    println("Input Array: " + inputArray.mkString(", "))
    println("Max Element: " + maxElement)
    println("Result Array: " + resultRDD.collect().mkString(", "))

    // Stop the SparkContext to release resources
    sc.stop()
  }
}
