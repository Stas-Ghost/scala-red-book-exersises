import scala.annotation.tailrec

def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
  @tailrec
  def loop(n: Int): Boolean = {
    if (n >= as.length) true
    else if (!ordered(as(n - 1), as(n))) false
    else loop(n + 1)
  }

  loop(1)
}

def sort[A <: Int](a: A, b: A): Boolean = {
  a <= b
}

assert(isSorted(Array(1, 2, 3, 4, 5), sort))
assert(!isSorted(Array(1, 5, 3, 4, 5), sort))
assert(isSorted(Array(1), sort))
assert(isSorted(Array(), sort))
assert(isSorted(Array('a', 'b', 'c'), (a: Char, b: Char) => {
  a <= b
}))