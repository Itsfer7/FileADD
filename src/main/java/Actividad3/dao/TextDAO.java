package main.java.Actividad3.dao;

import java.io.File;

public interface TextDAO {
    File createFile(String name, String text);
    File readFile(File file);
}
