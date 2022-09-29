package main.java.Actividad5.app;

import main.java.Actividad5.service.FileService;

import java.io.IOException;
import java.io.RandomAccessFile;

public class FileExample {

    public static void main(String[] args) throws IOException {
        RandomAccessFile file = new RandomAccessFile("enteros.dat", "rw");

        FileService fileService = new FileService();

        Integer newInt = fileService.requestNewInt();

        fileService.readFile(file);
        fileService.editFile(file, newInt);
        fileService.readFile(file);
    }
}