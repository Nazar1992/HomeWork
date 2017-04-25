package core_lesson_18;

import java.util.Scanner;

public class RunnableThread implements Runnable {

	public static void main(String[] args) {

		RunnableThread runnableThread = new RunnableThread();
		Thread thread = new Thread(runnableThread);
		thread.start();

	}

	@Override
	public void run() {

		Scanner sc = new Scanner(System.in);
		String stringNumber;
		int count;

		System.out.print("������ ������� ����� Գ�������: ");
		count = sc.nextInt();

		// ��������� ����� ����� � ������ ����� � ��������� � ����������
		System.out.println("ʳ������ ����� Գ�������: " + count);

		long[] fibonacciArrray = fibonacciArrray(count);
		
		System.out.print("���� Runnable: ");
		for (int i = fibonacciArrray.length - 1; i > 0; i--) {
			
			System.out.print(fibonacciArrray[i] + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public long[] fibonacciArrray(int count) {

		long[] fibonacciArrray = new long[count + 1];
		for (int i = 0; i <= count; i++) {
			fibonacciArrray[i] = fibonacci(i);
		}
		return fibonacciArrray;
	}

	public long fibonacci(int n) {
		if (n <= 1)
			return n;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
