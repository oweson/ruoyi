package com.ruoyi.system.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.Strategy;
import com.ruoyi.system.domain.TIdcard;
import com.ruoyi.system.mapper.TIdcardMapper;
import com.ruoyi.system.service.ITIdcardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.EmployeeMapper;
import com.ruoyi.system.domain.Employee;
import com.ruoyi.system.service.IEmployeeService;
import com.ruoyi.common.core.text.Convert;

/**
 * 员工Service业务层处理
 *
 * @author ruoyi
 * @date 2020-12-26
 */
@Service
public class EmployeeServiceImpl implements IEmployeeService {
    public static Map<String, String> stringMap = new HashMap<>(10240);

    @Autowired
    private TIdcardMapper tIdcardMapper;


    @Autowired
    private EmployeeMapper employeeMapper;


    /**
     * 查询员工
     *
     * @param idnumber 员工ID
     * @return 员工
     */
    @Override
    public Employee selectEmployeeById(String idnumber) {
        return employeeMapper.selectEmployeeById(idnumber);
    }

    /**
     * 查询员工列表
     *
     * @param employee 员工
     * @return 员工
     */
    @Override
    public List<Employee> selectEmployeeList(Employee employee) {
        List<Employee> employees = employeeMapper.selectEmployeeList(employee);
        if (stringMap.size() == 0) {
            List<TIdcard> tIdcards = tIdcardMapper.selectTIdcardList(null);
            for (TIdcard tIdcard : tIdcards) {
                stringMap.put(tIdcard.getfCode() + "", tIdcard.getfProvince() + "-" + tIdcard.getfCity() + "-" + tIdcard.getfArea());
            }
        }
        for (Employee employeeBean : employees) {
            if (employeeBean.getIdnumber().length() == 18 || employeeBean.getIdnumber().length() == 15) {
                if ( employeeBean.getIdnumber().length() > 6) {
                    // 处理年龄
                    employeeBean.setAge(DateUtils.transferIdNumberToAge(employeeBean.getIdnumber()));
                    String userAdressDetail = stringMap.get(employeeBean.getIdnumber().substring(0, 6));
                    if (userAdressDetail != null) {
                        employeeBean.setUserAddressDetail(userAdressDetail);
                    }

                } else {
                    employeeBean.setUserAddressDetail("不是二代身份证！请及时更换！");

                }
            } else {
                employeeBean.setUserAddressDetail("不是二代身份证！请及时更换！");

            }

        }
        return employees;
    }

    /**
     * 新增员工
     *
     * @param employee 员工
     * @return 结果
     */
    @Override
    public int insertEmployee(Employee employee) {
        employee.setCreateTime(DateUtils.getNowDate());
        return employeeMapper.insertEmployee(employee);
    }

    /**
     * 修改员工
     *
     * @param employee 员工
     * @return 结果
     */
    @Override
    public int updateEmployee(Employee employee) {
        employee.setUpdateTime(DateUtils.getNowDate());
        return employeeMapper.updateEmployee(employee);
    }

    /**
     * 删除员工对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteEmployeeByIds(String ids) {
        return employeeMapper.deleteEmployeeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除员工信息
     *
     * @param idnumber 员工ID
     * @return 结果
     */
    @Override
    public int deleteEmployeeById(String idnumber) {
        return employeeMapper.deleteEmployeeById(idnumber);
    }
}
