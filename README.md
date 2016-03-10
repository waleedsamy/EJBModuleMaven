# EJBModuleMaven [![Build Status](https://travis-ci.org/waleedsamy/EJBModuleMaven.svg?branch=master)](https://travis-ci.org/waleedsamy/EJBModuleMaven)
> Sample Maven Ejb Module with test classes built up on embedded EJB container. Embedded Ejb Container provider is GlassFish 4.1

# Requirements:
 * JDK 1.7
 * maven 3.3.9
 

# Run Test:
 * glassfish 4.0
 
    ```bash
     mvn test -P embedded-GF
    ```
 * TomEE
 
    ```bash
     mvn test -P embedded-TEE
    ```