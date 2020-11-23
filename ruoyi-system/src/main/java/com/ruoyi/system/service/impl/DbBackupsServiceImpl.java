package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.usefulutils.DBUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DbBackupsMapper;
import com.ruoyi.system.domain.DbBackups;
import com.ruoyi.system.service.IDbBackupsService;
import com.ruoyi.common.core.text.Convert;

/**
 * borrow_moneyService业务层处理
 * 
 * @author ruoyi
 * @date 2020-11-23
 */
@Service
public class DbBackupsServiceImpl implements IDbBackupsService 
{
    @Autowired
    private DbBackupsMapper dbBackupsMapper;

    /**
     * 查询borrow_money
     * 
     * @param id borrow_moneyID
     * @return borrow_money
     */
    @Override
    public DbBackups selectDbBackupsById(Long id)
    {
        return dbBackupsMapper.selectDbBackupsById(id);
    }

    /**
     * 查询borrow_money列表
     * 
     * @param dbBackups borrow_money
     * @return borrow_money
     */
    @Override
    public List<DbBackups> selectDbBackupsList(DbBackups dbBackups)
    {
        return dbBackupsMapper.selectDbBackupsList(dbBackups);
    }

    /**
     * 新增borrow_money
     * 
     * @param dbBackups borrow_money
     * @return 结果
     */
    @Override
    public int insertDbBackups(DbBackups dbBackups)
    {
        dbBackups.setCreateTime(DateUtils.getNowDate());
        return dbBackupsMapper.insertDbBackups(dbBackups);
    }

    /**
     * 修改borrow_money
     * 
     * @param dbBackups borrow_money
     * @return 结果
     */
    @Override
    public int updateDbBackups(DbBackups dbBackups)
    {
        dbBackups.setUpdateTime(DateUtils.getNowDate());
        return dbBackupsMapper.updateDbBackups(dbBackups);
    }

    /**
     * 删除borrow_money对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDbBackupsByIds(String ids)
    {
        return dbBackupsMapper.deleteDbBackupsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除borrow_money信息
     * 
     * @param id borrow_moneyID
     * @return 结果
     */
    @Override
    public int deleteDbBackupsById(Long id)
    {
        return dbBackupsMapper.deleteDbBackupsById(id);
    }
    @Override
    public int backupDB(String id) {
        DbBackups dbBackups = dbBackupsMapper.selectDbBackupsById(Long.parseLong(id));
        //         backup("81.68.119.227","root","df-21","/data","ppx.sql","dragon");
        DBUtils.backup(dbBackups.getServiceIp(),dbBackups.getUsername(),dbBackups.getPassword(),
                "/data",dbBackups.getFileName(),dbBackups.getDbname());
        return 0;
    }
}
