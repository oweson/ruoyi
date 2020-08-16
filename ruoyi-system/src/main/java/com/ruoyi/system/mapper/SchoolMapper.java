package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.School;

/**
 * schoolMapper接口
 * 
 * @author ruoyi
 * @date 2020-08-06
 */
public interface SchoolMapper 
{
    /**
     * 查询school
     * 
     * @param id schoolID
     * @return school
     */
    public School selectSchoolById(Long id);

    /**
     * 查询school列表
     * 
     * @param school school
     * @return school集合
     */
    public List<School> selectSchoolList(School school);

    /**
     * 新增school
     * 
     * @param school school
     * @return 结果
     */
    public int insertSchool(School school);

    /**
     * 修改school
     * 
     * @param school school
     * @return 结果
     */
    public int updateSchool(School school);

    /**
     * 删除school
     * 
     * @param id schoolID
     * @return 结果
     */
    public int deleteSchoolById(Long id);

    /**
     * 批量删除school
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSchoolByIds(String[] ids);
}
