package main.java.Actividad1.service;

import main.java.Actividad1.dao.FileDAO;
import main.java.Actividad1.dao.FileDAOImpl;
import main.java.Actividad1.entity.FileEntity;

import java.io.File;

public class FileService {

    /*public File returnFile() {
        String pathname = "/home/ivan";
        return new File(pathname);
    };

    public void checkIfExists(File file) {
        if (file.exists()) {
            System.out.println("El archivo existe");
        } else {
            System.out.println("El archivo no existe");
        }
    }

    public void checkFile(File file) {
        if (file.isFile()) {
            System.out.println("El archivo es un archivo");
        } else {
            System.out.println("El archivo no es un archivo");
        }
    }

    public void checkDirectory(File file) {
        if (file.isDirectory()) {
            System.out.println("El archivo es un directorio");
        } else {
            System.out.println("El archivo no es un directorio");
        }
    }

    public void listFiles(File file) {
        File[] files = file.listFiles();
        int directoryCont = 0;
        int fileCont = 0;
        for (File filesSum : files) {
            if (filesSum.isDirectory()) {
                directoryCont++;
            } else {
                fileCont++;
            }
        }
        System.out.println("El directorio contiene " + fileCont + " archivo/s.");
        System.out.println("El directorio contiene " + directoryCont + " directorio/s.");

        for (File fileName : files) {
            System.out.println(fileName);
        }
    }

    public static void main(String[] args) {
        FileExample fileExample = new FileExample();
        File file = fileExample.returnFile();
        fileExample.checkIfExists(file);
        fileExample.checkFile(file);
        fileExample.checkDirectory(file);
        fileExample.listFiles(file);
    }*/
    


    private final FileDAO filedao = (FileDAO) new FileDAOImpl();

    public void listFiles() {
        File[] files = filedao.listFiles("/home/ivan");
        for (File file : files) {
            FileEntity fileEntity = new FileEntity(file.getName() + " " + file.length(), file.isDirectory() ? "directory" : "file");
            if (file.isDirectory()) {
                fileEntity.setType("directory");
            } else {
                fileEntity.setType("file");
            }
            System.out.println("The file " + fileEntity.getName() + " is a " + fileEntity.getType());
        }
    }
}