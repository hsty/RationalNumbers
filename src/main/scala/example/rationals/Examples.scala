package example.rationals

object Examples extends App{

  val t = new Rational(1,3)
  val g = new Rational(5,7)
  val e = new Rational(3,2)

  println(t - g - e)
  println(g + g)

  println(t < g)

  println(t.max(g))

  //val s = new Rational(1,0)

}
