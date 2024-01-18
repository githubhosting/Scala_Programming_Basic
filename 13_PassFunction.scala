/**
  * Scala – Passing a Function as a Parameter Example
  *
  * In Scala, you can pass a function as a parameter to another function. Follow these steps:
  * 1. Define your main method and the method where you want to use the function as a parameter.
  * 2. Declare the function signature in the method that will accept the function.
  * 3. Create the function with the same signature.
  * 4. Pass the function as a parameter when calling the method.
  *
  * This example demonstrates passing a function to calculate yearly salary.
  */

object FuncAsParam {
  def main(args: Array[String]): Unit = {
    // Call EmpDetails method and pass the function yearlySalary
    EmpDetails("Tom", 30000, yearlySalary)
  }

  // Method that accepts a function as a parameter
  def EmpDetails(name: String, salary: Int, f: Int => Int): Unit = {
    // Print employee details along with calculated yearly salary
    print(s"$name's salary per annum in INR - ${f(salary)}")
  }

  // Function with the same signature expected by EmpDetails method
  def yearlySalary(sal: Int): Int = {
    // Calculate yearly salary by multiplying monthly salary by 12
    sal * 12
  }
}
