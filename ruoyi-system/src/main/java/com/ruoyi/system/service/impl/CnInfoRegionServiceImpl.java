package com.ruoyi.system.service.impl;

import java.util.List;
import java.util.ArrayList;
import com.ruoyi.common.core.domain.Ztree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CnInfoRegionMapper;
import com.ruoyi.system.domain.CnInfoRegion;
import com.ruoyi.system.service.ICnInfoRegionService;
import com.ruoyi.common.core.text.Convert;

/**
 * 中国地区信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-01-26
 */
@Service
public class CnInfoRegionServiceImpl implements ICnInfoRegionService 
{
    @Autowired
    private CnInfoRegionMapper cnInfoRegionMapper;

    /**
     * 查询中国地区信息
     * 
     * @param criId 中国地区信息ID
     * @return 中国地区信息
     */
    @Override
    public CnInfoRegion selectCnInfoRegionById(Long criId)
    {
        return cnInfoRegionMapper.selectCnInfoRegionById(criId);
    }

    /**
     * 查询中国地区信息列表
     * 
     * @param cnInfoRegion 中国地区信息
     * @return 中国地区信息
     */
    @Override
    public List<CnInfoRegion> selectCnInfoRegionList(CnInfoRegion cnInfoRegion)
    {
        return cnInfoRegionMapper.selectCnInfoRegionList(cnInfoRegion);
    }

    /**
     * 新增中国地区信息
     * 
     * @param cnInfoRegion 中国地区信息
     * @return 结果
     */
    @Override
    public int insertCnInfoRegion(CnInfoRegion cnInfoRegion)
    {
        return cnInfoRegionMapper.insertCnInfoRegion(cnInfoRegion);
    }

    /**
     * 修改中国地区信息
     * 
     * @param cnInfoRegion 中国地区信息
     * @return 结果
     */
    @Override
    public int updateCnInfoRegion(CnInfoRegion cnInfoRegion)
    {
        return cnInfoRegionMapper.updateCnInfoRegion(cnInfoRegion);
    }

    /**
     * 删除中国地区信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCnInfoRegionByIds(String ids)
    {
        return cnInfoRegionMapper.deleteCnInfoRegionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除中国地区信息信息
     * 
     * @param criId 中国地区信息ID
     * @return 结果
     */
    @Override
    public int deleteCnInfoRegionById(Long criId)
    {
        return cnInfoRegionMapper.deleteCnInfoRegionById(criId);
    }

    /**
     * 查询中国地区信息树列表
     * 
     * @return 所有中国地区信息信息
     */
    @Override
    public List<Ztree> selectCnInfoRegionTree()
    {
        List<CnInfoRegion> cnInfoRegionList = cnInfoRegionMapper.selectCnInfoRegionList(new CnInfoRegion());
        List<Ztree> ztrees = new ArrayList<Ztree>();
        for (CnInfoRegion cnInfoRegion : cnInfoRegionList)
        {
            Ztree ztree = new Ztree();
            ztree.setId(Long.parseLong(cnInfoRegion.getCriCode()));
            ztree.setpId(Long.parseLong(cnInfoRegion.getCriSuperiorCode()));
            ztree.setName(cnInfoRegion.getCriName());
            ztree.setTitle(cnInfoRegion.getCriName());
            ztrees.add(ztree);
        }
        return ztrees;
    }
}
