package com.javarush.task.task19.task1917;

/* 
Свой FileWriter
*/

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

public class FileConsoleWriter {
    //1. Класс FileConsoleWriter должен содержать приватное поле FileWriter fileWriter, которое не должно быть сразу проинициализировано.
    private FileWriter fileWriter;

    //2. Класс FileConsoleWriter должен иметь пять конструкторов которые инициализируют fileWriter для записи.
    //2.1
    FileConsoleWriter(File file) throws IOException {
        this.fileWriter = new FileWriter(file);
    }

    //2.2
    FileConsoleWriter(File file, boolean append) throws IOException {
        this.fileWriter = new FileWriter(file, append);
    }

    //2.3
    FileConsoleWriter(FileDescriptor fd){
        this.fileWriter = new FileWriter(fd);
    }

    //2.4
    FileConsoleWriter(String fileName) throws IOException {
        this.fileWriter = new FileWriter(fileName);
    }

    //2.5
    FileConsoleWriter(String fileName, boolean append) throws IOException {
        this.fileWriter = new FileWriter(fileName, append);
    }


    //3. Класс FileConsoleWriter должен содержать метод write(char[] cbuf, int off, int len) throws IOException, в котором данные для записи должны записываться в fileWriter и дублироваться в консоль.
    public void write(char[] cbuf, int off, int len) throws IOException {
        fileWriter.write(cbuf, off, len);
        System.out.print((new String(cbuf)).substring(off, off+len));
    }

    //4. Класс FileConsoleWriter должен содержать метод write(int c) throws IOException, в котором данные для записи должны записываться в fileWriter и дублироваться в консоль.
    public void write(int c) throws IOException {
        fileWriter.write(c);
        System.out.print(c);
    }

    //5. Класс FileConsoleWriter должен содержать метод write(String str) throws IOException, в котором данные для записи должны записываться в fileWriter и дублироваться в консоль.
    public void write(String str) throws IOException {
        fileWriter.write(str);
        System.out.print(str);
    }

    //6. Класс FileConsoleWriter должен содержать метод write(String str, int off, int len) throws IOException, в котором данные для записи должны записываться в fileWriter и дублироваться в консоль.
    public void write(String str, int off, int len) throws IOException {
        fileWriter.write(str, off, len);
        System.out.print(str.substring(off,off+len));
    }

    //7. Класс FileConsoleWriter должен содержать метод write(char[] cbuf) throws IOException, в котором данные для записи должны записываться в fileWriter и дублироваться в консоль.
    public void write(char[] cbuf) throws IOException {
        fileWriter.write(cbuf);
        System.out.print(new String(cbuf));
    }


    //8. Класс FileConsoleWriter должен содержать метод close() throws IOException, в котором должен вызываться такой же метод поля fileWriter.
    public void close() throws IOException {
        this.fileWriter.close();
    }

    public static void main(String[] args) {

    }

}
