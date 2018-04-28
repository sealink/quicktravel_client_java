package au.com.sealink.quicktravel.client.helpers;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;

public class FixtureHelper {
    public static String fromFile(String filename) {
        try {
            URL url = FixtureHelper.class.getResource("/" + filename);
            File file = new File(url.getFile());
            return new String(Files.readAllBytes(file.toPath()), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
