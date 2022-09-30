package main.java.Actividad4.app;

import main.java.Actividad4.service.FileService;

import java.io.IOException;
import java.io.RandomAccessFile;

public class FileExample {

    public static void main(String[] args) throws IOException {
        RandomAccessFile file = new RandomAccessFile("enteros.dat", "rw");

        FileService fileService = new FileService();

        fileService.readFile(file);
        Integer newInt = fileService.requestNewInt();
        fileService.editFile(file, newInt);
        fileService.readFile(file);
    }
}