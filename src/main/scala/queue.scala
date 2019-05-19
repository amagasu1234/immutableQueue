
trait Queue[T] {
  def isEmpty: Boolean
  def enQueue(t: T): Queue[T]
  def deQueue(): Queue[T]
  def head: Option[T]
}

object Queue {
  def empty[T]: Queue[T] = ImmutableQueue[T](Nil)

  private case class ImmutableQueue[T](private val queueList:List[T]) extends Queue[T]{

    def isEmpty: Boolean = queueList.isEmpty
    def enQueue(element: T): ImmutableQueue[T] = ImmutableQueue(element +: this.queueList)
    def deQueue(): ImmutableQueue[T] = ImmutableQueue(queueList.tail)
    def head: Option[T] = queueList.headOption
  }

  def apply[T](element :T):Queue[T] = Queue[T](element)
}



