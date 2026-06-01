public class ConvertirNumero {
    public static void main(String[] args) {

        try {
            String texto = "abc";
            int numero = Integer.parseInt(texto);

            System.out.println(numero);

        } catch (NumberFormatException e) {
            System.out.println("El texto no puede convertirse a número.");
        }

    }
}