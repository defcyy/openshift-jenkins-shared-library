import main.groovy.io.common.Openshift

def test() {

  echo "test function call"
  echo Openshift.currentNamespace()

  echo "call api to get jenkins deploymentconfig"
  new Openshift().getDeploymentConfigs().each {
    echo "deployment config: ${it.name}"
  }

}