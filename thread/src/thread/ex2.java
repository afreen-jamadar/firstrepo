package thread;

public class ex2 extends Thread {
	ex2()
	{
		super("my extending thread");
		System.out.println("my thread created"+ this);
		start();
	}
	@Override
	public void run() {
		try{
		for(int i=0;i<10;i++)
		{
			System.out.println("printing the count"+i);
				Thread.sleep(1000);
		}}
		catch (InterruptedException e) {
				System.out.println("my thread interrupted");
			}
		System.out.println("my thread run is over");
		}
	}
