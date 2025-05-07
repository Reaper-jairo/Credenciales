package rut;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Rut {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre = "";
        String cargo = "";
        String rut = "";

        System.out.println("Sistema de Creacion de Rut");

        while (true) {
            System.out.print("Por favor, ingrese su  nombre: ");
            nombre = scanner.nextLine().trim();
            if (!nombre.isEmpty()) break;
            System.out.println("El nombre no puede estar vacío.");
        }

        while (true) {
            System.out.print("Ingrese el cargo del asistente: ");
            cargo = scanner.nextLine().trim();
            if (!cargo.isEmpty()) break;
            System.out.println("El cargo no puede estar vacío.");
        }


        while (true) {
            System.out.print("Ingrese el RUT del asistente (formato 12345678-k): ");
            rut = scanner.nextLine().trim();
            if (validarRUT(rut)) break;
            System.out.println("RUT inválido. Debe tener el formato correcto.");
        }

        System.out.println("Creacion de Rut Creado");
        System.out.println("Nombre : " + nombre);
        System.out.println("Cargo  : " + cargo);
        System.out.println("RUT    : " + rut);
        System.out.println("---------------------------");

        scanner.close();
    }

    private static boolean validarRUT(String rut) {
        return Pattern.matches("^\\d{7,8}-[\\dkK]$", rut);
    }
}
