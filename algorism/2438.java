import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        String a ="";
        
        for(int i =0; i<N; i++){
            a+="*";
            System.out.println(a);
        }
        in.close();
    }
}
