package com.zipeng.java;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @auter zipeng
 * @create &{YEAR}-05-29-16:21
 */
public class FileUtilsTest {

    public static void main(String[] args) {
        File scrFile = new File("day17\\1.jpg");
        File destFile = new File("day17\\3.jpg");
        try {
            FileUtils.copyFile(scrFile,destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
