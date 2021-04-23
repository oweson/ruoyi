package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BusinessOpportunityMapper;
import com.ruoyi.system.domain.BusinessOpportunity;
import com.ruoyi.system.service.IBusinessOpportunityService;
import com.ruoyi.common.core.text.Convert;

/**
 * 商机管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-04-23
 */
@Service
public class BusinessOpportunityServiceImpl implements IBusinessOpportunityService 
{
    @Autowired
    private BusinessOpportunityMapper businessOpportunityMapper;

    /**
     * 查询商机管理
     * 
     * @param id 商机管理ID
     * @return 商机管理
     */
    @Override
    public BusinessOpportunity selectBusinessOpportunityById(Long id)
    {
        return businessOpportunityMapper.selectBusinessOpportunityById(id);
    }

    /**
     * 查询商机管理列表
     * 
     * @param businessOpportunity 商机管理
     * @return 商机管理
     */
    @Override
    public List<BusinessOpportunity> selectBusinessOpportunityList(BusinessOpportunity businessOpportunity)
    {
        return businessOpportunityMapper.selectBusinessOpportunityList(businessOpportunity);
    }

    /**
     * 新增商机管理
     * 
     * @param businessOpportunity 商机管理
     * @return 结果
     */
    @Override
    public int insertBusinessOpportunity(BusinessOpportunity businessOpportunity)
    {
        businessOpportunity.setCreateTime(DateUtils.getNowDate());
        return businessOpportunityMapper.insertBusinessOpportunity(businessOpportunity);
    }

    /**
     * 修改商机管理
     * 
     * @param businessOpportunity 商机管理
     * @return 结果
     */
    @Override
    public int updateBusinessOpportunity(BusinessOpportunity businessOpportunity)
    {
        businessOpportunity.setUpdateTime(DateUtils.getNowDate());
        return businessOpportunityMapper.updateBusinessOpportunity(businessOpportunity);
    }

    /**
     * 删除商机管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBusinessOpportunityByIds(String ids)
    {
        return businessOpportunityMapper.deleteBusinessOpportunityByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除商机管理信息
     * 
     * @param id 商机管理ID
     * @return 结果
     */
    @Override
    public int deleteBusinessOpportunityById(Long id)
    {
        return businessOpportunityMapper.deleteBusinessOpportunityById(id);
    }
}
