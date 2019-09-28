def call(node, context = [:], body) {

  node(node) {
    body()
  }
}