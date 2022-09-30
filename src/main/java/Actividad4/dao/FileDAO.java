package main.java.Actividad4.dao;

import java.io.*;

public interface FileDAO {

    RandomAccessFile readFile(RandomAccessFile file) throws FileNotFoundException;

    Integer requestNewInt();

    RandomAccessFile editFile(RandomAccessFile file, Integer newInt) throws FileNotFoundException;
}