package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream inner;

    public AmigoOutputStream(FileOutputStream stream) throws IOException {
        super(fileName);
        this.inner = stream;
    }

    @Override
    public void write(int b) throws IOException {
        inner.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        inner.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        inner.write(b, off, len);
    }

    @Override
    public void flush() throws IOException {
        inner.flush();
    }

    @Override
    public void close() throws IOException {
        inner.flush();
        inner.write("JavaRush © All rights reserved.".getBytes());
        inner.close();
    }

    public static void main(String[] args) throws IOException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
