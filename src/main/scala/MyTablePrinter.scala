class MyTablePrinter {
  def getHtmlPage(args: Seq[String]): String = {
    //check if rows of the table contain different number of elements?
    if(args.isEmpty)
      throw new IllegalArgumentException("Argument line should not be empty")

    val pageContent = new StringBuilder

    "<!DOCTYPE html><html><body><table style=\"width:100%\"><tr>" addString
      pageContent

    for(arg <- args)
      arg match {
        case "|" => "<td style = \"white-space:PRE\">" addString pageContent

        case "||" => "</tr><tr><td>" addString pageContent

        case picture => Figure(picture) addString pageContent
          "</td>" addString pageContent

      }

    "</tr></table></body></html>" addString pageContent

    pageContent.mkString
  }
}
