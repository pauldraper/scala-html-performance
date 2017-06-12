# Scala HTML Templating Benchmarks

## Run

Install sbt.

```sh
sbt test
```

## Templates

* [ScalaTags](http://www.lihaoyi.com/scalatags/): [src/main/scala/htmlperf/ScalaTags.scala](src/main/scala/htmlperf/ScalaTags.scala)
* [Twirl](https://www.playframework.com/documentation/2.5.x/ScalaTemplates): [src/main/twirl/htmlperf/twirl.scala.html](src/main/twirl/htmlperf/twirl.scala.html)

## Results

| Size  | ScalaTags 0.6.5 | Twirl 1.3.2 |
|---:|---:|---:|
| 2 | 0.36ms | 0.39ms |
| 20 | 0.58ms | 0.78ms |
| 200 | 2.82ms | 3.37ms |
