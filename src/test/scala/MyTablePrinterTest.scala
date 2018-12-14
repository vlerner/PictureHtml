import org.scalatest.FunSuite

class MyTablePrinterTest extends FunSuite {
  test("args line is empty") {
    val myTablePrinterTester = new MyTablePrinter

    assertThrows[IllegalArgumentException] {
      myTablePrinterTester.getHtmlPage(Seq())
    }
  }
}
