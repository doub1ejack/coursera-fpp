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
      (c,r) match {
        case (c,r) if (c > r) => 0
        case (c,r) if (r<=0 || c<=0) => 1
        case _ => {
          val left = pascal(c-1, r-1)
          val right = pascal(c, r-1)
          left + right
        }
      }
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = ???
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = ???
  }
