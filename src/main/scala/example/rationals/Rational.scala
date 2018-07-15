package example.rationals

class Rational(x: Int, y: Int) {


  private def gcd(a: Int, b: Int): Int = if(b==0) a else gcd(b, a%b)
  private val g = gcd(x,y)

  require(y!=0, "denom should be nonzero")

  def numer = x/g
  def denom = y/g

  def + (that: Rational) =
    new Rational(
      numer*that.denom+denom*that.numer,
      denom*that.denom)

  def unary_- =
    new Rational(-numer, denom)

  def - (that: Rational) =
    this + -that

  def < (that: Rational) = numer * that.denom < that.numer * denom

  def max(that: Rational) = if(this < that) that else this

  override def toString =
    numer+"/"+denom
}
