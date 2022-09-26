package main.java.Actividad3.dao;

import java.io.File;

public class TextDAOImpl {

    File createFile(String name) {
        return new File("/home/ivan/" + name + ".txt");
    }
}
