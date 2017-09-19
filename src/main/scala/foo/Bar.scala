package foo

import foo.Foo.FooType

// Works: extending X and not including XStuff as a param type

case class Bar(fooType: FooType) extends X {

  val x: Int = fooType.x
}

object Bar {

  sealed trait BarType extends X

  case object Bar1 extends BarType with X1

  case object Bar2 extends BarType with X2

}
