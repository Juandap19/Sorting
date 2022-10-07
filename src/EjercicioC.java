import java.util.Scanner;

public class EjercicioC {
    public static Scanner lc = new Scanner(System.in);
    public static void main(String [] args){
        String p = lc.nextLine();
        String s = lc.nextLine();
        String t = p+s;
        String cuarta = lc.nextLine();
        Character [] array1 = new Character[t.length()];
        Character [] array2 = new Character [cuarta.length()];
        String answer = "";
        fillArray(array1,t);
        fillArray(array2,cuarta);
        if(array1.length == array2.length){
            sort(array1);
            sort(array2);
            for (int i = 0; i < array1.length && answer != "NO"; i++) {
                if (array1[i]==array2[i]){
                    answer = "YES";
                }else{
                    answer = "NO";
                }
            }
            System.out.println(answer);
        }else{
            System.out.println("NO");
        }

    }
    public static void sort(Character [] array ){
        for(int rojo = 0 ; rojo < array.length-1 ; rojo++) {
            for (int azul = rojo+1; azul < array.length; azul++) {
                if (array[rojo] > array[azul]) {
                    // get values to swap
                    char valorRojo = array[rojo];
                    char valorAzul = array[azul];
                    // swap
                    array[rojo] = valorAzul;
                    array[azul] = valorRojo;
                }
            }
        }
    }

    public static void fillArray(Character[] array1,String cadena1){
        for (int i = 0; i < array1.length; i++) {
            array1[i]=cadena1.charAt(i);
        }
    }
}
