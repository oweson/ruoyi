package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.NocturnalEmissionMapper;
import com.ruoyi.system.domain.NocturnalEmission;
import com.ruoyi.system.service.INocturnalEmissionService;
import com.ruoyi.common.core.text.Convert;

/**
 * 遗精记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-04
 */
@Service
public class NocturnalEmissionServiceImpl implements INocturnalEmissionService 
{
    @Autowired
    private NocturnalEmissionMapper nocturnalEmissionMapper;

    /**
     * 查询遗精记录
     * 
     * @param id 遗精记录ID
     * @return 遗精记录
     */
    @Override
    public NocturnalEmission selectNocturnalEmissionById(Long id)
    {
        return nocturnalEmissionMapper.selectNocturnalEmissionById(id);
    }

    /**
     * 查询遗精记录列表
     * 
     * @param nocturnalEmission 遗精记录
     * @return 遗精记录
     */
    @Override
    public List<NocturnalEmission> selectNocturnalEmissionList(NocturnalEmission nocturnalEmission)
    {
        return nocturnalEmissionMapper.selectNocturnalEmissionList(nocturnalEmission);
    }

    /**
     * 新增遗精记录
     * 
     * @param nocturnalEmission 遗精记录
     * @return 结果
     */
    @Override
    public int insertNocturnalEmission(NocturnalEmission nocturnalEmission)
    {
        nocturnalEmission.setCreateTime(DateUtils.getNowDate());
        return nocturnalEmissionMapper.insertNocturnalEmission(nocturnalEmission);
    }

    /**
     * 修改遗精记录
     * 
     * @param nocturnalEmission 遗精记录
     * @return 结果
     */
    @Override
    public int updateNocturnalEmission(NocturnalEmission nocturnalEmission)
    {
        nocturnalEmission.setUpdateTime(DateUtils.getNowDate());
        return nocturnalEmissionMapper.updateNocturnalEmission(nocturnalEmission);
    }

    /**
     * 删除遗精记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteNocturnalEmissionByIds(String ids)
    {
        return nocturnalEmissionMapper.deleteNocturnalEmissionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除遗精记录信息
     * 
     * @param id 遗精记录ID
     * @return 结果
     */
    @Override
    public int deleteNocturnalEmissionById(Long id)
    {
        return nocturnalEmissionMapper.deleteNocturnalEmissionById(id);
    }
}
