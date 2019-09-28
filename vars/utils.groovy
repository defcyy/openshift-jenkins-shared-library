import main.groovy.io.common.Openshift

def test() {

  echo "test function call"
  echo Openshift.currentNamespace()
}