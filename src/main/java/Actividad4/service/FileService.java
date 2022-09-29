package main.java.Actividad4.service;

import main.java.Actividad4.dao.FileDAO;
import main.java.Actividad4.dao.FileDAOImpl;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileService {

    private final FileDAO fileDAO = new FileDAOImpl();

    public Integer requestNewInt() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce un numero entero");
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("El valor introducido no es un numero entero");
            return requestNewInt();
        }
    }

    public void readFileBeforeChanges(Path path){
        /*try {
            BufferedReader reader = fileDAO.readFileBeforeChanges(path);
            String line;
            System.out.println("Leyendo el archivo antes de ser editado: ");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        try {
            byte[] bytes = Files.readAllBytes(path);
            System.out.println("Leyendo el archivo antes de ser editado: ");
            System.out.println(new String(bytes));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void editFile(Integer newInt, Path path) {
        try (BufferedWriter writer = fileDAO.editFile(newInt, path)) {
            writer.write(newInt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFileAfterChanges(Path path) throws IOException {
        /*try {
            BufferedReader reader = fileDAO.readFileAfterChanges(path);
            String line;
            System.out.println("Leyendo el archivo después de ser editado: ");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        try {
            byte[] bytes = Files.readAllBytes(path);
            System.out.println("Leyendo el archivo después de ser editado: ");
            System.out.println(new String(bytes));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}