package com.care.aop_ex01;

public class CoreClass {
	public void corePrint() {
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(100);
				System.out.println("�ٽ� ��� ����!!!");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
