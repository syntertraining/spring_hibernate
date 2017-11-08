package com.mypkg.spring.aspect;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class EmployeeAnnotationAspect {
	@Before("@annotation(com.mypkg.spring.aspect.Loggable)")
	public void myAdvice(){
		System.out.println("Executing my Advice");
	}
}
