
package by.academy.java.maskevich.classwork.lesson041;

public class ����������� {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 3, 4, 5 };
		printWithfor(a);
		printWithforeach(a);

	}
	// ���� ����� ������
	private static void printWithfor(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int j = a[i];
			System.out.println(j);
		}
	}
// ����������� �� �������  �� �������
	private static void printWithforeach(int[] a) {
		for (int j : a) {
			System.out.println(j);
		}

	}

}

