package NewRegex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class HTMLReader {
    public static String getHTML(String urlString) throws IOException {
        StringBuilder sb = new StringBuilder();
        URL url = new URL(urlString);
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(url.openStream(), "UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
        }
        return sb.toString();
    }
}
