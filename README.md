# Atmosphere test template Maven archetype

## Requirements
You should have Apache Maven installed. If you do not have Maven, see:
- [Atmosphere setup documentation instruction for installing Apache Maven](https://github.com/MusalaSoft/atmosphere-docs/blob/master/setup/maven.md)
- [Official instructions for installing Apache Maven](https://maven.apache.org/install.html)

## Making changes
If you make changes to this project and would like to use your new version of the template for another test project you can run:  
`mvn install`  
This will build the template and will publish the `*.jar` and `*.pom` file to Maven local.

## Create a new project from the generated template

* Run the following command for Linux or macOS:
```
mvn archetype:generate \
    -DarchetypeGroupId=com.musala.atmosphere \
    -DarchetypeArtifactId=atmosphere-test-template \
    -DarchetypeVersion=<custom-archetype version> \
    -DgroupId=com.musala.atmosphere \
    -DartifactId=my-new-test-project
```
* Run the following command for Windows:
```
mvn archetype:generate ^
    -DarchetypeGroupId=com.musala.atmosphere ^
    -DarchetypeArtifactId=atmosphere-test-template ^
    -DarchetypeVersion=<custom-archetype version> ^
    -DgroupId=com.musala.atmosphere ^
    -DartifactId=my-new-test-project
```

Now you can import the project in `Eclipse IDE` or another IDE.
