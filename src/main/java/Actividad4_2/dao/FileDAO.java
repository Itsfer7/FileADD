package main.java.Actividad4_2.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;

public interface FileDAO {

    FileInputStream readFile(FileInputStream file) throws FileNotFoundException;

    Integer requestNewInt();

    FileOutputStream insertIntegerIntoFile(FileOutputStream file, Integer newInt) throws FileNotFoundException;
}