package main.java.Actividad4_2.dao;

import java.io.*;

public class FileDAOImpl implements FileDAO {


    @Override
    public FileInputStream readFile(FileInputStream file) {
        return file;
    }

    @Override
    public Integer requestNewInt() {
        return null;
    }

    @Override
    public FileOutputStream insertIntegerIntoFile(FileOutputStream file, Integer newInt) throws FileNotFoundException {
        return new FileOutputStream("enteros.dat");
    }
}