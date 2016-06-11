def pascal(c: Int, r: Int): Int = {
  val z = "-  "
//  println( s"($c,$r)\r")
  (c,r) match {

    // out of bounds
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

pascal(0,0)  // 1

pascal(1,1)  // 2

pascal(2,3)  // 3

/*

1

1  1

1  2  1

1  3  3  1

1  4  6  4  1

1  5 10 10  5  1

*/