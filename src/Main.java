import type.ModuleNode;
import util.Analyzer;
import util.ParserAgent;
import util.Visualizer;

public class Main {
    public static void main(String[] args) {
        String filename = null;
        try {
            for (int i = 0; i < args.length; i++) {
                if (args[i].equals("-f")) {
                    i++;
                    if (i >= args.length)
                        throw new RuntimeException("Missing code file name");
                    filename = args[i];
                } else {
                    throw new RuntimeException(
                            "Usage: java Main -f file_name");
                }
            }
            if (filename == null)
                throw new RuntimeException("File not specified");
            ModuleNode moduleNode = ParserAgent.parse(filename);
            Analyzer.analyze(moduleNode);
            Visualizer.visualize(moduleNode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
