import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N =in.nextInt(); int X=in.nextInt();
            int[] array = new int[N];
        for(int i=0;i<N;i++){
            array[i] = in.nextInt();
        }
        for(int i=0;i<array.length;i++){
            if(array[i]<X){
        
        System.out.print(array[i]+" ");
        }
    }
}}
