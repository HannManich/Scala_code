import scala.collection.mutable.ListBuffer
object Fruits 
{
  def main(args: Array[String])
  {
    var fruits= List("Banana", "Apple", "Pear")
    var t="Kiwi"::fruits
    
    var fruitsList = new ListBuffer[String]()
    
    fruitsList+=("Pineapple","Avocado","Orange")
    fruitsList+="Pine"
    
    var x= fruits.slice(2,3)
    var (l,s)= fruits.splitAt(3)
    var a=fruits.tail
    
    println(t)
    println(x)
    println(a)
    println(fruitsList,"\n",fruits)
    
    
  }
}