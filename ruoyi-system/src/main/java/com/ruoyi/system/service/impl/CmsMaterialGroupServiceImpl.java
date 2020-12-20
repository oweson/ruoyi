package com.ruoyi.system.service.impl;

import java.util.List;
import java.util.ArrayList;

import com.ruoyi.common.core.domain.Ztree;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.ShiroUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CmsMaterialGroupMapper;
import com.ruoyi.system.domain.CmsMaterialGroup;
import com.ruoyi.system.service.ICmsMaterialGroupService;
import com.ruoyi.common.core.text.Convert;

/**
 * 素材Service业务层处理
 *
 * @author ruoyi
 * @date 2020-12-11
 */
@Service
public class CmsMaterialGroupServiceImpl implements ICmsMaterialGroupService {
    @Autowired
    private CmsMaterialGroupMapper cmsMaterialGroupMapper;

    /**
     * 查询素材
     *
     * @param groupId 素材ID
     * @return 素材
     */
    @Override
    public CmsMaterialGroup selectCmsMaterialGroupById(Long groupId) {
        return cmsMaterialGroupMapper.selectCmsMaterialGroupById(groupId);
    }

    /**
     * 查询素材列表
     *
     * @param cmsMaterialGroup 素材
     * @return 素材
     */
    @Override
    public List<CmsMaterialGroup> selectCmsMaterialGroupList(CmsMaterialGroup cmsMaterialGroup) {
        return cmsMaterialGroupMapper.selectCmsMaterialGroupList(cmsMaterialGroup);
    }

    /**
     * 新增素材
     *
     * @param cmsMaterialGroup 素材
     * @return 结果
     */
    @Override
    public int insertCmsMaterialGroup(CmsMaterialGroup cmsMaterialGroup) {
        SysUser user = ShiroUtils.getSysUser();
        cmsMaterialGroup.setUserId(user.getUserId().toString());
        cmsMaterialGroup.setCreateBy(user.getUserName());
        cmsMaterialGroup.setDeptId(user.getDeptId().toString());
        cmsMaterialGroup.setCreateTime(DateUtils.getNowDate());
        return cmsMaterialGroupMapper.insertCmsMaterialGroup(cmsMaterialGroup);
    }

    /**
     * 修改素材
     *
     * @param cmsMaterialGroup 素材
     * @return 结果
     */
    @Override
    public int updateCmsMaterialGroup(CmsMaterialGroup cmsMaterialGroup) {
        return cmsMaterialGroupMapper.updateCmsMaterialGroup(cmsMaterialGroup);
    }

    /**
     * 删除素材对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCmsMaterialGroupByIds(String ids) {
        return cmsMaterialGroupMapper.deleteCmsMaterialGroupByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除素材信息
     *
     * @param groupId 素材ID
     * @return 结果
     */
    @Override
    public int deleteCmsMaterialGroupById(Long groupId) {
        return cmsMaterialGroupMapper.deleteCmsMaterialGroupById(groupId);
    }

    /**
     * 查询素材树列表
     *
     * @return 所有素材信息
     */
    @Override
    public List<Ztree> selectCmsMaterialGroupTree() {
        List<CmsMaterialGroup> cmsMaterialGroupList = cmsMaterialGroupMapper.selectCmsMaterialGroupList(new CmsMaterialGroup());
        List<Ztree> ztrees = new ArrayList<Ztree>();
        for (CmsMaterialGroup cmsMaterialGroup : cmsMaterialGroupList) {
            Ztree ztree = new Ztree();
            ztree.setId(cmsMaterialGroup.getGroupId());
            ztree.setpId(cmsMaterialGroup.getParentId());
            ztree.setName(cmsMaterialGroup.getGroupName());
            ztree.setTitle(cmsMaterialGroup.getGroupName());
            ztrees.add(ztree);
        }
        return ztrees;
    }
}
