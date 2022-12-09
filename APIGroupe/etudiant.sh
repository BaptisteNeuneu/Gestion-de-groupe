#!/bin/bash
javac -cp build -d build -sourcepath "src" src/fr/iutfbleau/projetIHM2022FI2/Etu/Vue/*.java -encoding utf8 
java -cp build fr/iutfbleau/projetIHM2022FI2/Etu/Vue/MainEtu 