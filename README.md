# PracticingIntellijJavaProjectUpload
Practicing to upload Java project from IntelliJ using git from scratch

This is my first project where I am trying to create Java application on Intellij and pushing on Github

1. On Intellij, I created New -> project -> Maven ->  gave groupId,artifactId,version and then folder path

2. then created package inside src/main/java -> com.example and wrote Hello-world.java and Calculator.java files

3. Then for testing I created inside /src/test/java - >com.test and wrote CalculatorTest.java file

4. I just used @Test annotation and then alt+enter asked me to choose junit-4 and then done


Now challenge was how to upload this on github:

1. Enabled VCS inside intellij

2. $ git init -> it created .git file

3. There were some folders like .idea/ and DS_Store(mac property) and target/ which I don't want to upload so kept them inside .gitignore file

4.$ git status -> it now show me required folders which I need to add on my remore repository

5. I went to github, created new repository which is current one and WITHOUT readme.md , else we won't be able to push from local to remote and has to first pull and local goes out of sync(I faced it :( )

6.$ git remote add origin <repo-name>

7. $ git push origin master



Making it executable jar, whatever artifactId and version we passed, same name jar is created by default if we dont add <packaging> in pom.xml
  
      $ mvn clean 
      $ mvn compile
      $ mvn package
  
  To verify if jar is working
      
        $ jar tf target/Example-1.1-SNAPSHOT.jar
        $ java -jar target/Example-1.1-SNAPSHOT.jar
 
 This threw ERROR: no main manifest attribute, in target/Example-1.1-SNAPSHOT.jar
 
 The -jar option only works if the JAR file is an executable JAR file, which means it must have a manifest file with a Main-Class attribute in it. 
 
 Hence, I added this  property inside pom.xml and Boom!!!!
                <build>
                    <configuration>
                      <archive>
                        <manifest>
                            <mainClass>com.example.Demo1</mainClass>
                        </manifest>
                    </archive>
                    </configuration>
                <build>
  
