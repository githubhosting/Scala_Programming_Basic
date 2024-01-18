// Student class definition
class Student {
  private var name = ""
  private var id = 0
  private var testMarks = (0.0, 0.0, 0.0)

  def setName(studentName: String){
    name = studentName
  }

  def setID(studentID: Int) {
    id = studentID
  }

  def setTestMarks(mark1: Double, mark2: Double, mark3: Double) {
    testMarks = (mark1, mark2, mark3)
  }

  def displayDetails() {
    println(s"Name: $name")
    println(s"ID: $id")
    println(s"Test Marks: $testMarks")
  }

  def calculateAndDisplayAverage() {
    val average = (testMarks._1 + testMarks._2 + testMarks._3) / 3.0
    println(s"Average Test Marks: $average")
  }
}

// Student Management Main Object
object StudentManagement {
  def main(args: Array[String]){
    val student1 = new Student()
    student1.setName("John Doe")
    student1.setID(1)
    student1.setTestMarks(85.5, 92.0, 78.5)

    val student2 = new Student()
    student2.setName("Jane Smith")
    student2.setID(2)
    student2.setTestMarks(90.0, 88.5, 95.0)

    // Display details and calculate average for each student
    println("\nDetails for Student 1:")
    student1.displayDetails()
    student1.calculateAndDisplayAverage()

    println("\nDetails for Student 2:")
    student2.displayDetails()
    student2.calculateAndDisplayAverage()
  }
}
