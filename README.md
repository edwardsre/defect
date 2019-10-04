# Enunciate 2.12.0 defect

The `install-artifact` goal of the enunciate plugin fails in when specifying only the `artifactId` for `java.json.client.library`.

Pull the code and do a `mvn -DskipTests clean install`.

Changing the version property for enunciate to `2.11.1` works as expected.
