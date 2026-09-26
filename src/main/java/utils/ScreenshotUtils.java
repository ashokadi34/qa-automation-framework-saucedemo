package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.google.common.io.Files;
import java.io.File;

public class ScreenshotUtils {
    public static String capture(WebDriver driver, String name) {
        String directory = "screenshots";
        String path = directory + "/" + name + ".png";

        try {
            File screenshotDir = new File(directory);
            if (!screenshotDir.exists() && !screenshotDir.mkdirs()) {
                throw new RuntimeException("Unable to create screenshot directory");
            }

            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            File destination = new File(path);
            Files.copy(source, destination);
            return path;
        } catch (Exception e) {
            throw new RuntimeException("Failed to capture screenshot: " + path, e);
        }
    }
}
