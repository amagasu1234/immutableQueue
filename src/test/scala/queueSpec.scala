import org.scalatest._

class queueSpect extends FlatSpec with DiagrammedAssertions {

  "Immutable Queue" should "made empty queue" in {
    val q1 = Queue.empty[String]
    assert(q1.isEmpty)
    val q2 = Queue.empty[Int]
    assert(q2.isEmpty)
  }

  "Immutable Queue" should "able to enQueue" in {
    val q1 = Queue.empty[String]
    assert(Queue("queue1") == q1.enQueue("queue1"))
  }

  "Immutable Queue" should "able to deQueue" in {
    val q1 = Queue.empty[String]
    val q2 = q1 enQueue "queue1" enQueue  "queue2" enQueue  "queue3"
    assert(Queue(List("queue2","queue1"))  == q2.deQueue())
  }



}