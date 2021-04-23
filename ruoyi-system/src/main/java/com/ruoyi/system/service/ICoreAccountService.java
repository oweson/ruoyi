package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.CoreAccount;

/**
 * 账号管理Service接口
 * 
 * @author ruoyi
 * @date 2021-04-23
 */
public interface ICoreAccountService 
{
    /**
     * 查询账号管理
     * 
     * @param id 账号管理ID
     * @return 账号管理
     */
    public CoreAccount selectCoreAccountById(Integer id);

    /**
     * 查询账号管理列表
     * 
     * @param coreAccount 账号管理
     * @return 账号管理集合
     */
    public List<CoreAccount> selectCoreAccountList(CoreAccount coreAccount);

    /**
     * 新增账号管理
     * 
     * @param coreAccount 账号管理
     * @return 结果
     */
    public int insertCoreAccount(CoreAccount coreAccount);

    /**
     * 修改账号管理
     * 
     * @param coreAccount 账号管理
     * @return 结果
     */
    public int updateCoreAccount(CoreAccount coreAccount);

    /**
     * 批量删除账号管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCoreAccountByIds(String ids);

    /**
     * 删除账号管理信息
     * 
     * @param id 账号管理ID
     * @return 结果
     */
    public int deleteCoreAccountById(Integer id);
}
