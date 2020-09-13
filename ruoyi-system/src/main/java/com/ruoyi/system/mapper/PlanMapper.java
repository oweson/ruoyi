package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Plan;

/**
 * 计划详情Mapper接口
 * 
 * @author ruoyi
 * @date 2020-09-13
 */
public interface PlanMapper 
{
    /**
     * 查询计划详情
     * 
     * @param id 计划详情ID
     * @return 计划详情
     */
    public Plan selectPlanById(Long id);

    /**
     * 查询计划详情列表
     * 
     * @param plan 计划详情
     * @return 计划详情集合
     */
    public List<Plan> selectPlanList(Plan plan);

    /**
     * 新增计划详情
     * 
     * @param plan 计划详情
     * @return 结果
     */
    public int insertPlan(Plan plan);

    /**
     * 修改计划详情
     * 
     * @param plan 计划详情
     * @return 结果
     */
    public int updatePlan(Plan plan);

    /**
     * 删除计划详情
     * 
     * @param id 计划详情ID
     * @return 结果
     */
    public int deletePlanById(Long id);

    /**
     * 批量删除计划详情
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletePlanByIds(String[] ids);
}
