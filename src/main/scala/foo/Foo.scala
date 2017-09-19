package foo

import foo.Foo.{FooType}

// Does not work: extending FooType and including a parameter with XStuff in it

case class Foo(fooType: FooType, xstuffs: List[XStuff]) extends FooType {

  val x: Int = fooType.x
}

object Foo {

  sealed trait FooType extends X

  case object Foo1 extends FooType with X1

  case object Foo2 extends FooType with X2

}