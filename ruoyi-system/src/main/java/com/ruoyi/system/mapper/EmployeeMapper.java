package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Employee;

/**
 * 员工Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-26
 */
public interface EmployeeMapper 
{
    /**
     * 查询员工
     * 
     * @param idnumber 员工ID
     * @return 员工
     */
    public Employee selectEmployeeById(String idnumber);

    /**
     * 查询员工列表
     * 
     * @param employee 员工
     * @return 员工集合
     */
    public List<Employee> selectEmployeeList(Employee employee);
    public List<Employee> selectEmployeeListSync(Employee employee);


    /**
     * 新增员工
     * 
     * @param employee 员工
     * @return 结果
     */
    public int insertEmployee(Employee employee);

    /**
     * 修改员工
     * 
     * @param employee 员工
     * @return 结果
     */
    public int updateEmployee(Employee employee);

    /**
     * 删除员工
     * 
     * @param idnumber 员工ID
     * @return 结果
     */
    public int deleteEmployeeById(String idnumber);

    /**
     * 批量删除员工
     * 
     * @param idnumbers 需要删除的数据ID
     * @return 结果
     */
    public int deleteEmployeeByIds(String[] idnumbers);
}
