package thread_test_0703;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class thread_test_0703 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable task1 = () -> { // 20 미만 짝수 출력
			try {
				for (int i = 0; i < 20; i++) {
					if (i % 2 == 0)
						System.out.print(i + " ");
					Thread.sleep(100*i); // 0.5초간 잠을 잔다.
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		Runnable task2 = () -> { // 20 미만 홀수 출력
			try {
				for (int i = 0; i < 20; i++) {
					if (i % 2 == 1)
						System.out.print(i + " ");
					Thread.sleep(100*i); // 0.5초간 잠을 잔다.
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		t1.start();
		t2.start();
		
		Runnable task11 = () -> {
		      String name = Thread.currentThread().getName();
		      System.out.println(name + ": " + (5 + 7));
		   };
		   Runnable task21 = () -> {
		      String name = Thread.currentThread().getName();
		      System.out.println(name + ": " + (7 - 5));
		   };
		   
		   ExecutorService exr = Executors.newFixedThreadPool(2);
		   exr.submit(task11);
		   exr.submit(task21);
		   exr.submit(() -> {
		      String name = Thread.currentThread().getName();
		      System.out.println(name + ": " + (5 * 7));
		   });
		      
		   exr.shutdown();
	}
}
