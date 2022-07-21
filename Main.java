package Bienvenido_Progra;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingresa tu nombre");
        String nom = scanner.nextLine();

        System.out.println("Bienvenida(o) a Programacion 2022 "+ nom);
    }
}
