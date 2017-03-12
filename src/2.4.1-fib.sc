import scala.annotation.tailrec

def fib(n: BigInt): BigInt = {
  @tailrec
  def loop(i: BigInt, cur: BigInt, next: BigInt): BigInt = {
    i match {
      case `n` => cur
      case _   => loop(i + 1, next, cur + next)
    }
  }

  loop(0, 0, 1)
}

assert(fib(0) == 0)
assert(fib(1) == 1)
assert(fib(2) == 1)
assert(fib(5) == 5)
assert(fib(10) == 55)