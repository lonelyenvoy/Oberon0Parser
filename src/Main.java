import grammar.Parser;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String fileName = null;
        try {
            for (int i = 0; i < args.length; i++) {
                if (args[i].equals("-f")) {
                    i++;
                    if (i >= args.length)
                        throw new RuntimeException("Missing code file name");
                    fileName = args[i];
                } else {
                    throw new RuntimeException(
                            "Usage: java Main -f file_name");
                }
            }
            if (fileName == null)
                throw new RuntimeException("File not specified");
            Parser p = new Parser(new File(fileName));
            p.parse();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
