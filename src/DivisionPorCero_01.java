public class DivisionPorCero_01 {
    public static void main(String[] args) {

        try {
            int dividendo = 10;
            int divisor = 0;

            int cuenta = dividendo / divisor;

            System.out.println("Resultado de la división: " + cuenta);

        } catch (ArithmeticException errorMatematico) {
            System.out.println("No es posible dividir entre cero. Ingrese un número válido.");

        } finally {
            System.out.println("Proceso de división terminado.");

        }

    }
}
