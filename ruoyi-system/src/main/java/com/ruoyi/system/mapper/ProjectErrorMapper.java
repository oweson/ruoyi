package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.ProjectError;

/**
 * 项目中遇到的错误详情记录Mapper接口
 * 
 * @author ruoyi
 * @date 2020-06-03
 */
public interface ProjectErrorMapper 
{
    /**
     * 查询项目中遇到的错误详情记录
     * 
     * @param id 项目中遇到的错误详情记录ID
     * @return 项目中遇到的错误详情记录
     */
    public ProjectError selectProjectErrorById(Long id);

    /**
     * 查询项目中遇到的错误详情记录列表
     * 
     * @param projectError 项目中遇到的错误详情记录
     * @return 项目中遇到的错误详情记录集合
     */
    public List<ProjectError> selectProjectErrorList(ProjectError projectError);

    /**
     * 新增项目中遇到的错误详情记录
     * 
     * @param projectError 项目中遇到的错误详情记录
     * @return 结果
     */
    public int insertProjectError(ProjectError projectError);

    /**
     * 修改项目中遇到的错误详情记录
     * 
     * @param projectError 项目中遇到的错误详情记录
     * @return 结果
     */
    public int updateProjectError(ProjectError projectError);

    /**
     * 删除项目中遇到的错误详情记录
     * 
     * @param id 项目中遇到的错误详情记录ID
     * @return 结果
     */
    public int deleteProjectErrorById(Long id);

    /**
     * 批量删除项目中遇到的错误详情记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteProjectErrorByIds(String[] ids);
}
