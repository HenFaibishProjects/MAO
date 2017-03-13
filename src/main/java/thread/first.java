package thread;

public class first extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(i);
		}
	}

	
	
	public class Demo
	{
	public void main(String[] args) {
		first f = new first();
		f.start();
	}

	
	
	}}			

