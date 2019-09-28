import main.groovy.io.common.Openshift

def call(Map context = [:], body) {

  def namespace = Openshift.currentNamespace()

  body.namespace = namespace

  body()
}
