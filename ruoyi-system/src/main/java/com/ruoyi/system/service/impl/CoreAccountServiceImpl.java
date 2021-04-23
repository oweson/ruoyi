package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CoreAccountMapper;
import com.ruoyi.system.domain.CoreAccount;
import com.ruoyi.system.service.ICoreAccountService;
import com.ruoyi.common.core.text.Convert;

/**
 * 账号管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-23
 */
@Service
public class CoreAccountServiceImpl implements ICoreAccountService 
{
    @Autowired
    private CoreAccountMapper coreAccountMapper;

    /**
     * 查询账号管理
     * 
     * @param id 账号管理ID
     * @return 账号管理
     */
    @Override
    public CoreAccount selectCoreAccountById(Integer id)
    {
        return coreAccountMapper.selectCoreAccountById(id);
    }

    /**
     * 查询账号管理列表
     * 
     * @param coreAccount 账号管理
     * @return 账号管理
     */
    @Override
    public List<CoreAccount> selectCoreAccountList(CoreAccount coreAccount)
    {
        return coreAccountMapper.selectCoreAccountList(coreAccount);
    }

    /**
     * 新增账号管理
     * 
     * @param coreAccount 账号管理
     * @return 结果
     */
    @Override
    public int insertCoreAccount(CoreAccount coreAccount)
    {
        coreAccount.setCreateTime(DateUtils.getNowDate());
        return coreAccountMapper.insertCoreAccount(coreAccount);
    }

    /**
     * 修改账号管理
     * 
     * @param coreAccount 账号管理
     * @return 结果
     */
    @Override
    public int updateCoreAccount(CoreAccount coreAccount)
    {
        coreAccount.setUpdateTime(DateUtils.getNowDate());
        return coreAccountMapper.updateCoreAccount(coreAccount);
    }

    /**
     * 删除账号管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCoreAccountByIds(String ids)
    {
        return coreAccountMapper.deleteCoreAccountByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除账号管理信息
     * 
     * @param id 账号管理ID
     * @return 结果
     */
    @Override
    public int deleteCoreAccountById(Integer id)
    {
        return coreAccountMapper.deleteCoreAccountById(id);
    }
}
