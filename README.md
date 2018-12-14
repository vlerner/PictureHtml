AsciiPainter create the table of the current figures.

Run programm with arguments in the following format:
PainterName() | paint1 | paint2 || paint3 | paint1

where:
PainterName() is chosen painter
paintN means defined type of current figure in ASCII-like format
| operator means that the figure should be printed next to the current figure (<td>)
|| operator means that the figure should be printed on the new line (<tr>)

The program creates the file result.html that contains selected figures.

Currently supported types of the figures:
 Rabbit1
 Rabbit2
 Rabbits
 TwoLittleRabbits
 


For example, arguments line may contain:
MyTablePrinter() | Rabbit1 | Rabbit2 | Rabbits || TwoLittleRabbits | TwoLittleRabbits | TwoLittleRabbits



Next version of the program should include possibility to add custom figures.
