package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.CnInfoRegion;

/**
 * 中国地区信息Mapper接口
 * 
 * @author ruoyi
 * @date 2021-01-26
 */
public interface CnInfoRegionMapper 
{
    /**
     * 查询中国地区信息
     * 
     * @param criId 中国地区信息ID
     * @return 中国地区信息
     */
    public CnInfoRegion selectCnInfoRegionById(Long criId);

    /**
     * 查询中国地区信息列表
     * 
     * @param cnInfoRegion 中国地区信息
     * @return 中国地区信息集合
     */
    public List<CnInfoRegion> selectCnInfoRegionList(CnInfoRegion cnInfoRegion);

    /**
     * 新增中国地区信息
     * 
     * @param cnInfoRegion 中国地区信息
     * @return 结果
     */
    public int insertCnInfoRegion(CnInfoRegion cnInfoRegion);

    /**
     * 修改中国地区信息
     * 
     * @param cnInfoRegion 中国地区信息
     * @return 结果
     */
    public int updateCnInfoRegion(CnInfoRegion cnInfoRegion);

    /**
     * 删除中国地区信息
     * 
     * @param criId 中国地区信息ID
     * @return 结果
     */
    public int deleteCnInfoRegionById(Long criId);

    /**
     * 批量删除中国地区信息
     * 
     * @param criIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteCnInfoRegionByIds(String[] criIds);
}
