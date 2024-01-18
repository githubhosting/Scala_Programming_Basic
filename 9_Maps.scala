// You can construct a map as : val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

// Scala program to illustrate the use of Maps

object MapsExample {
    def main(args: Array[String]){
        val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
        println(scores("Alice"))
        println(scores("Bob"))
        println(scores("Cindy"))
    }
}

// Above is immutable map. To use mutable map, use scala.collection.mutable.Map

// Scala program to illustrate the use of mutable Maps

import scala.collection.mutable.Map

object MutableMapsExample {
    def main(args: Array[String]){
        val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
        scores("Tom") = 12 // Adding a new element
        scores += ("Harry" -> 5, "Jak" -> 9) // Another way of Adding a new element
        println(scores("Alice"))
        println(scores("Bob"))
        println(scores("Cindy"))
        println(scores("Tom"))
        println(scores("Harry"))
        println(scores("Jak"))
    }
}


// Iterate over a map

// Scala program to illustrate the use of Maps

object IterateMapsExample {
    def main(args: Array[String]){
        val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
        for((k,v) <- scores) println(k + " : " + v)
    }
}

// Sorted maps in scala 

// Scala program to illustrate the use of Sorted Maps

import scala.collection.immutable.SortedMap

object SortedMapsExample {
    def main(args: Array[String]){
        val scores = SortedMap("Alice" -> 10, "Fred" -> 7, "Bob" -> 3, "Cindy" -> 8)
        for((k,v) <- scores) println(k + " : " + v)
    }
}