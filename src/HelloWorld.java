import java.nio.charset.Charset;
import java.io.IOException;
import java.nio.file.*;
import static java.lang.System.*;

public class HelloWorld {
    public static void main(String[] args) {
        Path source = Paths.get(args[0]);
        out.println(source.toString());
        Charset charset = Charset.forName("UTF-8");
        try {
           for(String line : Files.readAllLines(source, charset)) {
               out.println(line);
           }
           String sout=Files.readString(source);
           out.println("Show a string");
           out.println(sout);
        } catch(IOException ex) {
           err.println(ex.getMessage());
        }
        
    }
}