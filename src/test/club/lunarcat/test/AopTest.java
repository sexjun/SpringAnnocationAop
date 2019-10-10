package club.lunarcat.test;

import club.lunarcat.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @aothor cds
 * @create 2019/10/10 - 20:10
 */
public class AopTest {


	public static void main(String[] args) {
		//1. 获取容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		//2. 获取对象
		IAccountService accountService = (IAccountService) applicationContext.getBean("accountService");
		// 3.执行方法
		accountService.saveAccount();
	}
}
