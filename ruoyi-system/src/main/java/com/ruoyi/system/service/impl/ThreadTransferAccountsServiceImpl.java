package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ThreadTransferAccountsMapper;
import com.ruoyi.system.domain.ThreadTransferAccounts;
import com.ruoyi.system.service.IThreadTransferAccountsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 并发测试线程安全用户交易测试Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-04-17
 */
@Service
public class ThreadTransferAccountsServiceImpl implements IThreadTransferAccountsService 
{
    @Autowired
    private ThreadTransferAccountsMapper threadTransferAccountsMapper;

    /**
     * 查询并发测试线程安全用户交易测试
     * 
     * @param id 并发测试线程安全用户交易测试ID
     * @return 并发测试线程安全用户交易测试
     */
    @Override
    public ThreadTransferAccounts selectThreadTransferAccountsById(Long id)
    {
        return threadTransferAccountsMapper.selectThreadTransferAccountsById(id);
    }

    /**
     * 查询并发测试线程安全用户交易测试列表
     * 
     * @param threadTransferAccounts 并发测试线程安全用户交易测试
     * @return 并发测试线程安全用户交易测试
     */
    @Override
    public List<ThreadTransferAccounts> selectThreadTransferAccountsList(ThreadTransferAccounts threadTransferAccounts)
    {
        return threadTransferAccountsMapper.selectThreadTransferAccountsList(threadTransferAccounts);
    }

    /**
     * 新增并发测试线程安全用户交易测试
     * 
     * @param threadTransferAccounts 并发测试线程安全用户交易测试
     * @return 结果
     */
    @Override
    public int insertThreadTransferAccounts(ThreadTransferAccounts threadTransferAccounts)
    {
        return threadTransferAccountsMapper.insertThreadTransferAccounts(threadTransferAccounts);
    }

    /**
     * 修改并发测试线程安全用户交易测试
     * 
     * @param threadTransferAccounts 并发测试线程安全用户交易测试
     * @return 结果
     */
    @Override
    public int updateThreadTransferAccounts(ThreadTransferAccounts threadTransferAccounts)
    {
        return threadTransferAccountsMapper.updateThreadTransferAccounts(threadTransferAccounts);
    }

    /**
     * 删除并发测试线程安全用户交易测试对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteThreadTransferAccountsByIds(String ids)
    {
        return threadTransferAccountsMapper.deleteThreadTransferAccountsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除并发测试线程安全用户交易测试信息
     * 
     * @param id 并发测试线程安全用户交易测试ID
     * @return 结果
     */
    @Override
    public int deleteThreadTransferAccountsById(Long id)
    {
        return threadTransferAccountsMapper.deleteThreadTransferAccountsById(id);
    }
}
