public class prime_number_between2and100{
	public static void main(String[] args) {
		
		System.out.print("2���� 100������ ��� �Ҽ�: ");

		for (int a = 2; a <= 100; a++) {
			for (int b = 2; b <= 100; b++) {
				if (a != b && a % b == 0) {
					break; 
				
                } if (a == b) {
					System.out.print(a + " ");
				}	
			}
		}
	}
}