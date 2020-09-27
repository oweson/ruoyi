package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BugMapper;
import com.ruoyi.system.domain.Bug;
import com.ruoyi.system.service.IBugService;
import com.ruoyi.common.core.text.Convert;

/**
 * bug记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-26
 */
@Service
public class BugServiceImpl implements IBugService 
{
    @Autowired
    private BugMapper bugMapper;

    /**
     * 查询bug记录
     * 
     * @param id bug记录ID
     * @return bug记录
     */
    @Override
    public Bug selectBugById(Long id)
    {
        return bugMapper.selectBugById(id);
    }

    /**
     * 查询bug记录列表
     * 
     * @param bug bug记录
     * @return bug记录
     */
    @Override
    public List<Bug> selectBugList(Bug bug)
    {
        return bugMapper.selectBugList(bug);
    }

    /**
     * 新增bug记录
     * 
     * @param bug bug记录
     * @return 结果
     */
    @Override
    public int insertBug(Bug bug)
    {
        bug.setCreateTime(DateUtils.getNowDate());
        return bugMapper.insertBug(bug);
    }

    /**
     * 修改bug记录
     * 
     * @param bug bug记录
     * @return 结果
     */
    @Override
    public int updateBug(Bug bug)
    {
        bug.setUpdateTime(DateUtils.getNowDate());
        return bugMapper.updateBug(bug);
    }

    /**
     * 删除bug记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBugByIds(String ids)
    {
        return bugMapper.deleteBugByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除bug记录信息
     * 
     * @param id bug记录ID
     * @return 结果
     */
    @Override
    public int deleteBugById(Long id)
    {
        return bugMapper.deleteBugById(id);
    }
}
