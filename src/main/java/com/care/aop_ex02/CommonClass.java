package com.care.aop_ex02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class CommonClass {
	@Around("within(com.care.aop_ex02.*)")
	public void commonAop(ProceedingJoinPoint joinpoint) {
		try {
			System.out.println("====���� ��� ����====");
			joinpoint.proceed();
			System.out.println("====���� ��� ����====");
		} catch (Throwable e) {
			
		}
	}
	@Before("execution(* com.care.aop_ex02.CoreClass.test())")
	public void beforeAdvice() {
		System.out.println("�ٽɱ�� ������ ����Ǵ� �޼ҵ�");
	}
}
/*
Pointcut�� ������ �� ����ϴ� ǥ�������� Aspectj ������ ����Ѵ�.

public void �� ��� get �޼ҵ� ���� �Ű����� ( . . ) 0�� �̻��� ��� ��
 => excution(public void get*(..))
com.care.aop_ex01��Ű�� & com.care.spring.ex07 ���� ��Ű���� �Ķ���Ͱ� ���� ��� �޼ҵ�
 => excution(* com.care.spring.ex07..*.*())
com.care.aop_ex01.CoreClass ���� ��� �޼ҵ�
 => excution(* com.care.spring.ex07.CoreClass.*())
com.care.aop_ex01��Ű�� ���� ��� �޼ҵ�
 => within(com.care.spring.ex07.*)
com.care.aop_ex01��Ű�� �� ���� ��Ű�� �ȿ� �ִ� ��� �޼ҵ�
 => within(com.care.spring.ex07..*)
com.care.aop_ex01.CoreClass ���� ��� �޼ҵ�
 => within(com.care.spring.ex07.CoreClass)
 */