package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.CmsMaterialGroup;
import com.ruoyi.common.core.domain.Ztree;

/**
 * 素材Service接口
 * 
 * @author ruoyi
 * @date 2020-12-11
 */
public interface ICmsMaterialGroupService 
{
    /**
     * 查询素材
     * 
     * @param groupId 素材ID
     * @return 素材
     */
    public CmsMaterialGroup selectCmsMaterialGroupById(Long groupId);

    /**
     * 查询素材列表
     * 
     * @param cmsMaterialGroup 素材
     * @return 素材集合
     */
    public List<CmsMaterialGroup> selectCmsMaterialGroupList(CmsMaterialGroup cmsMaterialGroup);

    /**
     * 新增素材
     * 
     * @param cmsMaterialGroup 素材
     * @return 结果
     */
    public int insertCmsMaterialGroup(CmsMaterialGroup cmsMaterialGroup);

    /**
     * 修改素材
     * 
     * @param cmsMaterialGroup 素材
     * @return 结果
     */
    public int updateCmsMaterialGroup(CmsMaterialGroup cmsMaterialGroup);

    /**
     * 批量删除素材
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCmsMaterialGroupByIds(String ids);

    /**
     * 删除素材信息
     * 
     * @param groupId 素材ID
     * @return 结果
     */
    public int deleteCmsMaterialGroupById(Long groupId);

    /**
     * 查询素材树列表
     * 
     * @return 所有素材信息
     */
    public List<Ztree> selectCmsMaterialGroupTree();
}
