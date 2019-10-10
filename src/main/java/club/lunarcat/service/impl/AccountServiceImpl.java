package club.lunarcat.service.impl;

import club.lunarcat.service.IAccountService;
import org.springframework.stereotype.Service;

/**
 * @aothor cds
 * @create 2019/10/10 - 20:05
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {
	@Override
	public void saveAccount() {
		// 测试异常通知
//		int i = 1 / 0;
		System.out.println("执行了保存");
	}

	@Override
	public void updateAccount(int i) {
		System.out.println("执行了更新"+i);

	}

	@Override
	public int deleteAccount() {
		System.out.println("执行了删除");
		return 0;
	}
}
