package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PlanMapper;
import com.ruoyi.system.domain.Plan;
import com.ruoyi.system.service.IPlanService;
import com.ruoyi.common.core.text.Convert;

/**
 * 计划详情Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-13
 */
@Service
public class PlanServiceImpl implements IPlanService 
{
    @Autowired
    private PlanMapper planMapper;

    /**
     * 查询计划详情
     * 
     * @param id 计划详情ID
     * @return 计划详情
     */
    @Override
    public Plan selectPlanById(Long id)
    {
        return planMapper.selectPlanById(id);
    }

    /**
     * 查询计划详情列表
     * 
     * @param plan 计划详情
     * @return 计划详情
     */
    @Override
    public List<Plan> selectPlanList(Plan plan)
    {
        return planMapper.selectPlanList(plan);
    }

    /**
     * 新增计划详情
     * 
     * @param plan 计划详情
     * @return 结果
     */
    @Override
    public int insertPlan(Plan plan)
    {
        plan.setCreateTime(DateUtils.getNowDate());
        return planMapper.insertPlan(plan);
    }

    /**
     * 修改计划详情
     * 
     * @param plan 计划详情
     * @return 结果
     */
    @Override
    public int updatePlan(Plan plan)
    {
        plan.setUpdateTime(DateUtils.getNowDate());
        return planMapper.updatePlan(plan);
    }

    /**
     * 删除计划详情对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletePlanByIds(String ids)
    {
        return planMapper.deletePlanByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除计划详情信息
     * 
     * @param id 计划详情ID
     * @return 结果
     */
    @Override
    public int deletePlanById(Long id)
    {
        return planMapper.deletePlanById(id);
    }
}
