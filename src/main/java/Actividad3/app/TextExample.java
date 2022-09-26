package main.java.Actividad3.app;

import main.java.Actividad3.service.TextService;

import java.util.Scanner;

public class TextExample {

    public static void main(String[] args) {
        TextService textService = new TextService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre del archivo a crear: ");
        String name = scanner.nextLine();

        System.out.println("Introduce el texto a guardar en el archivo: ");
        String text = scanner.nextLine();

        textService.createFile(name, text);
    }
}