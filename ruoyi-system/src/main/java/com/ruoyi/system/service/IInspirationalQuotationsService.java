package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.InspirationalQuotations;

/**
 * 心灵鸡汤Service接口
 * 
 * @author ruoyi
 * @date 2020-09-13
 */
public interface IInspirationalQuotationsService 
{
    /**
     * 查询心灵鸡汤
     * 
     * @param id 心灵鸡汤ID
     * @return 心灵鸡汤
     */
    public InspirationalQuotations selectInspirationalQuotationsById(Long id);

    /**
     * 查询心灵鸡汤列表
     * 
     * @param inspirationalQuotations 心灵鸡汤
     * @return 心灵鸡汤集合
     */
    public List<InspirationalQuotations> selectInspirationalQuotationsList(InspirationalQuotations inspirationalQuotations);

    /**
     * 新增心灵鸡汤
     * 
     * @param inspirationalQuotations 心灵鸡汤
     * @return 结果
     */
    public int insertInspirationalQuotations(InspirationalQuotations inspirationalQuotations);

    /**
     * 修改心灵鸡汤
     * 
     * @param inspirationalQuotations 心灵鸡汤
     * @return 结果
     */
    public int updateInspirationalQuotations(InspirationalQuotations inspirationalQuotations);

    /**
     * 批量删除心灵鸡汤
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteInspirationalQuotationsByIds(String ids);

    /**
     * 删除心灵鸡汤信息
     * 
     * @param id 心灵鸡汤ID
     * @return 结果
     */
    public int deleteInspirationalQuotationsById(Long id);
}
