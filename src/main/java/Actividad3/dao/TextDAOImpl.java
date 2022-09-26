package main.java.Actividad3.dao;

import java.io.File;

public class TextDAOImpl implements TextDAO {


    @Override
    public File createFile(String name, String text) {
        return new File("/home/ivan/" + name + ".txt");
    }

    @Override
    public void readFile(File file) {
        System.out.println("Reading file: " + file.getName());
    }
}
