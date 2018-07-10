package util;

import grammar.Parser;
import type.ModuleNode;

import java.io.File;

public class ParserAgent {
    public static ModuleNode parse(String filename) throws Exception {
        Parser p = new Parser(new File(filename));
        return (ModuleNode) p.parse().value;
    }
}
