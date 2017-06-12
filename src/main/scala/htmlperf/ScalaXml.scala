package htmlperf

object ScalaXml {

  def render(title: String, paragraph: String, n: Int) =
    <html>
      <head>
        <script>console.log(1)</script>
      </head>
      <body>
        <h1 color="red">{title}</h1>
        <div style="background-color:blue">
          <p class="content first">{paragraph}</p>
          <a href="http://example.com">Example</a>
          {(0 until n).map { i =>
            <p class="content" style={if ((i % 2) == 0) "color:red" else "color:green"}>Paragraph {i}</p>
          }}
        </div>
      </body>
    </html>

}
