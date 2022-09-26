package main.java.Actividad1.app;

import main.java.Actividad1.service.FileService;

public class FileExample {

    public static void main(String[] args) {
        FileService fileService = new FileService();
        fileService.listFiles();
    }
}