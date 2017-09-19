//package foo
//
//import io.circe.Error
//import io.circe.generic.auto._
//import io.circe.parser.decode
//import io.circe.syntax._
//
//import org.scalatest.{FlatSpec, Matchers}
//
//class XStuffSpec extends FlatSpec with Matchers {
//
//  "XStuff" should "support encoding & decoding" in {
//    val xstuff: XStuff = XStuff(X2)
//
//    val json: String = xstuff.asJson.spaces4
//    println(json)
//
//    val decoded: Either[Error, XStuff] = decode[XStuff](json)
//    decoded.right.get shouldEqual xstuff
//  }
//
//}
