package com.magnus.dms.utils;

import java.io.File;
import java.net.URL;

public class TestDataUtil {

    public static String getFilePath(String fileName) {

        URL resource = TestDataUtil.class
                .getClassLoader()
                .getResource("testdata/" + fileName);

        if (resource == null) {
            throw new RuntimeException(
                    "Test data file not found: " + fileName
            );
        }

        try {
            return new File(resource.toURI()).getAbsolutePath();
        } catch (Exception e) {
            throw new RuntimeException(
                    "Unable to resolve test data file: " + fileName,
                    e
            );
        }
    }

    private TestDataUtil() {
    }
}
