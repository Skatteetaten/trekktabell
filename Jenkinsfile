#!groovy

node {
 step([$class: 'StashNotifier'])
 def buildResult = 'FAILED'
 try {
   stage "Checkout source"
   env.PATH = "${tool 'apache-maven'}/bin:${env.PATH}"
   checkout scm
   String branchName = "${env.BRANCH_NAME}"

   if (branchName == "master") {
     buildTestAndDeployMaster()
   } else {
     buildTestAndDeployFeatureBranch(branchName)
   }
   buildResult = 'SUCCESS'
 } finally {
    currentBuild.result = buildResult
    step([$class: 'StashNotifier'])
 }
}

def buildTestAndDeployMaster() {
  String newVersion = "1.0.${env.BUILD_NUMBER}"
  setVersion(newVersion)
  echo "Bygger og deployer ${newVersion} til Nexus"
  stage "Build, Test and Deploy"
  sh "mvn -s '/home/aurora/settings.xml' clean deploy scm:tag -Prelease -Pno-snapshots"
}

def buildTestAndDeployFeatureBranch(String branchName) {
  def sisteDelIndeks = branchName.lastIndexOf("/") + 1
  def lengde = branchName.length()
  String newVersion = "${branchName.substring(sisteDelIndeks, lengde)}-1.0.${env.BUILD_NUMBER}"
  setVersion(newVersion)
  stage "Build and Deploy"
  sh "mvn -s '/home/aurora/settings.xml' clean deploy -Prelease -Pno-snapshots -DskipTests"
  stage "Test"
  sh "mvn clean install"
}

def setVersion(String newVersion) {
  stage "Set Version"
  currentBuild.displayName = newVersion
  sh "mvn -X versions:set -DnewVersion=${newVersion}"
}
