package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.AppWriteMapper;
import com.ruoyi.system.domain.AppWrite;
import com.ruoyi.system.service.IAppWriteService;
import com.ruoyi.common.core.text.Convert;

/**
 * app记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-13
 */
@Service
public class AppWriteServiceImpl implements IAppWriteService 
{
    @Autowired
    private AppWriteMapper appWriteMapper;

    /**
     * 查询app记录
     * 
     * @param id app记录ID
     * @return app记录
     */
    @Override
    public AppWrite selectAppWriteById(Long id)
    {
        return appWriteMapper.selectAppWriteById(id);
    }

    /**
     * 查询app记录列表
     * 
     * @param appWrite app记录
     * @return app记录
     */
    @Override
    public List<AppWrite> selectAppWriteList(AppWrite appWrite)
    {
        return appWriteMapper.selectAppWriteList(appWrite);
    }

    /**
     * 新增app记录
     * 
     * @param appWrite app记录
     * @return 结果
     */
    @Override
    public int insertAppWrite(AppWrite appWrite)
    {
        appWrite.setCreateTime(DateUtils.getNowDate());
        return appWriteMapper.insertAppWrite(appWrite);
    }

    /**
     * 修改app记录
     * 
     * @param appWrite app记录
     * @return 结果
     */
    @Override
    public int updateAppWrite(AppWrite appWrite)
    {
        appWrite.setUpdateTime(DateUtils.getNowDate());
        return appWriteMapper.updateAppWrite(appWrite);
    }

    /**
     * 删除app记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteAppWriteByIds(String ids)
    {
        return appWriteMapper.deleteAppWriteByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除app记录信息
     * 
     * @param id app记录ID
     * @return 结果
     */
    @Override
    public int deleteAppWriteById(Long id)
    {
        return appWriteMapper.deleteAppWriteById(id);
    }
}
