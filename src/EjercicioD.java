import java.util.Scanner;

public class EjercicioD {
    public static void main(String[] args) {
        Scanner lc = new Scanner(System.in);
        int sumaBoy = 0;
        int sumaChef = 0;
        int test = lc.nextInt();

        for (int i = 0; i < test; i++) {
            int n = lc.nextInt();
            int k = lc.nextInt();
            if (k > n-k){
                k = n-k;
            }

            int[] pesoProductoN = new int[n];
            for (int j = 0; j < pesoProductoN.length; j++) {
                pesoProductoN[j] = lc.nextInt();
            }

            for (int j = 0; j < pesoProductoN.length; j++) {
                for (int l = 1; l < pesoProductoN.length - j; l++) {
                    if (pesoProductoN[l - 1] >= pesoProductoN[l]) {
                        int anterior = pesoProductoN[l - 1];
                        int actual = pesoProductoN[l];
                        pesoProductoN[l] = anterior;
                        pesoProductoN[l - 1] = actual;
                    }
                }
            }

            for (int j = k; j < pesoProductoN.length; j++) {
                sumaChef += pesoProductoN[j];
            }
            for (int j = 0; j < k; j++) {
                sumaBoy += pesoProductoN[j];
            }

            System.out.println(sumaChef - sumaBoy);
            sumaChef = 0;
            sumaBoy = 0;
        }
    }
}
