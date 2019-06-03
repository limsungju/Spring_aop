package com.care.aop_ex01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class CommonClass {
	public void commonAop(ProceedingJoinPoint joinpoint) {
		System.out.println("������ ��� ���μ��� : " +
				joinpoint.getSignature().toShortString());
		try {
			System.out.println("====���� ��� ����====");
			joinpoint.proceed();
			System.out.println("====���� ��� ����====");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("beforeAdvice()�ٽ� ��� �� ����");
	}
}
