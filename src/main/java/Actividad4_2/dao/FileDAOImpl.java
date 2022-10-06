package main.java.Actividad4_2.dao;

import java.io.*;

public class FileDAOImpl implements FileDAO {


    @Override
    public void readFile(String file) throws FileNotFoundException {
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