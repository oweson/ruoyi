package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.CommercialCases;

/**
 * 商业分析Service接口
 * 
 * @author ruoyi
 * @date 2020-09-13
 */
public interface ICommercialCasesService 
{
    /**
     * 查询商业分析
     * 
     * @param id 商业分析ID
     * @return 商业分析
     */
    public CommercialCases selectCommercialCasesById(Long id);

    /**
     * 查询商业分析列表
     * 
     * @param commercialCases 商业分析
     * @return 商业分析集合
     */
    public List<CommercialCases> selectCommercialCasesList(CommercialCases commercialCases);

    /**
     * 新增商业分析
     * 
     * @param commercialCases 商业分析
     * @return 结果
     */
    public int insertCommercialCases(CommercialCases commercialCases);

    /**
     * 修改商业分析
     * 
     * @param commercialCases 商业分析
     * @return 结果
     */
    public int updateCommercialCases(CommercialCases commercialCases);

    /**
     * 批量删除商业分析
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCommercialCasesByIds(String ids);

    /**
     * 删除商业分析信息
     * 
     * @param id 商业分析ID
     * @return 结果
     */
    public int deleteCommercialCasesById(Long id);
}
