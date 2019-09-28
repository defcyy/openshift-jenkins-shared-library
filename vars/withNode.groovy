def call(node, context = [:], body) {

  stage("${environment}: ${node}") {
    steps {
      script {
        body()
      }
    }
  }
}