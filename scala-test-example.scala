import org.scalatest.funsuite.AnyFunSuite

object ScalaTestExample {

    def add(a:Int)(b:Int):Int = {
        a * b
    }
    def main(args:Array[String]):Unit = {
        test("Example test") {
            assert(1 == 1)
        }
        test("Add test"){
            assert(add(1)(1) == 1 + 1)
        }
    }
}
