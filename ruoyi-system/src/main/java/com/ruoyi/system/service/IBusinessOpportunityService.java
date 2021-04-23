package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BusinessOpportunity;

/**
 * 商机管理Service接口
 * 
 * @author ruoyi
 * @date 2021-04-23
 */
public interface IBusinessOpportunityService 
{
    /**
     * 查询商机管理
     * 
     * @param id 商机管理ID
     * @return 商机管理
     */
    public BusinessOpportunity selectBusinessOpportunityById(Long id);

    /**
     * 查询商机管理列表
     * 
     * @param businessOpportunity 商机管理
     * @return 商机管理集合
     */
    public List<BusinessOpportunity> selectBusinessOpportunityList(BusinessOpportunity businessOpportunity);

    /**
     * 新增商机管理
     * 
     * @param businessOpportunity 商机管理
     * @return 结果
     */
    public int insertBusinessOpportunity(BusinessOpportunity businessOpportunity);

    /**
     * 修改商机管理
     * 
     * @param businessOpportunity 商机管理
     * @return 结果
     */
    public int updateBusinessOpportunity(BusinessOpportunity businessOpportunity);

    /**
     * 批量删除商机管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBusinessOpportunityByIds(String ids);

    /**
     * 删除商机管理信息
     * 
     * @param id 商机管理ID
     * @return 结果
     */
    public int deleteBusinessOpportunityById(Long id);
}
