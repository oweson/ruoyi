package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.system.domain.Student;
import com.ruoyi.system.mapper.CompanyMapper;
import com.ruoyi.system.domain.Company;
import com.ruoyi.system.service.ICompanyService;
import com.ruoyi.common.core.text.Convert;

/**
 * 公司Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-08-14
 */
@Service
public class CompanyServiceImpl implements ICompanyService 
{
    @Autowired
    private CompanyMapper companyMapper;

    /**
     * 查询公司
     * 
     * @param id 公司ID
     * @return 公司
     */
    @Override
    public Company selectCompanyById(Long id)
    {
        return companyMapper.selectCompanyById(id);
    }

    /**
     * 查询公司列表
     * 
     * @param company 公司
     * @return 公司
     */
    @Override
    public List<Company> selectCompanyList(Company company)
    {
        return companyMapper.selectCompanyList(company);
    }

    /**
     * 新增公司
     * 
     * @param company 公司
     * @return 结果
     */
    @Transactional
    @Override
    public int insertCompany(Company company)
    {
        int rows = companyMapper.insertCompany(company);
        insertStudent(company);
        return rows;
    }

    /**
     * 修改公司
     * 
     * @param company 公司
     * @return 结果
     */
    @Transactional
    @Override
    public int updateCompany(Company company)
    {
        companyMapper.deleteStudentByClassId(company.getId());
        insertStudent(company);
        return companyMapper.updateCompany(company);
    }

    /**
     * 删除公司对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteCompanyByIds(String ids)
    {
        companyMapper.deleteStudentByClassIds(Convert.toStrArray(ids));
        return companyMapper.deleteCompanyByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除公司信息
     * 
     * @param id 公司ID
     * @return 结果
     */
    @Override
    public int deleteCompanyById(Long id)
    {
        companyMapper.deleteStudentByClassId(id);
        return companyMapper.deleteCompanyById(id);
    }

    /**
     * 新增学生信息
     * 
     * @param company 公司对象
     */
    public void insertStudent(Company company)
    {
        List<Student> studentList = company.getStudentList();
        Long id = company.getId();
        if (StringUtils.isNotNull(studentList))
        {
            List<Student> list = new ArrayList<Student>();
            for (Student student : studentList)
            {
                student.setId(id);
                list.add(student);
            }
            if (list.size() > 0)
            {
                companyMapper.batchStudent(list);
            }
        }
    }
}
