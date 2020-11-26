/*package com.javarush.task.task31.task3105;

import java.io.*;
import java.util.*;
import java.util.zip.*;
*/
/* 
Добавление файла в архив
*/

/*
public class Solution {
    public static void main(String[] args) throws IOException {
        //read zip contents
        ZipInputStream zis = new ZipInputStream(new FileInputStream(args[1]));
        Map<String, byte []> zipContents = new HashMap<>();;
        //String newFile = "new" + File.separator + args[0].substring(args[0].lastIndexOf('/')+1);
        String newFile = "new/" + args[0].substring(args[0].lastIndexOf('/')+1);
        ZipEntry tempZipEntry;
        ByteArrayOutputStream tempB;
        while ((tempZipEntry = zis.getNextEntry()) != null) {
            tempB = new ByteArrayOutputStream();
            for (int c = zis.read(); c != -1; c = zis.read()) {
                tempB.write(c);
            }
            tempB.flush();
            zipContents.put(tempZipEntry.getName(), tempB.toByteArray());
            zis.closeEntry();
        }
        zis.close();

        //add new file
        FileInputStream fis = new FileInputStream(args[0]);
        tempB = new ByteArrayOutputStream();
        for (int c = fis.read(); c != -1; c = fis.read()) {
            tempB.write(c);
        }
        tempB.flush();
        zipContents.put(newFile, tempB.toByteArray());
        fis.close();

        //write new zip
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(args[1]));
        for (Map.Entry<String, byte[]> zipEntry :
                zipContents.entrySet()) {
            zos.putNextEntry(new ZipEntry(zipEntry.getKey()));
            zos.write(zipEntry.getValue());
            zos.closeEntry();
        }
        zos.close();
    }
}
*/
package com.javarush.task.task31.task3105;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/*
Добавление файла в архив
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        String newFileName = Paths.get(args[0]).getFileName().toString();
        String newPathInArchive = "new/" + newFileName;
        ZipEntry entry;
        Map<String, ByteArrayOutputStream> filesInArchive = new HashMap<>();

        ZipInputStream zipIn = new ZipInputStream(new FileInputStream(args[1]));
        while ((entry = zipIn.getNextEntry()) != null) {
            if (entry.getName().endsWith(newFileName)) {
                newPathInArchive = entry.getName();
            } else {
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                int length = 0;
                byte[] buffer = new byte[1024];
                while ((length = zipIn.read(buffer)) != -1) {
                    baos.write(buffer, 0, length);
                }
//                baos.write(zipIn.readAllBytes());
                filesInArchive.put(entry.getName(), baos);
            }
        }
        zipIn.close();

        ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(args[1]));
        zipOut.putNextEntry(new ZipEntry(newPathInArchive));
        Files.copy(Paths.get(args[0]), zipOut);
        for (Map.Entry<String, ByteArrayOutputStream> pair : filesInArchive.entrySet()) {
            zipOut.putNextEntry(new ZipEntry(pair.getKey()));
            pair.getValue().writeTo(zipOut);
        }
        zipOut.close();
    }
}