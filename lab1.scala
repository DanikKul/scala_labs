object Variant1 {
  def main(args: Array[String]): Unit = {
    print("Enter the number: ")

    var numberString = ""
    var a = 0
    var b = 0
    var c = 0
    var rez: Float = 0
    var z = 0
    numberString = scala.io.StdIn.readLine()
    if ((numberString.length() <= 10)) {
      println("Incorrect number");
      sys.exit(0)
    }

    for (i <- 1 to 10) {
      a = numberString.substring(0, 5).toInt
      b = numberString.substring(5, 10).toInt
      c = a * b
      rez = c.toString().substring(0, 3).toFloat / 1000
      z += c
      println(a);
      println(b);
      println(c);
      println(rez);
      println("z = " + z)
      numberString = numberString.substring(1, numberString.length() - 1)
      numberString = "011" + z
    }
  }
}

object Variant4 {
  def main(args: Array[String]): Unit = {
    var a: Long = 0
    var b: Long = 0
    var c: Long = 0
    var z = "1"
    var rez: Float = 0

    println("Enter the number: ")
    z = scala.io.StdIn.readLine

    for (i <- 1 to 5) {
      while (z.length < 16) {
        z = "1" + z
      }
      if (z.length > 16 || z.toLong < 0) {
        z = z.reverse.substring(0,15).reverse
      }
      println(s"length = ${z.length}, z = $z")
      a = z.substring(0, z.length() - 8).toLong
      b = z.substring(z.length() - 8, z.length()).toLong
      c = a * b
      rez = c.toString.substring(0, 3).toFloat / 1000
      println(s"#$i random number: $rez")
      z = (z.toLong * c).toString
    }
  }
}
