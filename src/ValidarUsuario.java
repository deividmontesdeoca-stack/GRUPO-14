public class Login {

    public static void validarUsuario(String usuario) throws Exception {

        if (!usuario.equals("admin")) {
            throw new Exception("Usuario no autorizado");
        }

    }

    public static void main(String[] args) {

        try {

            validarUsuario("juan");

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

}