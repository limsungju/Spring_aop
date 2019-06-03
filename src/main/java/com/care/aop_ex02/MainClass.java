package com.care.aop_ex02;

import org.springframework.context.support.GenericXmlApplicationContext;

/*
 공통기능 실행 시기를 결정
 <aop:before> : 메소드 실행 전에 advice실행
 <aop:after-returnning> : 정상적으로 메소드 실행 후에 advice 실행
 <aop:after-throwing> : 메소드 실행중 exception 발생시 advice 실행
 <aop:after> : 메소드 실행중 exception 이 발생하여도 advice 실행
<aop:around> : 메소드 실행 전/후 및 exception 발생 시 advice실행
보편적으로 많이 사용되는 것이 before, around 사용됨  
 */

public class MainClass {
	public static void main(String[] args) {
		String path = "classpath:applicationAOP_02.xml";
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext(path);
		CoreClass core = ctx.getBean("core",CoreClass.class);
		
		System.out.println("main start!!!!");
		core.corePrint();
		core.corePrint02();
		core.test();
		System.out.println("main end!!!!");
		ctx.close();
	}
}
