package main;

import controller.Controller;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 0;

        do {
            option = showMenu();
            System.out.println(Controller.processFunction(option));
        } while (option !=3 );

    }

    private static int showMenu() {

        System.out.println("Creación de unidades del ejercito");
        System.out.println("Seleccione una opción");
        System.out.println("1. Lanzar el dado");
        System.out.println("2. Mostrar ejercito actual");
        System.out.println("3. Salir");

        return scan.nextInt();
    }
}
