import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] array = new int[N];
            int count=0;
        
        for(int i=0;i<N; i++){
            array[i]=in.nextInt();
        }
        int v = in.nextInt();
        for(int i =0;i<array.length;i++){
            if(v==array[i]){
                count++;
            }
        }
            System.out.println(count);
    }
}
