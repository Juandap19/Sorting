
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class EjercicioA {
    public static Scanner lc = new Scanner(System.in);
    public static void main(String [] args){
        String linea = lc.nextLine();
        String [] cadena = linea.split("\\+");
        int [] array = new int[cadena.length];
        for (int i = 0; i < cadena.length; i++) {
         array[i] = parseInt(cadena[i]);
        }
        for (int rojo = 1; rojo < array.length; rojo++) {
            int valorRojo = array[rojo];
            int verde = rojo-1;
            int valorVerde = array[verde];
            while ( verde > -1 && valorVerde > valorRojo ) {
                valorVerde = array[verde];
                array[verde+1] = valorVerde;
                verde--;
            }
            array[verde+1] = valorRojo;
        }

        for (int i = 0; i < array.length && i != array.length-1; i++) {
            System.out.print(array[i]+"+");
        }
        System.out.print(array[array.length-1]);


    }
}
