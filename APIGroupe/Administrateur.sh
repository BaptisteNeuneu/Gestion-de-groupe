#!/bin/bash
javac -cp build -d build -sourcepath "src" src/fr/iutfbleau/projetIHM2022FI2/Admin/Controleur/*.java -encoding utf8
javac -cp build -d build  -sourcepath "src" src/fr/iutfbleau/projetIHM2022FI2/Admin/Vue/*.java -encoding utf8
javac -cp build -d build  -sourcepath "src" src/fr/iutfbleau/projetIHM2022FI2/Modele/*.java -encoding utf8
javac -cp build -d build -sourcepath "src" src/fr/iutfbleau/projetIHM2022FI2/Admin/*.java -encoding utf8
java -cp build fr/iutfbleau/projetIHM2022FI2/Admin/MainAdmin