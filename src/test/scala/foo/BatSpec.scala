package foo

import foo.Bat.BatType

import io.circe.Error
import io.circe.generic.auto._
import io.circe.parser.decode
import io.circe.syntax._

import org.scalatest.{FlatSpec, Matchers}

class BatSpec extends FlatSpec with Matchers {

  "BatType" should "support encoding & decoding" in {
    val batType: BatType = Bat.Bat1

    val json: String = batType.asJson.spaces4
    println(json)

    val decoded: Either[Error, BatType] = decode[BatType](json)
    decoded.right.get shouldEqual batType
  }

}
