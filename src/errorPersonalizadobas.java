public class errorPersonalizadobas {
    public static void main(String[] args) {
        try {
            Edad(19);
        } catch (edadInvalida e) {
            System.out.println(e.getMessage());
        }
    }

    public static void Edad(int edad) throws edadInvalida{
        if(edad <=18){
          throw new edadInvalida("Edad invalida");
        }
        System.out.println("Valida");
    }
}
