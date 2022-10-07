import java.util.Scanner;

public class EjercicioE {
    public static void main(String[] args) {
        Scanner lc=new Scanner(System.in);
        int test=lc.nextInt();
        while(0<test){
            int numberToads=lc.nextInt();
            int[] w=new int[numberToads];
            int[] l=new int[numberToads];
            int a=0;
            int b=0;
            for(int i=0;i<numberToads;i++){
                w[i] = lc.nextInt();
                if(w[i]==1){
                    a=i;
                }

            }
            for(int i=0;i<numberToads;i++){
                l[i]=lc.nextInt();
            }
            for(int i=2;i<=numberToads;i++){
                for (int j=0;j<numberToads;j++){
                    if(w[j]==i){
                        if(j>a){
                            a=j;
                        }else{
                            b=b+((a-j)/l[j])+1;
                            a=j+(((a-j)/l[j])+1)*l[j];
                        }
                    }
                }
            }
            System.out.println(b);
            test--;
        }
    }
}
