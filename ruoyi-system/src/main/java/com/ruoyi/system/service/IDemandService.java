package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Demand;

/**
 * 需求Service接口
 * 
 * @author ruoyi
 * @date 2020-06-03
 */
public interface IDemandService 
{
    /**
     * 查询需求
     * 
     * @param id 需求ID
     * @return 需求
     */
    public Demand selectDemandById(Long id);

    /**
     * 查询需求列表
     * 
     * @param demand 需求
     * @return 需求集合
     */
    public List<Demand> selectDemandList(Demand demand);

    /**
     * 新增需求
     * 
     * @param demand 需求
     * @return 结果
     */
    public int insertDemand(Demand demand);

    /**
     * 修改需求
     * 
     * @param demand 需求
     * @return 结果
     */
    public int updateDemand(Demand demand);

    /**
     * 批量删除需求
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDemandByIds(String ids);

    /**
     * 删除需求信息
     * 
     * @param id 需求ID
     * @return 结果
     */
    public int deleteDemandById(Long id);
}
