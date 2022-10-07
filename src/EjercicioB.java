import java.util.Scanner;
public class EjercicioB {
    public static Scanner lc = new Scanner(System.in);
    public static void main(String [] args){
        int n = lc.nextInt();
        lc.nextLine();
        int [] array = new int [n];
        for (int i = 0; i < array.length; i++) {
            array[i]=lc.nextInt();
        }
        int parejas = 0;
        int contar = 0;
        int mismoTiempoCall = 0;
        for (int i = 0; i < array.length && mismoTiempoCall !=2; i++) {
            mismoTiempoCall = 0;
            for (int j = i+1; j < array.length && mismoTiempoCall != 2; j++) {
                if ((contar+1)%2 == 0 && contar != 0 ) {
                    contar = 0;
                    parejas++;

                } if (array[i]==array[j] && array[i]!= 0 ){
                    contar ++;
                    mismoTiempoCall++;
                }
            }
        }
        if (array.length == 2){
            if (array[0]==array[1]){
                parejas= 1;
            }
        }
        if (mismoTiempoCall >= 2){
            System.out.println(-1);
        }else {
            System.out.println(parejas);
        }


    }
}
