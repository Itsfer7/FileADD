package main.java.Actividad4.app;

import main.java.Actividad4.service.FileService;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExample {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/home/ivan/enteros.dat");

        FileService fileService = new FileService();

        Integer newInt = fileService.requestNewInt();

        fileService.readFileBeforeChanges(path);
        //fileService.editFile(newInt, path);
        //fileService.readFileAfterChanges(path);
    }
}