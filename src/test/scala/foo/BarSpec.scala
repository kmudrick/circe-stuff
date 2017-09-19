package foo

import foo.Bar.BarType

import io.circe.Error
import io.circe.generic.auto._
import io.circe.parser.decode
import io.circe.syntax._

import org.scalatest.{FlatSpec, Matchers}

class BarSpec extends FlatSpec with Matchers {

  "BarType" should "support encoding & decoding" in {
    val barType: BarType = Bar.Bar1

    val json: String = barType.asJson.spaces4
    println(json)

    val decoded: Either[Error, BarType] = decode[BarType](json)
    decoded.right.get shouldEqual barType
  }

}
