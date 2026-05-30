import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//Importamos.

public class LectorArchivo {
    public static void main(String[] args) {
        leerArchivo(); //Para poder mostrar en esta misma clase.
    }


        public static void leerArchivo () {

            try {
                File archivo = new File("datos.txt");
                 Scanner sc = new Scanner(archivo); // creamos un scanner que puede leer un archivo.

                while (sc.hasNextLine()) { // Mientras tenga contenido.
                    System.out.println(sc.nextLine()); // se muestra o lee.
                }

                sc.close(); // cierra el scanner

            } catch (FileNotFoundException e) {
                System.out.println("El archivo no existe"); // si da error muestra lo siguinte
            }
        }
    }
