package com.javarush.task.task31.task3106;

/* 
Разархивируем файл
*/

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Solution {
    public static void main(String[] args) throws IOException {
        // read parameters
        String resultFileName = args[0];
        String [] partFileList = new String[args.length-1];
        for (int i = 0; i < args.length-1; i++) partFileList[i] = args[i+1];
        Arrays.sort(partFileList);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        for (String s:
                partFileList) {
            baos.write(Files.readAllBytes(Paths.get(s)));
        }
        baos.flush();
        ZipInputStream zis = new ZipInputStream(new ByteArrayInputStream(baos.toByteArray()));
        ZipEntry ze = zis.getNextEntry();

        File resultFile = new File(resultFileName);
        FileOutputStream fos = new FileOutputStream(resultFile);
        byte [] buffer = new byte[2048];
        int len;
        while ((len = zis.read(buffer)) > 0) {
            fos.write(buffer, 0, len);
        }
        fos.close();
        zis.close();
    }
}
