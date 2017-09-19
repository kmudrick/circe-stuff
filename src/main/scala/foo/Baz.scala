package foo

import foo.Baz.BazType
import foo.Foo.FooType

// Does not work, extending BazType, no XStuff param

case class Baz(fooType: FooType) extends BazType {

  val x: Int = fooType.x
}

object Baz {

  sealed trait BazType extends X

  case object Baz1 extends BazType with X1

  case object Baz2 extends BazType with X2

}