// List of data types in Scala
object DataTypesExample {
    def main(args: Array[String]){
        val intValue: Int = 1000
        val floatValue: Float = 3.14f
        val doubleValue: Double = 3.14159
        val charValue: Char = 'A'
        val booleanValue: Boolean = true
        val stringValue: String = "Hello, Scala!"
    }
}

// Types of variables in Scala

// 1. val: This is similar to final variable in Java. Once initialized, the value of val variable can't be changed. Therefore no reassignment is allowed.
// 2. var: This is similar to normal variable in Java. The value of var variable can be changed. Therefore reassignment is allowed.

// Scala program to illustrate the use of val
object ValExample {
    def main(args: Array[String]){
        val intValue: Int = 1000
        intValue = 2000 // This will give an error

        var floatValue: Float = 3.14
        floatValue = 3.14 // This will work fine, No Errors
    }
}