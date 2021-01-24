package by.academy.java.maskevich.classwork.threads;

public class Program {

	public static void main(String[] args) {

		Store store = new Store();
		Producer1 producer = new Producer1(store);
		Consumer1 consumer = new Consumer1(store);
		new Thread(producer).start();
		new Thread(consumer).start();
	}
}

// ����� �������, �������� ������������� ������
class Store {
	private int product = 0;

	public synchronized void get() {
		while (product < 1) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		product--;
		System.out.println("���������� ����� 1 �����");
		System.out.println("������� �� ������: " + product);
		notify();
	}

	public synchronized void put() {
		while (product >= 1) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		product++;
		System.out.println("������������� ������� 1 �����");
		System.out.println("������� �� ������: " + product);
		notify();
	}
}

// ����� �������������
class Producer1 implements Runnable {

	Store store;

	Producer1(Store store) {
		this.store = store;
	}

	public void run() {
		for (int i = 1; i < 6; i++) {
			store.put();
		}
	}
}

// ����� �����������
class Consumer1 implements Runnable {

	Store store;

	Consumer1(Store store) {
		this.store = store;
	}

	public void run() {
		for (int i = 1; i < 6; i++) {
			store.get();
		}
	}
}