object Main {
  def main(args: Array[String]): Unit = {

    //
    // Variables and structures
    //

    // This variable cannot be changed or re-assigned
    val immutable: Int = 1
    // immutable = 2 : error -> re-assignment to val

    // This variable can be re-assigned (overwritten)
    // But - we normally don't wan't that
    var mutable: Int = 1
    mutable = 2

    // data structure is immutable and the variable can not be re-assigned
    val immutableSeq: scala.collection.immutable.Seq[String] = Seq("1", "2", "3")

    // the variable can not be re-assigned, but the data structure can be changed
    val immutableMutableMap: scala.collection.mutable.Map[Int, String] =
      scala.collection.mutable.Map(1 -> "foo", 2 -> "bar", 3 -> "foobar")
    val changedImmutableMuableMap: scala.collection.mutable.Map[Int, String] =
      immutableMutableMap.addOne((4, "pi"))
    println(immutableMutableMap)        // both will be identical
    println(changedImmutableMuableMap)

    // JUST DON'T do that !!!
    var mutableSeq: scala.collection.mutable.Seq[String] =
      scala.collection.mutable.Seq("NO NO NO")

    //
    // methods and function values
    //

    /**
     * Return the sum of the length of the string and the integer.
     * @param a Current string.
     * @param b Current integer.
     * @return Integer value of the sum of the length of the string and the integer.
     */
    def myMethod(a: String, b: Int): Int = a.length + b

    /**
     * Return the sum of the length of the string and the integer as string.
     * The parameters are defined by currying.
     *
     * @param a Current string.
     * @param b Current integer.
     * @return String value of the sum of the length of the string and the integer.
     */
    def myMethodCurry(a: String)(b: Int): String = (a.length + b).toString

    // function value
    // We define the variable f1 with the specification (String, String) => Int
    // The implementation summarizes the length of both provided strings
    val f1: (String, String) => Int = (a: String, b: String) =>  a.length + b.length
    println(f1("foo", "bar")) // 6

  }
}
