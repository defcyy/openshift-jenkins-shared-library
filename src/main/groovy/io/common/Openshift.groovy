package main.groovy.io.common

@Grab("com.openshift:openshift-restclient-java:8.0.0.Final")

import com.openshift.restclient.ClientBuilder
import com.openshift.restclient.IClient

class Openshift {

  public static namespaceFile = "var/run/secrets/kubernetes.io/serviceaccount/namespace"

  public static currentNamespace() {
    return new File(namespaceFile).getText().trim()
  }

  Openshift() {
    IClient client = new ClientBuilder()
        .build()
  }
}
