package hello;

import java.util.Scanner;

public class Pizza {
		public static void main(String[] ar) {
		boolean notsosu = false;
		
		for(int x = 2; x <= 100; x++) {
			for(int y = 2; y < x; y++) {
				if(x%y == 0) { // �Ҽ�x
					notsosu = true;
					break;
				}
			}
			
			if(notsosu == false) {
				///"2���� 100���� ��� �Ҽ� : " 
				System.out.print( x + " ");
			}
			notsosu = false;
		
		}
	}
}