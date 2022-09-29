package main.java.Actividad4.dao;

import java.io.*;
import java.nio.file.Path;

public class FileDAOImpl implements FileDAO {


    @Override
    public BufferedReader readFileBeforeChanges(Path path) throws FileNotFoundException {
        return new BufferedReader(new FileReader(path.toFile()));
    }

    @Override
    public BufferedWriter editFile(Integer newInt, Path path) throws IOException {
        return new BufferedWriter(new FileWriter(path.toFile()));
    }

    @Override
    public BufferedReader readFileAfterChanges(Path path) throws FileNotFoundException {
        return new BufferedReader(new FileReader(path.toFile()));
    }
}