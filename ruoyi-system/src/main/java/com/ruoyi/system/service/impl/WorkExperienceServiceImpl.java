package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.WorkExperienceMapper;
import com.ruoyi.system.domain.WorkExperience;
import com.ruoyi.system.service.IWorkExperienceService;
import com.ruoyi.common.core.text.Convert;

/**
 * 工作经历Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-23
 */
@Service
public class WorkExperienceServiceImpl implements IWorkExperienceService 
{
    @Autowired
    private WorkExperienceMapper workExperienceMapper;

    /**
     * 查询工作经历
     * 
     * @param id 工作经历ID
     * @return 工作经历
     */
    @Override
    public WorkExperience selectWorkExperienceById(Long id)
    {
        return workExperienceMapper.selectWorkExperienceById(id);
    }

    /**
     * 查询工作经历列表
     * 
     * @param workExperience 工作经历
     * @return 工作经历
     */
    @Override
    public List<WorkExperience> selectWorkExperienceList(WorkExperience workExperience)
    {
        return workExperienceMapper.selectWorkExperienceList(workExperience);
    }

    /**
     * 新增工作经历
     * 
     * @param workExperience 工作经历
     * @return 结果
     */
    @Override
    public int insertWorkExperience(WorkExperience workExperience)
    {
        workExperience.setCreateTime(DateUtils.getNowDate());
        return workExperienceMapper.insertWorkExperience(workExperience);
    }

    /**
     * 修改工作经历
     * 
     * @param workExperience 工作经历
     * @return 结果
     */
    @Override
    public int updateWorkExperience(WorkExperience workExperience)
    {
        workExperience.setUpdateTime(DateUtils.getNowDate());
        return workExperienceMapper.updateWorkExperience(workExperience);
    }

    /**
     * 删除工作经历对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteWorkExperienceByIds(String ids)
    {
        return workExperienceMapper.deleteWorkExperienceByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除工作经历信息
     * 
     * @param id 工作经历ID
     * @return 结果
     */
    @Override
    public int deleteWorkExperienceById(Long id)
    {
        return workExperienceMapper.deleteWorkExperienceById(id);
    }
}
