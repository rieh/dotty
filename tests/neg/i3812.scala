object Test {
  def main(args: Array[String]): Unit = {
    case class Box(v: Int)

    val x = 42
    val Y = "42"
    var Z1 = Box(4)
    val Z2 = Box(4)

    x match { case { 42 }           => () } // error
    x match { case { "42".toInt }   => () } // error
    x match { case { "42" }.toInt   => () } // error
    x match { case { "42".toInt }   => () } // error
    x match { case { Y.toInt }      => () } // error
    x match { case { Y }.toInt      => () } // error
  }
}
