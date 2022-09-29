package main.java.Actividad5.dao;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public interface FileDAO {

    RandomAccessFile readFile(RandomAccessFile file) throws FileNotFoundException;

    RandomAccessFile editFile(RandomAccessFile file, int newInt) throws FileNotFoundException;
}