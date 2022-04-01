package com.simplilearn.project;
import com.simplilearn.project.FileManager;
import java.io.IOException;
import java.util.Scanner;
/*
    ==========================================
        Title:  LockedMe.com site
        Author: Anas Al-Mughamsi
        Date:   1 Oct 2021
    ==========================================
 */
public class LockedMe {

    private static Scanner input;

    public static void main(String[] args) throws IOException {
        welcomeMenu();
        showMenu();
    }

    public static void welcomeMenu() {

        System.out.println("-------------------------------------");
        System.out.println("Welcome to LockedMe.com site");
        System.out.println("-------------------------------------");

        System.out.println("\n\n\t\t****************************************");
        System.out.println("\t\tWelcome the main menu of LockedMe.com");
        System.out.println("\t\t****************************************");
        System.out.println("\t\t--Develop by Anas Al-Mughamsi--");

    }

    public static void showMenu() throws IOException {


        System.out.println("\nSelect one of these options below: - ");
        System.out.println("1. Show all files");
        System.out.println("2. File Managements");
        System.out.println("3. Exit");

        input = new Scanner(System.in);
        int selection = input.nextInt();

        switch (selection) {
            case 1: FileManager.showAllFiles();
                break;
            case 2: managementMenu();
                break;
            case 3: FileManager.closeApp();
                break;
            default:
                System.out.println("INVALID OPTION!!\nPlease try again");
                showMenu();
        }
    }

    public static void managementMenu() throws IOException {
        System.out.println("1. Add a file.");
        System.out.println("2. Delete a file.");
        System.out.println("3. Search a file.");
        System.out.println("4. Return to main menu.");
        System.out.println("5. Exit");

        input = new Scanner(System.in);
        int selection = input.nextInt();

        switch (selection) {
            case 1: FileManager.addFile();
                break;
            case 2: FileManager.deleteFile();
                break;
            case 3: FileManager.searchFile();
                break;
            case 4: showMenu();
                break;
            case 5: FileManager.closeApp();
                break;
            default:
                System.out.println("INVALID OPTION!!\nPlease try again\n");
                managementMenu();
        }
    }
}
