package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.InspirationalQuotationsMapper;
import com.ruoyi.system.domain.InspirationalQuotations;
import com.ruoyi.system.service.IInspirationalQuotationsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 心灵鸡汤Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-13
 */
@Service
public class InspirationalQuotationsServiceImpl implements IInspirationalQuotationsService 
{
    @Autowired
    private InspirationalQuotationsMapper inspirationalQuotationsMapper;

    /**
     * 查询心灵鸡汤
     * 
     * @param id 心灵鸡汤ID
     * @return 心灵鸡汤
     */
    @Override
    public InspirationalQuotations selectInspirationalQuotationsById(Long id)
    {
        return inspirationalQuotationsMapper.selectInspirationalQuotationsById(id);
    }

    /**
     * 查询心灵鸡汤列表
     * 
     * @param inspirationalQuotations 心灵鸡汤
     * @return 心灵鸡汤
     */
    @Override
    public List<InspirationalQuotations> selectInspirationalQuotationsList(InspirationalQuotations inspirationalQuotations)
    {
        return inspirationalQuotationsMapper.selectInspirationalQuotationsList(inspirationalQuotations);
    }

    /**
     * 新增心灵鸡汤
     * 
     * @param inspirationalQuotations 心灵鸡汤
     * @return 结果
     */
    @Override
    public int insertInspirationalQuotations(InspirationalQuotations inspirationalQuotations)
    {
        inspirationalQuotations.setCreateTime(DateUtils.getNowDate());
        return inspirationalQuotationsMapper.insertInspirationalQuotations(inspirationalQuotations);
    }

    /**
     * 修改心灵鸡汤
     * 
     * @param inspirationalQuotations 心灵鸡汤
     * @return 结果
     */
    @Override
    public int updateInspirationalQuotations(InspirationalQuotations inspirationalQuotations)
    {
        inspirationalQuotations.setUpdateTime(DateUtils.getNowDate());
        return inspirationalQuotationsMapper.updateInspirationalQuotations(inspirationalQuotations);
    }

    /**
     * 删除心灵鸡汤对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteInspirationalQuotationsByIds(String ids)
    {
        return inspirationalQuotationsMapper.deleteInspirationalQuotationsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除心灵鸡汤信息
     * 
     * @param id 心灵鸡汤ID
     * @return 结果
     */
    @Override
    public int deleteInspirationalQuotationsById(Long id)
    {
        return inspirationalQuotationsMapper.deleteInspirationalQuotationsById(id);
    }
}
