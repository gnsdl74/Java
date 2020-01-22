package edu.java.thread03;

class MyRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("쓰레드!");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	} // end run()
} // end MyRunnable

public class ThreadMain03 {

	public static void main(String[] args) {
		// 1. 클래스 인스턴스 생성하여 쓰레드 start()
		Thread th1 = new Thread(new MyRunnable());
		th1.start();

		// 2. 익명 클래스를 사용하여 쓰레드 start();
		Thread th2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("익명");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			} // end run()
		}); // end Anonymous Class
		th2.start();

		// 3. 람다 표현식을 사용하여 쓰레드 start();
		new Thread(() -> {

			for (int i = 0; i < 100; i++) {
				System.out.println("람다");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start(); // end Lambda Expression
		// 다른 곳에서 사용하지 않고 여기서만 사용한다면 위의 코드처럼 줄여쓰기도 가능

	} // end main()

} // end ThreadMina03
