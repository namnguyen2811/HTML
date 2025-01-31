import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class HtmlRead {
    String line;
    int c = 1;
    public static void main(String[] args) {
        HtmlRead html = new HtmlRead();
    }

    public HtmlRead() {
        try {
            System.out.println();
            //System.out.print("hello \n");
            URL url = new URL("https://en.wikipedia.org/wiki/Ryan_Conacher");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(url.openStream());
            String line;
            int c = 1;
            while ( (line = reader.readLine()) != null ) {
                if(line.contains("hockey")){
                    int start = line.indexOf("hockey")-10;
                    int end = start + 25;
                    String miniLine = line.substring(start, end);
                    System.out.println(miniLine);
                }
            }
            reader.close();
        } catch(Exception ex) { //print error and keep running the code
            System.out.println(ex);
        }

    }
}
