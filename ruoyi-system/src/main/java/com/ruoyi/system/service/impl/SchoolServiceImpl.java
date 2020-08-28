package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SchoolMapper;
import com.ruoyi.system.domain.School;
import com.ruoyi.system.service.ISchoolService;
import com.ruoyi.common.core.text.Convert;

/**
 * schoolService业务层处理
 * 
 * @author ruoyi
 * @date 2020-08-28
 */
@Service
public class SchoolServiceImpl implements ISchoolService 
{
    @Autowired
    private SchoolMapper schoolMapper;

    /**
     * 查询school
     * 
     * @param id schoolID
     * @return school
     */
    @Override
    public School selectSchoolById(Long id)
    {
        return schoolMapper.selectSchoolById(id);
    }

    /**
     * 查询school列表
     * 
     * @param school school
     * @return school
     */
    @Override
    public List<School> selectSchoolList(School school)
    {
        return schoolMapper.selectSchoolList(school);
    }

    /**
     * 新增school
     * 
     * @param school school
     * @return 结果
     */
    @Override
    public int insertSchool(School school)
    {
        return schoolMapper.insertSchool(school);
    }

    /**
     * 修改school
     * 
     * @param school school
     * @return 结果
     */
    @Override
    public int updateSchool(School school)
    {
        return schoolMapper.updateSchool(school);
    }

    /**
     * 删除school对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSchoolByIds(String ids)
    {
        return schoolMapper.deleteSchoolByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除school信息
     * 
     * @param id schoolID
     * @return 结果
     */
    @Override
    public int deleteSchoolById(Long id)
    {
        return schoolMapper.deleteSchoolById(id);
    }
}
