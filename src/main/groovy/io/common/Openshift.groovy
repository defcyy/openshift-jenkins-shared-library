package main.groovy.io.common

@Grab("com.openshift:openshift-restclient-java:5.9.6.Final")

import com.openshift.restclient.ClientBuilder
import com.openshift.restclient.IClient
import com.openshift.restclient.ResourceKind
import com.openshift.restclient.model.IDeploymentConfig

import java.security.cert.CertificateFactory

class Openshift {

  public static namespaceFile = "var/run/secrets/kubernetes.io/serviceaccount/namespace"

  IClient client

//  Openshift() {
//    def token = new File("/var/run/secrets/kubernetes.io/serviceaccount/token").text
//    def is = new FileInputStream("/var/run/secrets/kubernetes.io/serviceaccount/ca.crt")
//    def certificate = CertificateFactory.getInstance("X.509").generateCertificate(is)
//    client = new ClientBuilder()
//        .toCluster("https://kubernetes.default")
//        .usingToken(token)
//        .sslCertificate("openshift", certificate)
//        .build()
//  }

  static currentNamespace() {
    return new File(namespaceFile).text
  }

//  def getDeploymentConfigs() {
//    IDeploymentConfig[] resources = client.list(ResourceKind.DEPLOYMENT_CONFIG, currentNamespace())
//    return resources
//  }
}
