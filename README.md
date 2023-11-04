## Projet

Il s'agit d'un générateur de mots de passe en Java. 

## Objectif du projet 

Capable de générer des mots de passe aléatoire en fonction des critères définis tels que la longueur et la complexité. 

## Pré-requis 

- JDK
- Maven
- IDE

## Utilisation

### Installation
``` git clone ```
``` cd ```
``` mvn clean install ```

### Test unitaire

``` mvn test ```

Voici l'extrait du test unitaire : 
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------< com.example:my-pwd-generator >--------------------
[INFO] Building my-pwd-generator 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ my-pwd-generator ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory workspace/java/java-generator-pwd/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ my-pwd-generator ---
[INFO] No sources to compile
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ my-pwd-generator ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory workspace/java/java-generator-pwd/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ my-pwd-generator ---
[INFO] No sources to compile
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ my-pwd-generator ---
[INFO] No tests to run.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.538 s
[INFO] Finished at: 2023-11-04T13:31:14+01:00
[INFO] ------------------------------------------------------------------------

### Génération des mots de passe

Utiliser le terminal pour exécuter le programme : 

``` java -jar target/pwd-generator-1.0-SNAPSHOT.jare ```
ou
``` javac PwdGenerator.java ```
``` java PwdGenerator ```

## Merci d'avoir utilisé ce projet !

J'ai simplement réalisé ce projet pour s'amuser. J'espère que cela vous a été utile et qu'il répond à vos besoins.