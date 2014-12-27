jar-tutorial
============

A small java project for learning how to package Java projects into JAR files


## Notes

The `jar` command must be run within the `build` folder; otherwise, the manifest will think of the `build` directory as part of the qualified package name and then make the entry point unfindable.


### To jar
Within the `build` directory: `jar -cfm ../dist/jar-tutorial.jar ../manifest.txt */*.class`

### To run
Within the project's root directory: `java -jar dist/jar-tutorial.jar`
