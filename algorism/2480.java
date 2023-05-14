import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        
        in.close();
        
        if(a!=b && a!=c && b!=c) { 
            
            int larNum;
            
            if(a>b){
                if(c>a){
                    larNum=c;
                }
                else{
                    larNum = a;
                }
            }
            else {
                if(c>b){
                    larNum=c;
                }
                else {
                    larNum=b;
                }
                    }System.out.println(larNum * 100);
                }
        
           if(a==b &&b==c) System.out.println(10000+a*1000);
        if(a==b && a!=c && b!=c) System.out.println(1000+a*100);
        if(a==c && a!=b && b!=c) System.out.println(1000+a*100);
        if(b==c && b!=a && c!=a) System.out.println(1000+b*100);
    }}
