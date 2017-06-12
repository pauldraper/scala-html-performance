# Scala HTML Templating Benchmarks

## Run

Install sbt.

```sh
sbt test
```

## Templates

* [ScalaTags](http://www.lihaoyi.com/scalatags/): [scala/htmlperf/ScalaTags.scala](src/main/scala/htmlperf/ScalaTags.scala)
* [scala-xml](https://github.com/scala/scala-xml): [scala/htmlperf/ScalaXml.scala](src/main/scala/htmlperf/ScalaXml.scala)
* [Twirl](https://www.playframework.com/documentation/2.5.x/ScalaTemplates): [twirl/htmlperf/twirl.scala.html](src/main/twirl/htmlperf/twirl.scala.html)

## Results

| Size  | ScalaTags 0.6.5 | scala-xml 1.0.6 | Twirl 1.3.2 |
|---:|---:|---:|---:|
| 2 | 0.34ms | 0.38ms | 0.46ms |
| 20 | 0.50ms | 0.86ms | 0.96ms |
| 200 | 2.59ms | 5.61ms | 3.47ms |
