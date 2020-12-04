package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.NocturnalEmission;

/**
 * 遗精记录Service接口
 * 
 * @author ruoyi
 * @date 2020-12-04
 */
public interface INocturnalEmissionService 
{
    /**
     * 查询遗精记录
     * 
     * @param id 遗精记录ID
     * @return 遗精记录
     */
    public NocturnalEmission selectNocturnalEmissionById(Long id);

    /**
     * 查询遗精记录列表
     * 
     * @param nocturnalEmission 遗精记录
     * @return 遗精记录集合
     */
    public List<NocturnalEmission> selectNocturnalEmissionList(NocturnalEmission nocturnalEmission);

    /**
     * 新增遗精记录
     * 
     * @param nocturnalEmission 遗精记录
     * @return 结果
     */
    public int insertNocturnalEmission(NocturnalEmission nocturnalEmission);

    /**
     * 修改遗精记录
     * 
     * @param nocturnalEmission 遗精记录
     * @return 结果
     */
    public int updateNocturnalEmission(NocturnalEmission nocturnalEmission);

    /**
     * 批量删除遗精记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteNocturnalEmissionByIds(String ids);

    /**
     * 删除遗精记录信息
     * 
     * @param id 遗精记录ID
     * @return 结果
     */
    public int deleteNocturnalEmissionById(Long id);
}
