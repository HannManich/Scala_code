import scala.collection.mutable.ListBuffer
object flattening
{
  def main(args:Array[String])
  {
    var lineList=List(1,2,3)
    var pageList=List(lineList,4,5,6)
    //var bookList=List(pageList,7,8,9)
  //  var category=List(bookList,10,11,12)
    //println(category)
    println(pageList)
  }
}