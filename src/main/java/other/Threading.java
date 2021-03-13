package other;

public class Threading {

	public static void main(final String[] args) {
	
		Runnable r0;
		
		final Runnable r1;

		r0 = new FirstThread();

		Thread t0;
		final Thread t1;

		t0 = new Thread(r0);

		r1 = new SecondThread(t0); // Passing the 1st Thread instance to 2nd
									// class to make the second thread wait

		t1 = new Thread(r1);

		t0.start();
		t1.start();
		System.out.println("Example5 : END");// this line can displayed earlier
	}}
 class FirstThread implements Runnable {

	public void run() {
		System.out.println("In First Thread : START");
		int counter = 0;
		while (counter < 6) {
			System.out.println(counter++);
		}
		try {
			Thread.sleep(5000);
			System.out.println("We can take rest before starting Second thread");
		} catch (final InterruptedException e) {
			e.printStackTrace();
			System.out.println("In exception First Thread");
		}

		System.out.println("First Thread : END");

	}

}
 
  class SecondThread implements Runnable {

		private final Thread ts;

		public SecondThread(final Thread t0) {
			this.ts = t0;
		}

		public void run() {
			System.out.println(" In Second Thread : START");
			System.out.println(" Second thread is waiting for 1st thread to terminate");
			/*
			 * The above two lines can run before First Thread stops, but the code
			 * below join() will be processed after 1st thread stops executing
			 */

			try {
				ts.join(); // only when 1st thread will complete, second thread will
							// start processing
				int count = 102;
				while (count < 105) {
					System.out.println(count);
					count++;
				}
				System.out.println("After Join in Second Thread");

			} catch (final InterruptedException e) {
				e.printStackTrace();
				System.err.println("In Exception Second Thread");
			}
			System.out.println(" Second Thread : END");

		}
	}