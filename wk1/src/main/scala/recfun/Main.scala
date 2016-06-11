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
   */
    def pascal(c: Int, r: Int): Int = {
      (c,r) match {
        case (c,r) if (c > r) => {
          println(s"[$c,$r]=0")
          0
        }
        case (c,r) if (r<=0 || c<=0) => {
          println(s"($c,$r)=1")
          1
        }
        case _ => {
          val left = pascal(c-1, r-1)
          val right = pascal(c, r-1)
          println( s"($c,$r)="+ (left + right))
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
