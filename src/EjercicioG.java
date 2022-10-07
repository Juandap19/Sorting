import java.util.Arrays;
import java.util.Scanner;

public class EjercicioG{
    public static Scanner lc = new Scanner(System.in);
    public static void main(String [] args){
        int numberTest = lc.nextInt();
        for (int m = 0; m < numberTest; m++){
            int barrelsNumber = lc.nextInt();
            long timesWater = lc.nextInt();
            long [] justBarrels = new long[barrelsNumber];
            for (int i = 0; i < barrelsNumber; i++) {
                justBarrels[i]= lc.nextInt();
            }
            Arrays.sort(justBarrels);
            long total = justBarrels[justBarrels.length-1];
            long counter2 = 0;
            for (int i = 2; counter2 != timesWater && i <= justBarrels.length ; i++) {
                if (justBarrels[justBarrels.length-i]<0)        //Lo intente arreglar multiplicando el interior por -1 pero de igual forma sigue dando  un numero negativo
                    total = total + (justBarrels[justBarrels.length-i]*-1);
                else
                    total = total+ justBarrels[justBarrels.length-i];
                counter2++;
            }
            System.out.println(total);
        }
    }
}