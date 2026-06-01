public class Cajero {

    public static void retirar(double saldo, double monto) throws Exception {

        if (monto > saldo) {
            throw new Exception("Saldo insuficiente");
        }

        System.out.println("Retiro realizado");
    }

    public static void main(String[] args) {

        try {

            retirar(1000, 1500);

        } catch (Exception e) {

            System.out.println(e.getMessage());

        } finally {

            System.out.println("Operación finalizada");

        }

    }

}