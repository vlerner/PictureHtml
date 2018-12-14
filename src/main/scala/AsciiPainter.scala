import java.io.{File, PrintWriter}


object AsciiPainter extends App {
    val htmlPageContent = args(0) match {
      case "MyTablePrinter()" =>
        val myTablePrinter = new MyTablePrinter
        myTablePrinter.getHtmlPage(args.tail)

      case _ => "no valid painter aviable"
    }

    val writer = new PrintWriter(new File("result.html"))
    writer.write(htmlPageContent)

    writer.close()
}
