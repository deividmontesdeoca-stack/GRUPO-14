public class ErrorPersonalizado {
    public static void main(String[] args) {
        try {
            Edad(19);
        } catch (EdadInvalida e) {
            System.out.println(e.getMessage());
        }
    }

    public static void Edad(int edad) throws EdadInvalida {
        if(edad <=18){
          throw new EdadInvalida("Edad invalida");
        }
        System.out.println("Valida");
    }
}
