package by.academy.java.maskevich.classwork.lesson08;

public class Test {
	private int i;

	public static void main(String[] args) {
		Test o1 = new Test(1);
		Test o2 = new Test(2);

	}
	

	public Test(int i) {
		this.i = i;
		System.out.println("�����������" + i);
	}

	{
		System.out.println("���� ������������� �������" + i);
	}
	static {
		System.out.println("����������� ���� ������������� �������" );
	}
}
