def call(environment, context = [:], body) {
  def project = "${namespace.trim(environment)}-${environment}"

  body()
}