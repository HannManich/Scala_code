import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import scala.io.Source


object import_scala
{
  def main(args: Array[String])
  {
    val name= "Manich"
    val age=18
    val weight=18.5
   println (s"Hello $name")
   println(f"Age ${age+1}")
   printf("'%-17s'\n","Hi Hann")
   printf("'%17s'\n","Hi Manich")
   
   
   val nameArray=name.toArray
   for(i <- nameArray)
   println (i)
     
   
     
   def getSum(num1:Int=1, num2:Int=1): Int=    //return any value
   {
     num1+num2
   }
    println("67 + 45 = "+getSum(67,45))
    
    
    
   def sayHi(): Unit= //dont return any value
   {
      println("Work hard DREAM big!")
   }
      sayHi

    
      
      
  }
}











