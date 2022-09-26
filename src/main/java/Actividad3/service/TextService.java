package main.java.Actividad3.service;

import main.java.Actividad3.dao.TextDAO;
import main.java.Actividad3.dao.TextDAOImpl;

import java.io.*;

public class TextService {

    private final TextDAO textDAO = (TextDAO) new TextDAOImpl();

    public void createFile(String name, String text) {
        File file = new File("/home/ivan/" + name + ".txt");
        try {
            Writer writer = new FileWriter(file);
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
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