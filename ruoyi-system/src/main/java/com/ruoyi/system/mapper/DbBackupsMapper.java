package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.DbBackups;

/**
 * borrow_moneyMapper接口
 * 
 * @author ruoyi
 * @date 2020-11-23
 */
public interface DbBackupsMapper 
{
    /**
     * 查询borrow_money
     * 
     * @param id borrow_moneyID
     * @return borrow_money
     */
    public DbBackups selectDbBackupsById(Long id);

    /**
     * 查询borrow_money列表
     * 
     * @param dbBackups borrow_money
     * @return borrow_money集合
     */
    public List<DbBackups> selectDbBackupsList(DbBackups dbBackups);

    /**
     * 新增borrow_money
     * 
     * @param dbBackups borrow_money
     * @return 结果
     */
    public int insertDbBackups(DbBackups dbBackups);

    /**
     * 修改borrow_money
     * 
     * @param dbBackups borrow_money
     * @return 结果
     */
    public int updateDbBackups(DbBackups dbBackups);

    /**
     * 删除borrow_money
     * 
     * @param id borrow_moneyID
     * @return 结果
     */
    public int deleteDbBackupsById(Long id);

    /**
     * 批量删除borrow_money
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDbBackupsByIds(String[] ids);
}
