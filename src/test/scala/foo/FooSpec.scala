//package foo
//
//import foo.Foo.FooType
//
//import io.circe.Error
//import io.circe.generic.auto._
//import io.circe.parser.decode
//import io.circe.syntax._
//
//import org.scalatest.{FlatSpec, Matchers}
//
//class FooSpec extends FlatSpec with Matchers {
//
//  "FooType" should "support encoding & decoding" in {
//    val fooType: FooType = Foo.Foo1
//
//    val json: String = fooType.asJson.spaces4
//    println(json)
//
//    val decoded: Either[Error, FooType] = decode[FooType](json)
//    decoded.right.get shouldEqual fooType
//  }
//
//}
