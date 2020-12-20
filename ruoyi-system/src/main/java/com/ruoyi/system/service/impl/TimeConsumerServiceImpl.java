package com.ruoyi.system.service.impl;

import java.util.List;
import java.util.ArrayList;
import com.ruoyi.common.core.domain.Ztree;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TimeConsumerMapper;
import com.ruoyi.system.domain.TimeConsumer;
import com.ruoyi.system.service.ITimeConsumerService;
import com.ruoyi.common.core.text.Convert;

/**
 * 时间管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-18
 */
@Service
public class TimeConsumerServiceImpl implements ITimeConsumerService 
{
    @Autowired
    private TimeConsumerMapper timeConsumerMapper;

    /**
     * 查询时间管理
     * 
     * @param id 时间管理ID
     * @return 时间管理
     */
    @Override
    public TimeConsumer selectTimeConsumerById(Long id)
    {
        return timeConsumerMapper.selectTimeConsumerById(id);
    }

    /**
     * 查询时间管理列表
     * 
     * @param timeConsumer 时间管理
     * @return 时间管理
     */
    @Override
    public List<TimeConsumer> selectTimeConsumerList(TimeConsumer timeConsumer)
    {
        return timeConsumerMapper.selectTimeConsumerList(timeConsumer);
    }

    /**
     * 新增时间管理
     * 
     * @param timeConsumer 时间管理
     * @return 结果
     */
    @Override
    public int insertTimeConsumer(TimeConsumer timeConsumer)
    {
        timeConsumer.setCreateTime(DateUtils.getNowDate());
        return timeConsumerMapper.insertTimeConsumer(timeConsumer);
    }

    /**
     * 修改时间管理
     * 
     * @param timeConsumer 时间管理
     * @return 结果
     */
    @Override
    public int updateTimeConsumer(TimeConsumer timeConsumer)
    {
        timeConsumer.setUpdateTime(DateUtils.getNowDate());
        return timeConsumerMapper.updateTimeConsumer(timeConsumer);
    }

    /**
     * 删除时间管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTimeConsumerByIds(String ids)
    {
        return timeConsumerMapper.deleteTimeConsumerByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除时间管理信息
     * 
     * @param id 时间管理ID
     * @return 结果
     */
    @Override
    public int deleteTimeConsumerById(Long id)
    {
        return timeConsumerMapper.deleteTimeConsumerById(id);
    }

    /**
     * 查询时间管理树列表
     * 
     * @return 所有时间管理信息
     */
    @Override
    public List<Ztree> selectTimeConsumerTree()
    {
        List<TimeConsumer> timeConsumerList = timeConsumerMapper.selectTimeConsumerList(new TimeConsumer());
        List<Ztree> ztrees = new ArrayList<Ztree>();
        for (TimeConsumer timeConsumer : timeConsumerList)
        {
            Ztree ztree = new Ztree();
            ztree.setId(timeConsumer.getId());
            ztree.setpId(timeConsumer.getParentId());
            ztree.setName(timeConsumer.getName());
            ztree.setTitle(timeConsumer.getName());
            ztrees.add(ztree);
        }
        return ztrees;
    }
}
