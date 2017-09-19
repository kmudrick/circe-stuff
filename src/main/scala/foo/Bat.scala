package foo

import foo.Bat.BatType

// Works

case class Bat(batType: BatType, xstuffs: List[XStuff]) extends X {

  val x: Int = batType.x
}

object Bat {

  sealed trait BatType extends X

  case object Bat1 extends BatType with X1

  case object Bat2 extends BatType with X2

}