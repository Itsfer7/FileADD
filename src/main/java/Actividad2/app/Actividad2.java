package main.java.Actividad2.app;

import main.java.Actividad2.service.FileService;
import main.java.Actividad2.exception.FileWithoutExtensionException;

public class Actividad2 {

    private static final String PATH = "C:\\temp\\ad\\ut2\\actividad1";

    public static void main(String[] args) throws FileWithoutExtensionException {
        FileService myServiceFile = new FileService();
        myServiceFile.renameFilesWithPermissions(PATH);

    }

}