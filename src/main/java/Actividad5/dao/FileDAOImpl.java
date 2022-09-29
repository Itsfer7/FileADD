package main.java.Actividad5.dao;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class FileDAOImpl implements FileDAO {


    @Override
    public RandomAccessFile readFile(RandomAccessFile file) {
        return file;
    }

    @Override
    public RandomAccessFile editFile(RandomAccessFile file, int newInt) throws FileNotFoundException {
        return new RandomAccessFile("enteros.dat", "rw");
    }
}