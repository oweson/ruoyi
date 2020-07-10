package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ProjectErrorMapper;
import com.ruoyi.system.domain.ProjectError;
import com.ruoyi.system.service.IProjectErrorService;
import com.ruoyi.common.core.text.Convert;

/**
 * 项目中遇到的错误详情记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-06-03
 */
@Service
public class ProjectErrorServiceImpl implements IProjectErrorService 
{
    @Autowired
    private ProjectErrorMapper projectErrorMapper;

    /**
     * 查询项目中遇到的错误详情记录
     * 
     * @param id 项目中遇到的错误详情记录ID
     * @return 项目中遇到的错误详情记录
     */
    @Override
    public ProjectError selectProjectErrorById(Long id)
    {
        return projectErrorMapper.selectProjectErrorById(id);
    }

    /**
     * 查询项目中遇到的错误详情记录列表
     * 
     * @param projectError 项目中遇到的错误详情记录
     * @return 项目中遇到的错误详情记录
     */
    @Override
    public List<ProjectError> selectProjectErrorList(ProjectError projectError)
    {
        return projectErrorMapper.selectProjectErrorList(projectError);
    }

    /**
     * 新增项目中遇到的错误详情记录
     * 
     * @param projectError 项目中遇到的错误详情记录
     * @return 结果
     */
    @Override
    public int insertProjectError(ProjectError projectError)
    {
        projectError.setCreateTime(DateUtils.getNowDate());
        return projectErrorMapper.insertProjectError(projectError);
    }

    /**
     * 修改项目中遇到的错误详情记录
     * 
     * @param projectError 项目中遇到的错误详情记录
     * @return 结果
     */
    @Override
    public int updateProjectError(ProjectError projectError)
    {
        return projectErrorMapper.updateProjectError(projectError);
    }

    /**
     * 删除项目中遇到的错误详情记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteProjectErrorByIds(String ids)
    {
        return projectErrorMapper.deleteProjectErrorByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除项目中遇到的错误详情记录信息
     * 
     * @param id 项目中遇到的错误详情记录ID
     * @return 结果
     */
    @Override
    public int deleteProjectErrorById(Long id)
    {
        return projectErrorMapper.deleteProjectErrorById(id);
    }
}
