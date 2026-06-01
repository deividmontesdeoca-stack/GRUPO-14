public class MultiplesCatch {

    public static void main(String[] args) {

        try {

            String texto = null;

            int numero = Integer.parseInt(texto);

            System.out.println(numero);

        } catch (NumberFormatException e) {

            System.out.println("Formato de número incorrecto");

        } catch (NullPointerException e) {

            System.out.println("La variable es nula");

        } catch (Exception e) {

            System.out.println("Error general");

        }

    }

}