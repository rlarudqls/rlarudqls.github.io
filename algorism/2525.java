import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
 
        int A = in.nextInt();
        int B = in.nextInt();
 
        int C = in.nextInt();
        in.close();
        
        int min = (A*60+B+C);
        
        int hour = ((min/60)%24);
        int minute = min%60;
        System.out.println(hour+" "+minute);
    }}
        
