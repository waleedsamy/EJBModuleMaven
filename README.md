# EJBModuleMaven [![Build Status](https://travis-ci.org/waleedsamy/EJBModuleMaven.svg?branch=master)](https://travis-ci.org/waleedsamy/EJBModuleMaven)
> Sample Maven Ejb Module with test classes built up on embedded EJB container. Embedded Ejb Container provider is GlassFish 4.1

# Requirements:
 * JDK 1.7
 

# Run Test:
 * glassfish 4.0
 
    ```bash
     mvn clean test -P embedded-GF
    ```
    
 * wildfly 8.1
 
    ```bash
     mvn clean test -P embedded-WF81
    ```