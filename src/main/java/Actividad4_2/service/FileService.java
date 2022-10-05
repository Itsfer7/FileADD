package main.java.Actividad4_2.service;

import main.java.Actividad4_2.dao.FileDAO;
import main.java.Actividad4_2.dao.FileDAOImpl;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileService {

    private final FileDAO fileDAO = new FileDAOImpl();

    public Integer requestNewInt() {
        Scanner scanner = new Scanner(System.in);
        Integer newInt = fileDAO.requestNewInt();
        System.out.println("Introduce un número entero para añadirlo al fichero: ");
        while (newInt == null) {
            try {
                newInt = scanner.nextInt();
            } catch (InputMismatchException exception) {
                scanner.nextLine();
                System.out.println("El valor introducido debe ser un número entero");
            }
        }
        return newInt;
    }

    public void readFile(FileInputStream file) throws FileNotFoundException {
        FileInputStream reader = fileDAO.readFile(file);
        System.out.println("Leyendo el fichero...");
        try {
            int content;
            while ((content = reader.read()) != -1) {
                System.out.println((char)content);
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public void insertIntegerIntoFile(FileOutputStream file, Integer newInt) throws FileNotFoundException {
        FileOutputStream writer = fileDAO.insertIntegerIntoFile(file, newInt);
        try {
            writer.write(newInt);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}