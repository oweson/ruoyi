package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CommercialCasesMapper;
import com.ruoyi.system.domain.CommercialCases;
import com.ruoyi.system.service.ICommercialCasesService;
import com.ruoyi.common.core.text.Convert;

/**
 * 商业分析Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-13
 */
@Service
public class CommercialCasesServiceImpl implements ICommercialCasesService 
{
    @Autowired
    private CommercialCasesMapper commercialCasesMapper;

    /**
     * 查询商业分析
     * 
     * @param id 商业分析ID
     * @return 商业分析
     */
    @Override
    public CommercialCases selectCommercialCasesById(Long id)
    {
        return commercialCasesMapper.selectCommercialCasesById(id);
    }

    /**
     * 查询商业分析列表
     * 
     * @param commercialCases 商业分析
     * @return 商业分析
     */
    @Override
    public List<CommercialCases> selectCommercialCasesList(CommercialCases commercialCases)
    {
        return commercialCasesMapper.selectCommercialCasesList(commercialCases);
    }

    /**
     * 新增商业分析
     * 
     * @param commercialCases 商业分析
     * @return 结果
     */
    @Override
    public int insertCommercialCases(CommercialCases commercialCases)
    {
        commercialCases.setCreateTime(DateUtils.getNowDate());
        return commercialCasesMapper.insertCommercialCases(commercialCases);
    }

    /**
     * 修改商业分析
     * 
     * @param commercialCases 商业分析
     * @return 结果
     */
    @Override
    public int updateCommercialCases(CommercialCases commercialCases)
    {
        commercialCases.setUpdateTime(DateUtils.getNowDate());
        return commercialCasesMapper.updateCommercialCases(commercialCases);
    }

    /**
     * 删除商业分析对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCommercialCasesByIds(String ids)
    {
        return commercialCasesMapper.deleteCommercialCasesByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除商业分析信息
     * 
     * @param id 商业分析ID
     * @return 结果
     */
    @Override
    public int deleteCommercialCasesById(Long id)
    {
        return commercialCasesMapper.deleteCommercialCasesById(id);
    }
}
