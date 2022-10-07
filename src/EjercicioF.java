import java.util.Scanner;
public class EjercicioF {
    public static Scanner lc = new Scanner(System.in);
    public static void main(String [] args){
        int test = lc.nextInt();
        for (int m = 0; m < test; m++) {
          int numberH = lc.nextInt();
          int [] horses = new int[numberH];
            for (int i = 0; i < horses.length; i++) {
                horses[i]= lc.nextInt();
            }
            sortIntBubble(horses);
            System.out.println(miniumDiv(horses));
        }
    }
    public static int miniumDiv(int [] array){
        int minimum = array[1]-array[0];
        for (int i = 2; i < array.length-1; i++) {
            if (array[i + 1] - array[i] < minimum)
                minimum = array[i + 1] - array[i];
        }
        return minimum;
    }
    private static void sortIntBubble(int [] array){
        for(int i = 0 ; i < array.length ; i++) {
            for (int j = 1; j < array.length-i; j++) {
                if(array[j] < array[j-1]){
                    int anterior = array[j-1];
                    int actual = array[j];
                    array[j] = anterior;
                    array[j-1] = actual;
                }
            }
        }
    }
}
