package com.magnus.dms.utils;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private static final Properties properties = new Properties();

    static {
        try (InputStream input = ConfigReader.class
                .getClassLoader()
                .getResourceAsStream("config.properties")) {

            if (input == null) {
                throw new RuntimeException(
                        "config.properties not found in test resources."
                );
            }

            properties.load(input);

        } catch (Exception e) {
            throw new RuntimeException(
                    "Failed to load configuration.",
                    e
            );
        }
    }

    public static String get(String key) {

        String value = properties.getProperty(key);

        if (value == null) {
            throw new RuntimeException(
                    "Configuration key not found: " + key
            );
        }

        if (value.startsWith("${") && value.endsWith("}")) {

            String environmentVariable =
                    value.substring(2, value.length() - 1);

            String environmentValue =
                    System.getenv(environmentVariable);

            if (environmentValue == null ||
                    environmentValue.isBlank()) {

                throw new RuntimeException(
                        "Environment variable not set: "
                                + environmentVariable
                );
            }

            return environmentValue;
        }

        return value;
    }

    private ConfigReader() {
    }
}
