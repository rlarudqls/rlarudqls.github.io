import java.util.Scanner;

public class plus999 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("0~999 ������ ���� �Է� : ");
        String input = in.nextLine();
        int sum=0;
        for (int i = 0; i<input.length(); i++) {
            sum += Integer.parseInt(input.substring(i, i+1));
        }
        System.out.print("Ű����κ��� 0���� 999 ������ ������ 1�� �Է� �޾� �� �ڸ����� ���� ���= " + sum);
    }
}

