package com.simplilearn.project;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class FileManager {

    /*  this class has
     1. show all files
     2. add file
     3. delete file
     4. search file
     5. return to main menu
     6. Close app - done
     */

    static final File folderPath = new File("F:\\MyWork\\FullJavaStack\\Projects\\LockedMe - Project\\FilesForLockedMe");
    LockedMe lockedMe = new LockedMe();
    private static Scanner input = new Scanner(System.in);


    public static void showAllFiles() throws IOException {

        if(folderPath.list().length == 0) {
            System.out.println("\t--Folder is empty--");
            LockedMe.showMenu();
        }
        File[] showFiles = folderPath.listFiles();

        for (int i = 0; i < showFiles.length; i++) {
                System.out.println(showFiles[i].getName());
        }
        LockedMe.showMenu();

    }

    public static void addFile() throws IOException {

        System.out.println("Enter the name of file: ");
        try {

            String fileName = input.nextLine();
            fileName = fileName + ".txt";
            File newFile = new File(folderPath + "\\" + fileName);

            if (newFile.createNewFile()) {
                System.out.println(fileName + " File created");

            } else {
                System.out.println("File already exist in this folder, at location => " + newFile);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        LockedMe.showMenu();
    }

    public static void deleteFile() throws IOException {

        if(folderPath.list().length == 0) {
            System.out.println("\t--Folder is empty--");
            LockedMe.showMenu();
        }

        System.out.println("Enter the name of file you want to delete (Enter '0' return previous menu) : ");
        String deleteFile = input.nextLine();

        if (deleteFile.equals("0")) {
            LockedMe.managementMenu();
        }

        deleteFile = deleteFile + ".txt";

        File fileToDelete = new File(folderPath,deleteFile);
        if(fileToDelete.exists() && fileToDelete.isFile()) {
            fileToDelete.delete();
            System.out.println("File '" + deleteFile + "' deleted from " + folderPath);
            LockedMe.managementMenu();
        } else {
            System.out.println("File not exist... please try again");
            deleteFile();
        }
    }

    public static void searchFile() throws IOException {

        if(Objects.requireNonNull(folderPath.list()).length == 0) {
            System.out.println("\t--Folder is empty--");
            LockedMe.managementMenu();
        }

        System.out.println("Write the name of file you want to search: ");
        String searchValue = input.nextLine();
        searchValue = searchValue + ".txt";

//        File[] fileName = folderPath.listFiles();

        String[] fileName = folderPath.list();

        for(String name: fileName) {
            if(searchValue.equals(name)) {
                System.out.println("File [" + searchValue + "] found at location " + folderPath);
                LockedMe.managementMenu();

            } else {
                System.out.println("File not Found");
                LockedMe.managementMenu();
            }
        }

    }

    public static void closeApp() {
        System.out.println("Thank you for using our app");
        System.exit(1);
    }

}
