package thread;

public class ex1 extends Thread{
	@Override
	public void run() {
		System.out.println("my thread is in running state");
	}
	public static void main(String[] args) {
		ex1 e=new ex1();
		e.start();

	}

}
