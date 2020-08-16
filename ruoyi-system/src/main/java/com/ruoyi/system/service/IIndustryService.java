package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Industry;

/**
 * industryService接口
 * 
 * @author ruoyi
 * @date 2020-08-15
 */
public interface IIndustryService 
{
    /**
     * 查询industry
     * 
     * @param code industryID
     * @return industry
     */
    public Industry selectIndustryById(String code);

    /**
     * 查询industry列表
     * 
     * @param industry industry
     * @return industry集合
     */
    public List<Industry> selectIndustryList(Industry industry);

    /**
     * 新增industry
     * 
     * @param industry industry
     * @return 结果
     */
    public int insertIndustry(Industry industry);

    /**
     * 修改industry
     * 
     * @param industry industry
     * @return 结果
     */
    public int updateIndustry(Industry industry);

    /**
     * 批量删除industry
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteIndustryByIds(String ids);

    /**
     * 删除industry信息
     * 
     * @param code industryID
     * @return 结果
     */
    public int deleteIndustryById(String code);
}
