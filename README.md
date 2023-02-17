# About
Demoes issue in Hibernate 6.
If a base class (mapped superclass) has a generic attribute and there are more than one subclasses (entities) with different attribute types, hibernate 6 will incorrectly use the first (alphabetically) attribute type as required for all entities. 

# Testing
Run `./gradlew test` and observer that while test for the FirstEntity passes it fails for the SecondEntity complaining about a wrong method argument type.

# Env
Java 17
