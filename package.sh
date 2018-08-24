#!/bin/bash

#Shell script to build Java package as per MANIFEST.MF

#Enable debugging 
set -x

#Go to SourceCode
cd SourceCode/

#Build Java package with skipTests so that it will be faster
mvn package -DskipTests -Dmaven.repo.local=.m2

#Copy the MANIFEST file to build directoy
cp MANIFEST.MF ../build/.

#Copy the jar file to build directoy
cp target/*.jar ../build/.
