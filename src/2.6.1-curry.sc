def curry[A, B, C](f: (A, B) => C): A => (B => C) =
  (a: A) => (b: B) => f(a, b)

def adder(a: Int, b: Int): Int =
  a + b

assert(curry(adder)(1)(2) == 3)