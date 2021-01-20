package scraper

import scala.annotation.meta.field
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSExport, JSImport}
import scala.scalajs.js.annotation.JSImport.Namespace

@JSImport("google-play-scraper", Namespace)
@js.native
object gplay extends js.Object {
  def list(opt: ListOpt): js.Promise[js.Array[IAppItem]] = js.native
}

final case class ListOpt(
  @(JSExport @field) collection: js.UndefOr[collection] = js.undefined,
  @(JSExport @field) category: js.UndefOr[category]     = js.undefined,
  @(JSExport @field) age: js.UndefOr[age]               = js.undefined,
  @(JSExport @field) num: js.UndefOr[Int]               = js.undefined,
  @(JSExport @field) lang: js.UndefOr[String]           = js.undefined,
  @(JSExport @field) country: js.UndefOr[String]        = js.undefined,
  @(JSExport @field) fullDetail: js.UndefOr[Boolean]    = js.undefined,
)

final case class AppItem(
  url: String,
  appId: String,
  title: String,
  summary: String,
  developer: String,
  developerId: String,
  icon: String,
  score: String,
  scoreText: String,
  priceText: String,
  free: String,
)

@js.native
trait IAppItem extends js.Object {
  def url: String         = js.native
  def appId: String       = js.native
  def title: String       = js.native
  def summary: String     = js.native
  def developer: String   = js.native
  def developerId: String = js.native
  def icon: String        = js.native
  def score: String       = js.native
  def scoreText: String   = js.native
  def priceText: String   = js.native
  def free: String        = js.native
}

@js.native
trait collection extends js.Any
object collection {
  val TOP_FREE           = "topselling_free".asInstanceOf[collection]
  val TOP_PAID           = "topselling_paid".asInstanceOf[collection]
  val NEW_FREE           = "topselling_new_free".asInstanceOf[collection]
  val NEW_PAID           = "topselling_new_paid".asInstanceOf[collection]
  val GROSSING           = "topgrossing".asInstanceOf[collection]
  val TRENDING           = "movers_shakers".asInstanceOf[collection]
  val TOP_FREE_GAMES     = "topselling_free_games".asInstanceOf[collection]
  val TOP_PAID_GAMES     = "topselling_paid_games".asInstanceOf[collection]
  val TOP_GROSSING_GAMES = "topselling_grossing_games".asInstanceOf[collection]
}

@js.native
trait category extends js.Any
object category {
  //  APPLICATION = 'APPLICATION',
  //  ANDROID_WEAR = 'ANDROID_WEAR',
  //  ART_AND_DESIGN = 'ART_AND_DESIGN',
  //  AUTO_AND_VEHICLES = 'AUTO_AND_VEHICLES',
  //  BEAUTY = 'BEAUTY',
  //  BOOKS_AND_REFERENCE = 'BOOKS_AND_REFERENCE',
  //  BUSINESS = 'BUSINESS',
  //  COMICS = 'COMICS',
  //  COMMUNICATION = 'COMMUNICATION',
  //  DATING = 'DATING',
  //  EDUCATION = 'EDUCATION',
  //  ENTERTAINMENT = 'ENTERTAINMENT',
  //  EVENTS = 'EVENTS',
  //  FINANCE = 'FINANCE',
  //  FOOD_AND_DRINK = 'FOOD_AND_DRINK',
  //  HEALTH_AND_FITNESS = 'HEALTH_AND_FITNESS',
  //  HOUSE_AND_HOME = 'HOUSE_AND_HOME',
  //  LIBRARIES_AND_DEMO = 'LIBRARIES_AND_DEMO',
  //  LIFESTYLE = 'LIFESTYLE',
  //  MAPS_AND_NAVIGATION = 'MAPS_AND_NAVIGATION',
  //  MEDICAL = 'MEDICAL',
  //  MUSIC_AND_AUDIO = 'MUSIC_AND_AUDIO',
  //  NEWS_AND_MAGAZINES = 'NEWS_AND_MAGAZINES',
  //  PARENTING = 'PARENTING',
  //  PERSONALIZATION = 'PERSONALIZATION',
  //  PHOTOGRAPHY = 'PHOTOGRAPHY',
  //  PRODUCTIVITY = 'PRODUCTIVITY',
  //  SHOPPING = 'SHOPPING',
  //  SOCIAL = 'SOCIAL',
  //  SPORTS = 'SPORTS',
  //  TOOLS = 'TOOLS',
  //  TRAVEL_AND_LOCAL = 'TRAVEL_AND_LOCAL',
  //  VIDEO_PLAYERS = 'VIDEO_PLAYERS',
  //  WEATHER = 'WEATHER',
  val GAME           = "GAME".asInstanceOf[category]
  val GAME_ACTION    = "GAME_ACTION".asInstanceOf[category]
  val GAME_ADVENTURE = "GAME_ADVENTURE".asInstanceOf[category]
  val GAME_ARCADE    = "GAME_ARCADE".asInstanceOf[category]
  //  GAME_BOARD = 'GAME_BOARD',
  //  GAME_CARD = 'GAME_CARD',
  //  GAME_CASINO = 'GAME_CASINO',
  //  GAME_CASUAL = 'GAME_CASUAL',
  //  GAME_EDUCATIONAL = 'GAME_EDUCATIONAL',
  //  GAME_MUSIC = 'GAME_MUSIC',
  //  GAME_PUZZLE = 'GAME_PUZZLE',
  //  GAME_RACING = 'GAME_RACING',
  //  GAME_ROLE_PLAYING = 'GAME_ROLE_PLAYING',
  //  GAME_SIMULATION = 'GAME_SIMULATION',
  //  GAME_SPORTS = 'GAME_SPORTS',
  //  GAME_STRATEGY = 'GAME_STRATEGY',
  //  GAME_TRIVIA = 'GAME_TRIVIA',
  //  GAME_WORD = 'GAME_WORD',
  //  FAMILY = 'FAMILY',
  //  FAMILY_ACTION = 'FAMILY_ACTION',
  //  FAMILY_BRAINGAMES = 'FAMILY_BRAINGAMES',
  //  FAMILY_CREATE = 'FAMILY_CREATE',
  //  FAMILY_EDUCATION = 'FAMILY_EDUCATION',
  //  FAMILY_MUSICVIDEO = 'FAMILY_MUSICVIDEO',
  //  FAMILY_PRETEND = 'FAMILY_PRETEND'
}

@js.native
trait age extends js.Any
object age {
  val FIVE_UNDER = "AGE_RANGE1".asInstanceOf[age]
  val SIX_EIGHT  = "AGE_RANGE2".asInstanceOf[age]
  val NINE_UP    = "AGE_RANGE3".asInstanceOf[age]
}
