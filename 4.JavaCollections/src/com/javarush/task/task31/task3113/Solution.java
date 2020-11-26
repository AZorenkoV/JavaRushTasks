package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* 
Что внутри папки?
*/

public class Solution extends SimpleFileVisitor<Path> {

    private AtomicInteger countDirectory = new AtomicInteger(0);
    private AtomicInteger countFiles = new AtomicInteger(0);;
    private AtomicLong sizeDirectory = new AtomicLong(0);

    public int getCountDirectory() {
        return countDirectory.get();
    }

    public int getCountFiles() {
        return countFiles.get();
    }

    public long getSizeDirectory() {
        return sizeDirectory.get();
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        countDirectory.incrementAndGet();
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        sizeDirectory.addAndGet(Files.readAllBytes(file).length);
        countFiles.incrementAndGet();

        return FileVisitResult.CONTINUE;
    }

    public static void main(String[] args) throws IOException {
        Solution s = new Solution();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String directoryName = bf.readLine();
        Path directory = Paths.get(directoryName);
        if(!Files.isDirectory(directory)) {
            System.out.println(directory.toString() + " - не папка");
            return;
        }
        Files.walkFileTree(directory, s);
        System.out.println("Всего папок - " + (s.getCountDirectory() - 1));
        System.out.println("Всего файлов - " + s.getCountFiles());
        System.out.println("Общий размер - " + s.getSizeDirectory());
    }
}
