package app.PopularMoviesDataset

import org.apache.log4j._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types.{IntegerType, LongType, StructType}


object scala {
  final case class Movie(movieID: Int)

  def main(args: Array[String]): Unit ={
    Logger.getLogger("org").setLevel(Level.ERROR)
    val spark = SparkSession
      .builder()
      .appName("PopularMovies")
      .master("local[*]")
      .getOrCreate()

    val moviesSchema = new StructType()
      .add("userID", IntegerType, nullable = true)
      .add("movieID",IntegerType,nullable = true)
      .add("rating",IntegerType, nullable = true)
      .add("timestamp", LongType, nullable =true)

    import spark.implicits._
    val moviesDS = spark.read
      .option("sep","\t")
      .schema(moviesSchema)
      .csv("C:\\Users\\julym\\Documents\\ml-100k\\u.data")
      .as[Movie]

    val topMoviesIDs = moviesDS.groupBy("movieID").count().orderBy(desc("count"))

    topMoviesIDs.show(10)

    spark.stop()

  }
}
