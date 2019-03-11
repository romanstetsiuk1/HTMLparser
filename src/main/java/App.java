import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class App {

    public static void main(String[] args) {
            openBrowser();
    }

    private static void openBrowser() {
        String url = "http://www.google.com";

        if(Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI(url));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        } else {
            Runtime runtime = Runtime.getRuntime();
            try {
                runtime.exec("xdg-open "+ url);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
