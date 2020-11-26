package com.javarush.task.task31.task3111;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {
    private String partOfName = "";
    private String partOfContent = "";
    private int minSize = -1;
    private int maxSize = -1;
    private List<Path> foundFiles = new ArrayList<>();

    public void setPartOfName(String partOfName) {
        this.partOfName = partOfName;
    }

    public void setPartOfContent(String partOfContent) {
        this.partOfContent = partOfContent;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public String getPartOfName() {
        return partOfName;
    }

    public String getPartOfContent() {
        return partOfContent;
    }

    public int getMinSize() {
        return minSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public List<Path> getFoundFiles()
    {
        return foundFiles;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        byte[] content = Files.readAllBytes(file); // размер файла: content.length
        boolean containName = true;
        boolean containContext = true;
        boolean lessMaxSize = true;
        boolean moreMinSize = true;

        if(!file.getFileName().toString().contains(getPartOfName())) containName = false;
        if(!new String(content).contains(getPartOfContent())) containContext = false;
        if(getMaxSize() != -1 && content.length > getMaxSize()) lessMaxSize = false;
        if(getMinSize() != -1 && content.length < getMinSize()) moreMinSize = false;
        if(containName && containContext && lessMaxSize && moreMinSize) foundFiles.add(file);

        return FileVisitResult.CONTINUE;
    }

}
