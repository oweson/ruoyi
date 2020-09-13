package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BestCompany;

/**
 * 优秀公司关注Mapper接口
 * 
 * @author ruoyi
 * @date 2020-09-13
 */
public interface BestCompanyMapper 
{
    /**
     * 查询优秀公司关注
     * 
     * @param id 优秀公司关注ID
     * @return 优秀公司关注
     */
    public BestCompany selectBestCompanyById(Integer id);

    /**
     * 查询优秀公司关注列表
     * 
     * @param bestCompany 优秀公司关注
     * @return 优秀公司关注集合
     */
    public List<BestCompany> selectBestCompanyList(BestCompany bestCompany);

    /**
     * 新增优秀公司关注
     * 
     * @param bestCompany 优秀公司关注
     * @return 结果
     */
    public int insertBestCompany(BestCompany bestCompany);

    /**
     * 修改优秀公司关注
     * 
     * @param bestCompany 优秀公司关注
     * @return 结果
     */
    public int updateBestCompany(BestCompany bestCompany);

    /**
     * 删除优秀公司关注
     * 
     * @param id 优秀公司关注ID
     * @return 结果
     */
    public int deleteBestCompanyById(Integer id);

    /**
     * 批量删除优秀公司关注
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBestCompanyByIds(String[] ids);
}
