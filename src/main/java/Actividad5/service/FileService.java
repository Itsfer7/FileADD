package main.java.Actividad5.service;

import main.java.Actividad5.dao.FileDAO;
import main.java.Actividad5.dao.FileDAOImpl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileService {

    private final FileDAO fileDAO = new FileDAOImpl();
    
    public Integer requestPosition(RandomAccessFile file) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Integer requestedPosition = fileDAO.requestPosition(file);
        System.out.println("Introduce la posición del número que quieres editar: ");
        while (requestedPosition == null) {
            try {
                requestedPosition = scanner.nextInt();
                while (requestedPosition < 1 || requestedPosition > file.length() / 4) {
                    System.out.println("La posición del número debe ser mayor que 0 y debe existir en el fichero");
                    requestedPosition = scanner.nextInt();
                }
            } catch (InputMismatchException exception) {
                scanner.nextLine();
                System.out.println("La posición debe ser un número");
            }
        }
        return requestedPosition;
    }

    public void readRequestedInt(RandomAccessFile file, Integer requestPosition) throws IOException {
        RandomAccessFile reader = fileDAO.readRequestedInt(file, requestPosition);
        try {
            reader.seek((requestPosition - 1) * 4L);
            System.out.println("El número en la posición " + requestPosition + " es: " + reader.readInt());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Integer requestNewInt() {
        Scanner scanner = new Scanner(System.in);
        Integer newInt = fileDAO.requestNewInt();
        System.out.println("Introduce un número entero para sobreescribir el anterior: ");
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

    public void readFile(RandomAccessFile file) throws FileNotFoundException {
        RandomAccessFile reader = fileDAO.readFile(file);
        System.out.println("Leyendo el fichero...");
        int i = 1;
        try {
            reader.seek(0);
            while (reader.getFilePointer() < reader.length()) {
                System.out.println((i) + ". " + file.readInt());
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void insertIntegerIntoFileIntoGivenPosition(RandomAccessFile file, Integer requestPosition, Integer newInt) throws FileNotFoundException {
        RandomAccessFile reader = fileDAO.insertIntegerIntoFileIntoGivenPosition(file, requestPosition, newInt);
        try {
            reader.seek((requestPosition - 1) * 4L);
            reader.writeInt(newInt);
            System.out.println("El número en la posición " + requestPosition + " ahora es: " + newInt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}