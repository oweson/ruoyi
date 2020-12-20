package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.TimeConsumer;

/**
 * 时间管理Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-18
 */
public interface TimeConsumerMapper 
{
    /**
     * 查询时间管理
     * 
     * @param id 时间管理ID
     * @return 时间管理
     */
    public TimeConsumer selectTimeConsumerById(Long id);

    /**
     * 查询时间管理列表
     * 
     * @param timeConsumer 时间管理
     * @return 时间管理集合
     */
    public List<TimeConsumer> selectTimeConsumerList(TimeConsumer timeConsumer);

    /**
     * 新增时间管理
     * 
     * @param timeConsumer 时间管理
     * @return 结果
     */
    public int insertTimeConsumer(TimeConsumer timeConsumer);

    /**
     * 修改时间管理
     * 
     * @param timeConsumer 时间管理
     * @return 结果
     */
    public int updateTimeConsumer(TimeConsumer timeConsumer);

    /**
     * 删除时间管理
     * 
     * @param id 时间管理ID
     * @return 结果
     */
    public int deleteTimeConsumerById(Long id);

    /**
     * 批量删除时间管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTimeConsumerByIds(String[] ids);
}
