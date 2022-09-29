package main.java.Actividad5.service;

import main.java.Actividad5.dao.FileDAO;
import main.java.Actividad5.dao.FileDAOImpl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class FileService {

    private final FileDAO fileDAO = new FileDAOImpl();

    public Integer requestNewInt() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce un numero entero para añadirlo al fichero: ");
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("El valor introducido no es un numero entero");
            return requestNewInt();
        }
    }

    public void readFile(RandomAccessFile file) throws FileNotFoundException {
        RandomAccessFile reader = fileDAO.readFile(file);
        System.out.println("Leyendo el fichero...");
        try {
            reader.seek(0);
            while (reader.getFilePointer() < reader.length()) {
                System.out.println(file.readInt());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void editFile(RandomAccessFile file, int newInt) throws FileNotFoundException {
        RandomAccessFile reader = fileDAO.editFile(file, newInt);
        try {
            reader.seek(file.length());
            reader.writeInt(newInt);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}