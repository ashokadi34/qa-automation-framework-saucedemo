package utils;

import org.openqa.selenium.*;
import com.google.common.io.Files;
import java.io.File;


public class ScreenshotUtils {

    public static String capture(WebDriver driver, String name) {

        String path = "screenshots/" + name + ".png";

        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);
            File dest = new File(path);

            Files.copy(src, dest);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return path;
    }
}