def newGit(repo)
{
     git "${repo}"
}
def newMaven()
{
    sh 'mvn package'
}
def newDeploy(app,j,ip,f)
{
     echo "${app}"
     "sh scp /home/ubuntu/.jenkins/workspace/${j}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${f}.war"
}
def newTest(appname)
{
     sh "java -jar /home/ubuntu/.jenkins/workspace/${appname}/testing.jar"
}


