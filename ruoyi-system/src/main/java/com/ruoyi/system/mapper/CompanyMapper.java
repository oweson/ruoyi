package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Company;
import com.ruoyi.system.domain.Student;

/**
 * 公司Mapper接口
 * 
 * @author ruoyi
 * @date 2020-08-14
 */
public interface CompanyMapper 
{
    /**
     * 查询公司
     * 
     * @param id 公司ID
     * @return 公司
     */
    public Company selectCompanyById(Long id);

    /**
     * 查询公司列表
     * 
     * @param company 公司
     * @return 公司集合
     */
    public List<Company> selectCompanyList(Company company);

    /**
     * 新增公司
     * 
     * @param company 公司
     * @return 结果
     */
    public int insertCompany(Company company);

    /**
     * 修改公司
     * 
     * @param company 公司
     * @return 结果
     */
    public int updateCompany(Company company);

    /**
     * 删除公司
     * 
     * @param id 公司ID
     * @return 结果
     */
    public int deleteCompanyById(Long id);

    /**
     * 批量删除公司
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCompanyByIds(String[] ids);

    /**
     * 批量删除学生
     * 
     * @param customerIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteStudentByClassIds(String[] ids);
    
    /**
     * 批量新增学生
     * 
     * @param studentList 学生列表
     * @return 结果
     */
    public int batchStudent(List<Student> studentList);
    

    /**
     * 通过公司ID删除学生信息
     * 
     * @param roleId 角色ID
     * @return 结果
     */
    public int deleteStudentByClassId(Long id);
}
