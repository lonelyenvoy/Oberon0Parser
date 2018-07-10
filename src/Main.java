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
            Visualizer.visualize(ParserAgent.parse(filename));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
