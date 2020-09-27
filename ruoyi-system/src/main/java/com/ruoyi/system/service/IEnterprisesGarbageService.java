package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.EnterprisesGarbage;

/**
 * 垃圾公司Service接口
 * 
 * @author ruoyi
 * @date 2020-09-26
 */
public interface IEnterprisesGarbageService 
{
    /**
     * 查询垃圾公司
     * 
     * @param id 垃圾公司ID
     * @return 垃圾公司
     */
    public EnterprisesGarbage selectEnterprisesGarbageById(Long id);

    /**
     * 查询垃圾公司列表
     * 
     * @param enterprisesGarbage 垃圾公司
     * @return 垃圾公司集合
     */
    public List<EnterprisesGarbage> selectEnterprisesGarbageList(EnterprisesGarbage enterprisesGarbage);

    /**
     * 新增垃圾公司
     * 
     * @param enterprisesGarbage 垃圾公司
     * @return 结果
     */
    public int insertEnterprisesGarbage(EnterprisesGarbage enterprisesGarbage);

    /**
     * 修改垃圾公司
     * 
     * @param enterprisesGarbage 垃圾公司
     * @return 结果
     */
    public int updateEnterprisesGarbage(EnterprisesGarbage enterprisesGarbage);

    /**
     * 批量删除垃圾公司
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteEnterprisesGarbageByIds(String ids);

    /**
     * 删除垃圾公司信息
     * 
     * @param id 垃圾公司ID
     * @return 结果
     */
    public int deleteEnterprisesGarbageById(Long id);
}
