### To run
./mvnw spring-boot:run

### To add dependency using command line
To add a dependency to a Spring Boot project using the Maven command line, you can use the following command:

```bash
mvn dependency:resolve -DgroupId=<groupId> -DartifactId=<artifactId> -Dversion=<version>
```

Replace `<groupId>`, `<artifactId>`, and `<version>` with the specific details of the dependency you want to add.

For example, if you wanted to add the Spring Data JPA dependency to your project, you would run:

```bash
mvn dependency:resolve -DgroupId=org.springframework.boot -DartifactId=spring-boot-starter-data-jpa -Dversion=2.6.0
```

After running this command, Maven will download the specified dependency and add it to your project's `pom.xml` file.

or just look it up on mvnrepository.com and add to `pom.xml` file 