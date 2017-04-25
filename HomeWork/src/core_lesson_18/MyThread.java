package core_lesson_18;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class MyThread extends Thread {

	@Override
	public void run() {

		Scanner sc = new Scanner(System.in);
		String stringNumber;
		int number;

		System.out.print("Введіть кількість чисел Фібоначчі: ");
		number = sc.nextInt();

		// считывает целое число с потока ввода и сохраняем в переменную
		System.out.println("Кількість чисел Фібаначчі: " + number);
		System.out.print("Потік Thread: ");
		for (int i = 1; i <= number; i++) {
			System.out.print(fibonacci(i) + " ");
			try {
				this.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

	public long fibonacci(int n) {
		if (n <= 1)
			return n;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {

		MyThread myThread = new MyThread();
		myThread.start();

	}

}
