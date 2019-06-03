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
			System.out.println("====공통 기능 시작====");
			joinpoint.proceed();
			System.out.println("====공통 기능 종료====");
		} catch (Throwable e) {
			
		}
	}
	@Before("execution(* com.care.aop_ex02.CoreClass.test())")
	public void beforeAdvice() {
		System.out.println("핵심기능 실행전 실행되는 메소드");
	}
}
/*
Pointcut을 지정할 때 사용하는 표현식으로 Aspectj 문법을 사용한다.

public void 인 모든 get 메소드 포함 매개변수 ( . . ) 0개 이상의 모든 것
 => excution(public void get*(..))
com.care.aop_ex01패키지 & com.care.spring.ex07 하위 패키지에 파라미터가 없는 모든 메소드
 => excution(* com.care.spring.ex07..*.*())
com.care.aop_ex01.CoreClass 안의 모든 메소드
 => excution(* com.care.spring.ex07.CoreClass.*())
com.care.aop_ex01패키지 안의 모든 메소드
 => within(com.care.spring.ex07.*)
com.care.aop_ex01패키지 및 사위 패키지 안에 있는 모든 메소드
 => within(com.care.spring.ex07..*)
com.care.aop_ex01.CoreClass 안의 모든 메소드
 => within(com.care.spring.ex07.CoreClass)
 */