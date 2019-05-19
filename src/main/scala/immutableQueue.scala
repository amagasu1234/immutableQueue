object immutableQueue extends App {

  val q = Queue.empty[String]

  //Emptyチェック (true)
  println("1.emptyチェック (true)")
  println("val q = Queue.empty[String]")
  println(q.isEmpty)

  val q1 = q enQueue "a" enQueue "b" enQueue "c"

  //Emptyチェック (false)
  println("2.Emptyチェック (false)")
  println("val q1 = q enQueue \"a\" enQueue \"b\" enQueue \"c\"")
  println("result:" + q1.isEmpty)

  //Headチェック (Some(c))
  println("3.Headチェック (Some(c))")
  println("q1.head")
  println("result:" + q1.head)

  //deQueueチェック (ImmutableQueue(List(b, a)))
  println("4.eQueueチェック (ImmutableQueue(List(b, a)))")
  println("q1.deQueue()")
  println("result:" + q1.deQueue())

  val q2 = q1 enQueue "d"
  // enQueueチェック (ImmutableQueue(List(d, c, b, a)))
  println("5.enQueueチェック (ImmutableQueue(List(d, c, b, a)))")
  println("val q2 = q1 enQueue \"d\"")
  println("result:" + q2)

}