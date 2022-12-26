package kkb_study;

public class Comparative {
	 
    public static void main(String[] args) {
        
        int[] d = {10,9,8,7,6,5,4, 3, 2, 1};
        int N = 10 ;
        int left = 0;
        int right = N - 1;
       
        int i=0; 
        int shift =0; 
        int buf =0; 
       
        while(!(left>=right)){ 
            i = left; 
            while(!(i >= right))
            {
                if(d[i] > d[i+1]) 
                {
                    buf = d[i];
                    d[i] = d[i+1];
                    d[i+1] = buf;
                    shift =i;
                }else{                 
                    i = i + 1;                 
                }              
            }
            right = shift;
            i = right;
           
            while(!(i <= left))
            {
                if(d[i-1] > d[i]) 
                {
                    buf = d[i-1];
                    d[i-1] = d[i];
                    d[i] = buf;
                    shift =i;
                }else{                 
                    i = i - 1;             
                }              
            }
            left = shift; 
        }
      
        System.out.print("정렬데이터 : ");
        for (int j = 0; j< d.length;j++){
            System.out.print(d[j]+" ");
        }
    }
 }