#!/bin/bash

# bash script for compiling JFlex and CUP description files
# Execute this file in the project's root directory.
# author: lonelyenvoy
# requires: jflex, java_cup

# JFlex
echo
echo "JFlex: "
mkdir -p src/oberon0_grammar/
jflex flex/Oberon0.flex -d $_

# CUP
echo
echo "CUP: "
java -jar lib/java-cup-11b.jar -parser Parser -symbols SymbolConstants cup/Oberon0.cup
mv Parser.java src/oberon0_grammar/
mv SymbolConstants.java $_
