package thread;

public class mythread extends Thread {
	public mythread(String name)
	{
		super();
	}
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println("from"+getName());
		}
	}

}


