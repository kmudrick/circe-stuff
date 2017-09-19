//package foo
//
//import foo.Baz.BazType
//
//import io.circe.Error
//import io.circe.generic.auto._
//import io.circe.parser.decode
//import io.circe.syntax._
//
//import org.scalatest.{FlatSpec, Matchers}
//
//class BazSpec extends FlatSpec with Matchers {
//
//  "BazType" should "support encoding & decoding" in {
//    val bazType: BazType = Baz.Baz1
//
//    val json: String = bazType.asJson.spaces4
//    println(json)
//
//    val decoded: Either[Error, BazType] = decode[BazType](json)
//    decoded.right.get shouldEqual bazType
//  }
//
//}
