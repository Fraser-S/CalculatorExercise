import scala.collection.mutable.ListBuffer

/**
  * Created by Administrator on 08/06/2017.
  */
object Main {

  def calc(x : String): Unit ={
    //split the string up into a string array
    val temp : Array[String] = x.split(", ")
    //create the variable to store the numbers
    var numList : ListBuffer[Int] = ListBuffer()

    //loop through the string array
    for(z <- 0 to temp.size -1){
      //convert the current string number to the number list
      numList+=temp(z).toInt
    }

    //iterate through the number list
    for(i<-0 to numList.size -1){
      //store the individual numbers//use modulus to get the next number in
      //the sequence, this way ensures that each number is tested for
      val num1 = numList(i%numList.size)
      val num2 = numList((i+1)%numList.size)
      val num3 = numList((i+2)%numList.size)

      //check for addition
      if(num1 + num2 == num3) {
        println(num1 + " + " + num2 + " = " + num3)
      }
      //check for multiplication
       if(num1 * num2 == num3) {
        println(num1 + " x " + num2 + " = " + num3)
      }
      //check that num2 is not 0//cant divide by zero
      if(num2!=0)
        //check for division
        if(num1 / num2 == num3 && num1%num2 ==0) {
          println(num1 + " / " + num2 + " = " + num3)
        }
      //check for subtraction
      if(num1 - num2 == num3) {
        println(num1 + " + " + num2 + " = " + num3)
      }
    }
    //print a new line at the end//helps readability in the console
    println()
  }

  def main(args : Array[String]): Unit ={
    //three digit solutions
    calc("5, 3, 15")
    calc("4, 2, 8")
    calc("6, 2, 12")
    calc("6, 2, 3")
    calc("9, 12, 108")
    calc("5, 3, 15")

    //check 4 digit solutions
    calc("3, 5, 5, 3")
    calc("2, 4, 6, 3")
    calc("1, 1, 2, 3")
    calc("4, 4, 3, 4")
    calc("8, 4, 3, 6")
    calc("9, 3, 1, 7")
    calc("2, 2, 4, 0")
  }
}
