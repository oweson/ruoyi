package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.ThreadTransferAccounts;

/**
 * 并发测试线程安全用户交易测试Service接口
 * 
 * @author ruoyi
 * @date 2020-04-17
 */
public interface IThreadTransferAccountsService 
{
    /**
     * 查询并发测试线程安全用户交易测试
     * 
     * @param id 并发测试线程安全用户交易测试ID
     * @return 并发测试线程安全用户交易测试
     */
    public ThreadTransferAccounts selectThreadTransferAccountsById(Long id);

    /**
     * 查询并发测试线程安全用户交易测试列表
     * 
     * @param threadTransferAccounts 并发测试线程安全用户交易测试
     * @return 并发测试线程安全用户交易测试集合
     */
    public List<ThreadTransferAccounts> selectThreadTransferAccountsList(ThreadTransferAccounts threadTransferAccounts);

    /**
     * 新增并发测试线程安全用户交易测试
     * 
     * @param threadTransferAccounts 并发测试线程安全用户交易测试
     * @return 结果
     */
    public int insertThreadTransferAccounts(ThreadTransferAccounts threadTransferAccounts);

    /**
     * 修改并发测试线程安全用户交易测试
     * 
     * @param threadTransferAccounts 并发测试线程安全用户交易测试
     * @return 结果
     */
    public int updateThreadTransferAccounts(ThreadTransferAccounts threadTransferAccounts);

    /**
     * 批量删除并发测试线程安全用户交易测试
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteThreadTransferAccountsByIds(String ids);

    /**
     * 删除并发测试线程安全用户交易测试信息
     * 
     * @param id 并发测试线程安全用户交易测试ID
     * @return 结果
     */
    public int deleteThreadTransferAccountsById(Long id);
}
