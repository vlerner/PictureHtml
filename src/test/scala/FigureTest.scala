import org.scalatest.FunSuite

class FigureTest extends FunSuite {
  test("get the right picture") {
    assert(Figure("Rabbit1") == " \\\\<br>  \\\\<br>   (_)<br>  / )<br>o( )_\\_")
    assert(Figure("Rabbit2") == "    \\\\<br>     \\\\_<br>  .---(')<br>o( )_-\\_")
    assert(Figure("Rabbits") == "\\\\<br> \\\\_    \\\\<br>  (')    \\\\_<br>  / )=.---(')<br>o( )o( )_-\\_")
    assert(Figure("TwoLittleRabbits") == "   \\\\      \\\\<br>  __()    __()<br>o(_-\\_  o(_-\\_")
  }

  test("catch illegal argument") {
    assert(Figure("Rabbit1") === "no match")
  }
}
