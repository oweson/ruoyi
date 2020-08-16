package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Student;

/**
 * 学生Service接口
 * 
 * @author ruoyi
 * @date 2020-08-14
 */
public interface IStudentService 
{
    /**
     * 查询学生
     * 
     * @param id 学生ID
     * @return 学生
     */
    public Student selectStudentById(Long id);

    /**
     * 查询学生列表
     * 
     * @param student 学生
     * @return 学生集合
     */
    public List<Student> selectStudentList(Student student);

    /**
     * 新增学生
     * 
     * @param student 学生
     * @return 结果
     */
    public int insertStudent(Student student);

    /**
     * 修改学生
     * 
     * @param student 学生
     * @return 结果
     */
    public int updateStudent(Student student);

    /**
     * 批量删除学生
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteStudentByIds(String ids);

    /**
     * 删除学生信息
     * 
     * @param id 学生ID
     * @return 结果
     */
    public int deleteStudentById(Long id);
}
