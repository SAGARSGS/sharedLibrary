def newGit(repo)
{
     git "${repo}"
}
def newMaven()
{
    sh 'mvn package'
}
def newDeploy(ip,filename)
{
     sh "scp /home/ubuntu/.jenkins/workspace/SharedLibrary/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${filename}.war"
}
def newTest(appname)
{
     sh "java -jar /home/ubuntu/.jenkins/workspace/${appname}/testing.jar"
}

