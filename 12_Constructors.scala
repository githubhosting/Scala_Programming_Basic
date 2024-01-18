/**
  * Scala Constructors: Primary and Default
  *
  * Primary Constructor:
  * - When a Scala class has only one constructor, it is known as the primary constructor.
  * - The primary constructor and the class share the same body, and it is created implicitly.
  * - Parameters of the primary constructor are defined within the class definition.
  * - Syntax:
  *   class ClassName(parameterList) {
  *     // Statements...
  *   }
  * - If no constructor is explicitly defined, the compiler generates a default primary constructor.
  *
  * Constructor Parameter Declaration:
  * - Parameters in the constructor parameter-list can be declared using var, val, or without var/val.
  * - No var/val: Field visibility is restricted, and no getter/setter methods are generated.
  * - private var/val: Field is accessible only within the class, and no getter/setter methods are generated.
  *
  * Additional Notes:
  * - Only a primary constructor can invoke a superclass constructor.
  * - The primary constructor can be made private using the private keyword.
  */

class GFG(var authorName: String, val chapterName: String, private var publishedArticles: Int) {
  def display(): Unit = {
    println(s"Author name: $authorName")
    println(s"Chapter name: $chapterName")
    println(s"Total published articles: $publishedArticles")
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    // Creating and initializing object of GFG class with the primary constructor
    val obj = new GFG("Ankita", "Constructors", 145)
    obj.display()
  }
}

/**
  * Auxiliary Constructors in Scala
  *
  * In Scala, constructors other than the primary constructor are called auxiliary constructors.
  * Multiple auxiliary constructors can be created, but they must have different signatures.
  * Every auxiliary constructor must call one of the previously defined constructors using "this".
  * The invoked constructor can be either the primary constructor or another auxiliary constructor.
  *
  * Syntax:
  * def this(......)
  *
  * Scala program to illustrate the concept of auxiliary constructors:
  */

// Primary constructor
class GFG(authorName: String, chapterName: String) {
  var numberOfArticles: Int = 0

  def display(): Unit = {
    println(s"Author name: $authorName")
    println(s"Chapter name: $chapterName")
    println(s"Total number of articles: $numberOfArticles")
  }

  // Auxiliary constructor invoking the primary constructor
  def this(authorName: String, chapterName: String, no: Int) {
    this(authorName, chapterName) // Invoking primary constructor
    this.numberOfArticles = no
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    // Creating an object of the GFG class using the auxiliary constructor
    val obj = new GFG("Anya", "Constructor", 34)
    obj.display()
  }
}
