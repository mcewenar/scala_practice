class Practice {

  //Recibe una funcion como argumento
  def example1(funcion: Unit) {
    funcion
  }

  def example2(cifra1: Int, f:(Int)=> Int): Int = {
    f(cifra1)
  }

}

object Main {
  def main(args: Array[String]): Unit = {

    var pr1 = new Practice()
    pr1.example1(println("NADA"))

    def multi(numero:Int): Int = {
      numero*5
    }

    //Use pre created function
    println(pr1.example2(10,multi))


    //Use anonymity function
    println(pr1.example2(10,(x:Int)=>x*20))
  }
}
