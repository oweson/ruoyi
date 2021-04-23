package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.WorkExperience;

/**
 * 工作经历Mapper接口
 * 
 * @author ruoyi
 * @date 2021-04-23
 */
public interface WorkExperienceMapper 
{
    /**
     * 查询工作经历
     * 
     * @param id 工作经历ID
     * @return 工作经历
     */
    public WorkExperience selectWorkExperienceById(Long id);

    /**
     * 查询工作经历列表
     * 
     * @param workExperience 工作经历
     * @return 工作经历集合
     */
    public List<WorkExperience> selectWorkExperienceList(WorkExperience workExperience);

    /**
     * 新增工作经历
     * 
     * @param workExperience 工作经历
     * @return 结果
     */
    public int insertWorkExperience(WorkExperience workExperience);

    /**
     * 修改工作经历
     * 
     * @param workExperience 工作经历
     * @return 结果
     */
    public int updateWorkExperience(WorkExperience workExperience);

    /**
     * 删除工作经历
     * 
     * @param id 工作经历ID
     * @return 结果
     */
    public int deleteWorkExperienceById(Long id);

    /**
     * 批量删除工作经历
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteWorkExperienceByIds(String[] ids);
}
