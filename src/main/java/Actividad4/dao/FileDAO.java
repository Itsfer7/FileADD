package main.java.Actividad4.dao;

import java.io.*;
import java.nio.file.Path;

public interface FileDAO {

    BufferedReader readFileBeforeChanges(Path path) throws FileNotFoundException;

    BufferedWriter editFile(Integer newInt, Path path) throws IOException;
    BufferedReader readFileAfterChanges(Path path) throws FileNotFoundException;
}