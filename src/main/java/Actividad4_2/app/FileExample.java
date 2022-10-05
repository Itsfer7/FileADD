package main.java.Actividad4_2.app;

import main.java.Actividad4_2.service.FileService;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {

    public static void main(String[] args) throws IOException {
        FileInputStream reader = new FileInputStream("enteros2.dat");
        FileOutputStream writer = new FileOutputStream("enteros2.dat");

        FileService fileService = new FileService();

        fileService.readFile(reader);
        Integer newInt = fileService.requestNewInt();
        fileService.insertIntegerIntoFile(writer, newInt);
        fileService.readFile(reader);
    }
}