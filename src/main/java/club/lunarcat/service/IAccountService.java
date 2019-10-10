package club.lunarcat.service;

/**
 * @aothor cds
 * @create 2019/10/10 - 20:04
 */
public interface IAccountService {
	/**
	 * 模拟保存账户
	 */
	void saveAccount();

	/**
	 * 模拟更新账户
	 * @param i
	 */
	void updateAccount(int i);

	/**
	 * 删除账户
	 * @return
	 */
	int  deleteAccount();
}
