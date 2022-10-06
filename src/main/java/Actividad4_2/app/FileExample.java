package main.java.Actividad4_2.app;

import main.java.Actividad4_2.service.FileService;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {

    public static void main(String[] args) throws IOException {
        String path = "enteros2.dat";
        FileInputStream reader = new FileInputStream("enteros2.dat");
        FileOutputStream writer = new FileOutputStream("enteros2_copy.dat", true);

        FileService fileService = new FileService();

        fileService.readFile(path);
        Integer newInt = fileService.requestNewInt();
        fileService.insertIntegerIntoFile(writer, newInt);
        fileService.readFile(path);
    }
}