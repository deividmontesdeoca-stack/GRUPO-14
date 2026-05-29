import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LectorArchivo {
    public static void main(String[] args) {
        leerArchivo();
    }


        public static void leerArchivo () {

            try {
                File archivo = new File("datos.txt");
                Scanner sc = new Scanner(archivo);

                while (sc.hasNextLine()) {
                    System.out.println(sc.nextLine());
                }

                sc.close();

            } catch (FileNotFoundException e) {
                System.out.println("El archivo no existe");
            }
        }
    }
