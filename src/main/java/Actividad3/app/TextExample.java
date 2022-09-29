package main.java.Actividad3.app;

import main.java.Actividad3.service.TextService;
import java.io.File;

public class TextExample {

    public static void main(String[] args) {
        TextService textService = new TextService();

        String name = textService.requestName();
        String text = textService.requestText();

        File file = textService.createFile(name, text);

        textService.readFile(file);
    }
}