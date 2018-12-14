object Figure {
  //add behaviour if argument does not match any cases or throw exception
  def apply(name: String): String = name match {
    case "Rabbit1" => " \\\\<br>  \\\\<br>   (_)<br>  / )<br>o( )_\\_"
    case "Rabbit2" => "    \\\\<br>     \\\\_<br>  .---(')<br>o( )_-\\_"
    case "Rabbits" => "\\\\<br> \\\\_    \\\\<br>  (')    \\\\_<br>  / )=.---(')<br>o( )o( )_-\\_"
    case "TwoLittleRabbits" => "   \\\\      \\\\<br>  __()    __()<br>o(_-\\_  o(_-\\_"

    case _ => "no match"
  }
}
