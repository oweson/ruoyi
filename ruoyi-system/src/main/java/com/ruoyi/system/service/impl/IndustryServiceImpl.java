package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.IndustryMapper;
import com.ruoyi.system.domain.Industry;
import com.ruoyi.system.service.IIndustryService;
import com.ruoyi.common.core.text.Convert;

/**
 * industryService业务层处理
 * 
 * @author ruoyi
 * @date 2020-08-15
 */
@Service
public class IndustryServiceImpl implements IIndustryService 
{
    @Autowired
    private IndustryMapper industryMapper;

    /**
     * 查询industry
     * 
     * @param code industryID
     * @return industry
     */
    @Override
    public Industry selectIndustryById(String code)
    {
        return industryMapper.selectIndustryById(code);
    }

    /**
     * 查询industry列表
     * 
     * @param industry industry
     * @return industry
     */
    @Override
    public List<Industry> selectIndustryList(Industry industry)
    {
        return industryMapper.selectIndustryList(industry);
    }

    /**
     * 新增industry
     * 
     * @param industry industry
     * @return 结果
     */
    @Override
    public int insertIndustry(Industry industry)
    {
        return industryMapper.insertIndustry(industry);
    }

    /**
     * 修改industry
     * 
     * @param industry industry
     * @return 结果
     */
    @Override
    public int updateIndustry(Industry industry)
    {
        return industryMapper.updateIndustry(industry);
    }

    /**
     * 删除industry对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteIndustryByIds(String ids)
    {
        return industryMapper.deleteIndustryByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除industry信息
     * 
     * @param code industryID
     * @return 结果
     */
    @Override
    public int deleteIndustryById(String code)
    {
        return industryMapper.deleteIndustryById(code);
    }
}
