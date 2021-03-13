package arrays_string;

public class Test {
	//10000
	//1000
	public int i=0;
	public static void main(String...a) {
		
		int numOfThread = 10000/1000;
		Test t=new Test();
		for(int i=0;i<numOfThread;i++) {
			Batch1 batch=new Batch1(t);
			batch.start();
		}
		
		
	}

}
class Batch1 extends Thread{
	Test t;
	Batch1(Test  i){
		this.t=i;
	}
	public void run() {
		t.i++;
		System.out.println("value ="+t.i+" thead ="+Thread.currentThread().getName());
		
	}

}
