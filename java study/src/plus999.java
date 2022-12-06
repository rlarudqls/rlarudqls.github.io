import java.util.Scanner;

public class plus999 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("0~999 사이의 숫자 입력 : ");
        String input = in.nextLine();
        int sum=0;
        for (int i = 0; i<input.length(); i++) {
            sum += Integer.parseInt(input.substring(i, i+1));
        }
        System.out.print("키보드로부터 0에서 999 사이의 정수를 1개 입력 받아 각 자릿수를 더한 결과= " + sum);
    }
}

