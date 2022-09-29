package main.java.Actividad4.dao;

import java.io.*;

public interface FileDAO {

    RandomAccessFile readFile(RandomAccessFile file) throws FileNotFoundException;

    RandomAccessFile editFile(RandomAccessFile file, int newInt) throws FileNotFoundException;
}