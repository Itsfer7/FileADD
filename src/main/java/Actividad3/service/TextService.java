package main.java.Actividad3.service;

import main.java.Actividad3.dao.TextDAO;
import main.java.Actividad3.dao.TextDAOImpl;

import java.io.*;

public class TextService {

    private final TextDAO textDAO = new TextDAOImpl();

    public File createFile(String name, String text) {
        File file = textDAO.createFile(name, text);
        try {
            Writer writer = new FileWriter(file);
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    public void readFile(File file){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}