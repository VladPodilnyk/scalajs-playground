package example

import scala.util.{Failure, Success}
import scala.concurrent.ExecutionContext.global
import scraper.{ListOpt, category, collection, gplay}

object Main {

  def main(args: Array[String]): Unit = {
    gplay
      .list(
        ListOpt(
          collection = collection.TOP_FREE_GAMES,
          category   = category.GAME,
          num        = 2,
        )
      ).toFuture.onComplete {
        case Failure(exception) => println(s"Failed with $exception")
        case Success(value) =>
          println(s"Success.")
          println(s"size = ${value.size}")
          value.foreach(v => println(v.title))
      }(global)
  }
}
