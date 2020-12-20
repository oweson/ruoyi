package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TimeConsumer;
import com.ruoyi.common.core.domain.Ztree;

/**
 * 时间管理Service接口
 * 
 * @author ruoyi
 * @date 2020-12-18
 */
public interface ITimeConsumerService 
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
     * 批量删除时间管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTimeConsumerByIds(String ids);

    /**
     * 删除时间管理信息
     * 
     * @param id 时间管理ID
     * @return 结果
     */
    public int deleteTimeConsumerById(Long id);

    /**
     * 查询时间管理树列表
     * 
     * @return 所有时间管理信息
     */
    public List<Ztree> selectTimeConsumerTree();
}
