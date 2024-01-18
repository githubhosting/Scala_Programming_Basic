// Loops in Scala
// Syntax:
// for ( var x <- Range ){
//    statement(s);
// }


object Demo {
    def main(args: Array[String]) {
        var a = 0;
        for( a <- 1 to 10){
            println( "Value of a: " + a );
        }
    }
}
