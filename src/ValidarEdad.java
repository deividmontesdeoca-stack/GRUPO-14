import java.util.Scanner;

public class ValidarEdad {

    public static void validarEdad(int edad) throws IllegalArgumentException {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese su edad: ");
            int edad = sc.nextInt();

            validarEdad(edad);

            System.out.println("La edad " + edad + " es válida");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}