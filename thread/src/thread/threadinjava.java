package thread;

public class threadinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mythread t=new mythread("thread1");
		t.setPriority(5);
		t.start();
		mythread t1=new mythread("thread2");
		t1.setPriority(7);
		t1.start();
		
		System.out.println(t.getPriority());
		System.out.println(t1.getPriority());
	}

}
