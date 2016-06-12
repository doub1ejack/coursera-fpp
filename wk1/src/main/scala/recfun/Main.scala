package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * Exercise 1
    *
    * This version is not tail recursive 
    */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else
      pascal(c, r - 1) + pascal(c - 1, r - 1)
  }


  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {
    def inner (acc: Int, tail: List[Char]) : Int = {
      if (tail.isEmpty) acc
      else {
        if (acc < 0) acc
        else {
          tail.head match {
            case '(' => inner(acc + 1, tail.tail)
            case ')' => inner(acc - 1, tail.tail)
            case _ => inner(acc, tail.tail)
          }
        }
      }
    }
    if (inner(0, chars) >= 0) true
    else
      false
  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
