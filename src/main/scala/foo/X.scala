package foo

trait X {

  def x: Int
}

trait X1 extends X {

  def x: Int = 1
}

case object X1 extends X1

trait X2 extends X {

  def x: Int = 2
}

case object X2 extends X2