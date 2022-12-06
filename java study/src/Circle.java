interface Printable {
	void print();
}
interface Drawable {
	void draw();
}
public class Circle implements Printable, Drawable {
	public void print() {
		System.out.println("�����ͷ� ���� ����մϴ�.");
	}
	public void draw() {
		System.out.println("ȭ�鿡 ���� �׸��ϴ�.");
	}
	public static void main(String[] args) {
		Circle obj = new Circle();
		obj.print();
		obj.draw();
	}
}