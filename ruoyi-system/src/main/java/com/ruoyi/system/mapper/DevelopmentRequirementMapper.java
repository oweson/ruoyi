package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.DevelopmentRequirement;

/**
 * 计划需求Mapper接口
 * 
 * @author ruoyi
 * @date 2021-05-16
 */
public interface DevelopmentRequirementMapper 
{
    /**
     * 查询计划需求
     * 
     * @param id 计划需求ID
     * @return 计划需求
     */
    public DevelopmentRequirement selectDevelopmentRequirementById(Long id);

    /**
     * 查询计划需求列表
     * 
     * @param developmentRequirement 计划需求
     * @return 计划需求集合
     */
    public List<DevelopmentRequirement> selectDevelopmentRequirementList(DevelopmentRequirement developmentRequirement);

    /**
     * 新增计划需求
     * 
     * @param developmentRequirement 计划需求
     * @return 结果
     */
    public int insertDevelopmentRequirement(DevelopmentRequirement developmentRequirement);

    /**
     * 修改计划需求
     * 
     * @param developmentRequirement 计划需求
     * @return 结果
     */
    public int updateDevelopmentRequirement(DevelopmentRequirement developmentRequirement);

    /**
     * 删除计划需求
     * 
     * @param id 计划需求ID
     * @return 结果
     */
    public int deleteDevelopmentRequirementById(Long id);

    /**
     * 批量删除计划需求
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDevelopmentRequirementByIds(String[] ids);
}
