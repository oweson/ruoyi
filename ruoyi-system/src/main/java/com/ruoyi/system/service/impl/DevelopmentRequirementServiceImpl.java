package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DevelopmentRequirementMapper;
import com.ruoyi.system.domain.DevelopmentRequirement;
import com.ruoyi.system.service.IDevelopmentRequirementService;
import com.ruoyi.common.core.text.Convert;

/**
 * 计划需求Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-05-16
 */
@Service
public class DevelopmentRequirementServiceImpl implements IDevelopmentRequirementService 
{
    @Autowired
    private DevelopmentRequirementMapper developmentRequirementMapper;

    /**
     * 查询计划需求
     * 
     * @param id 计划需求ID
     * @return 计划需求
     */
    @Override
    public DevelopmentRequirement selectDevelopmentRequirementById(Long id)
    {
        return developmentRequirementMapper.selectDevelopmentRequirementById(id);
    }

    /**
     * 查询计划需求列表
     * 
     * @param developmentRequirement 计划需求
     * @return 计划需求
     */
    @Override
    public List<DevelopmentRequirement> selectDevelopmentRequirementList(DevelopmentRequirement developmentRequirement)
    {
        return developmentRequirementMapper.selectDevelopmentRequirementList(developmentRequirement);
    }

    /**
     * 新增计划需求
     * 
     * @param developmentRequirement 计划需求
     * @return 结果
     */
    @Override
    public int insertDevelopmentRequirement(DevelopmentRequirement developmentRequirement)
    {
        developmentRequirement.setCreateTime(DateUtils.getNowDate());
        return developmentRequirementMapper.insertDevelopmentRequirement(developmentRequirement);
    }

    /**
     * 修改计划需求
     * 
     * @param developmentRequirement 计划需求
     * @return 结果
     */
    @Override
    public int updateDevelopmentRequirement(DevelopmentRequirement developmentRequirement)
    {
        developmentRequirement.setUpdateTime(DateUtils.getNowDate());
        return developmentRequirementMapper.updateDevelopmentRequirement(developmentRequirement);
    }

    /**
     * 删除计划需求对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDevelopmentRequirementByIds(String ids)
    {
        return developmentRequirementMapper.deleteDevelopmentRequirementByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除计划需求信息
     * 
     * @param id 计划需求ID
     * @return 结果
     */
    @Override
    public int deleteDevelopmentRequirementById(Long id)
    {
        return developmentRequirementMapper.deleteDevelopmentRequirementById(id);
    }
}
