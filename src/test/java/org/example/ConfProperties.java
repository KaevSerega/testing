package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfProperties {

    private static final Properties PROPERTIES;

    static {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("src/test/resources/conf.properties");
            PROPERTIES = new Properties();
            PROPERTIES.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileInputStream != null)
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    public static String getProperty(String key) {
        return PROPERTIES.getProperty(key);
    }
}