package club.lunarcat.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 用于记录日志的工具类，它里面提供了公共的代码
 * @aothor cds
 * @create 2019/10/10 - 20:08
 */
@Component("logger")
@Aspect // 表示当前类是切面类
public class Logger {

	/**
	 * 配置
	 */
	@Pointcut("execution(* club.lunarcat.service.impl.*.*())")
	private void pointcut(){}

	/**
	 * 前置通知
	 */
	@Before("pointcut()")
	public  void beforePrintLog(){
		System.out.println("前置通知---通过xml配置");
	}

	/**
	 * 后置通知
	 */
	@AfterReturning("pointcut()")
	public  void afterReturningPrintLog(){
		System.out.println("后置通知---通过xml配置");
	}
	/**
	 * 异常通知
	 */
	@AfterThrowing("pointcut()")
	public  void afterThrowingPrintLog(){
		System.out.println("异常通知---通过xml配置");
	}

	/**
	 * 最终通知
	 */
	@After("pointcut()")
	public  void afterPrintLog(){
		System.out.println("最终通知---通过xml配置");
	}


	@Around("pointcut()")
	public Object arountPrintLog(ProceedingJoinPoint proceedingJoinPoint){
		Object returnValue = null;
		// ctrl + alt + t 加入try-catch 快捷键
		try {
			// 得到方法执行需要的参数
			Object[] args = proceedingJoinPoint.getArgs();

			System.out.println("前置通知");

			// 明确调用切入点方法（业务层方法）
			returnValue = proceedingJoinPoint.proceed();

			System.out.println("后置通知");

			return returnValue;
		} catch (Throwable throwable) {
			System.out.println("异常通知");
			throwable.printStackTrace();
		} finally {
			System.out.println("最终通知");
		}
		return returnValue;

	}
}
