package thread;

public class extendingthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex2 e=new ex2();
		while(e.isAlive())
		{
			System.out.println("main thread will be alive till child thread is alive");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				System.out.println("main thread interrupted");
			}
		}
		System.out.println("main thread run is over");
	}
}
