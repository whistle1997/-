package day21;
//��վ��Ʊ������4�����ڣ�100��Ʊ����Ʊ����Ӱ��

class Ticket implements Runnable{
	private int ticket = 100 ;//��ʼƱ��100��
	private Object obj = new Object();
	public void run(){
		//ticket�ǹ�����Դ���������ͬ�������������ظ���ȡ�����󣬳�������
		while(true){
			synchronized (obj) {
				/*if(ticket > 0){
					System.out.println(Thread.currentThread().getName() + "ʣ��Ʊ��:" + ticket);
					ticket-- ;
					//����ͨ��synchronize���η�������
				}*/
				use();
			}
			
		}
	}
	
	public synchronized void use(){
		if(ticket > 0){
			System.out.println(Thread.currentThread().getName() + "ʣ��Ʊ��:" + ticket);
			ticket-- ;
		}
	}
}

public class Demo06 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket t = new Ticket() ;
		Thread t1 = new Thread(t); 
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
