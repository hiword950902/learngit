package com.enuedu.fanxing;

public class Thread1 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		 for(int i=1;i<=20;i++) {
			 System.out.println("����"+i);
			 try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		 }
	}
}