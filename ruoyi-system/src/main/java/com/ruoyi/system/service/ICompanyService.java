package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Company;

/**
 * 公司Service接口
 * 
 * @author ruoyi
 * @date 2020-08-14
 */
public interface ICompanyService 
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
     * 批量删除公司
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCompanyByIds(String ids);

    /**
     * 删除公司信息
     * 
     * @param id 公司ID
     * @return 结果
     */
    public int deleteCompanyById(Long id);
}
