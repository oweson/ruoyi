package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.EnterprisesGarbageMapper;
import com.ruoyi.system.domain.EnterprisesGarbage;
import com.ruoyi.system.service.IEnterprisesGarbageService;
import com.ruoyi.common.core.text.Convert;

/**
 * 垃圾公司Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-26
 */
@Service
public class EnterprisesGarbageServiceImpl implements IEnterprisesGarbageService 
{
    @Autowired
    private EnterprisesGarbageMapper enterprisesGarbageMapper;

    /**
     * 查询垃圾公司
     * 
     * @param id 垃圾公司ID
     * @return 垃圾公司
     */
    @Override
    public EnterprisesGarbage selectEnterprisesGarbageById(Long id)
    {
        return enterprisesGarbageMapper.selectEnterprisesGarbageById(id);
    }

    /**
     * 查询垃圾公司列表
     * 
     * @param enterprisesGarbage 垃圾公司
     * @return 垃圾公司
     */
    @Override
    public List<EnterprisesGarbage> selectEnterprisesGarbageList(EnterprisesGarbage enterprisesGarbage)
    {
        return enterprisesGarbageMapper.selectEnterprisesGarbageList(enterprisesGarbage);
    }

    /**
     * 新增垃圾公司
     * 
     * @param enterprisesGarbage 垃圾公司
     * @return 结果
     */
    @Override
    public int insertEnterprisesGarbage(EnterprisesGarbage enterprisesGarbage)
    {
        return enterprisesGarbageMapper.insertEnterprisesGarbage(enterprisesGarbage);
    }

    /**
     * 修改垃圾公司
     * 
     * @param enterprisesGarbage 垃圾公司
     * @return 结果
     */
    @Override
    public int updateEnterprisesGarbage(EnterprisesGarbage enterprisesGarbage)
    {
        return enterprisesGarbageMapper.updateEnterprisesGarbage(enterprisesGarbage);
    }

    /**
     * 删除垃圾公司对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteEnterprisesGarbageByIds(String ids)
    {
        return enterprisesGarbageMapper.deleteEnterprisesGarbageByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除垃圾公司信息
     * 
     * @param id 垃圾公司ID
     * @return 结果
     */
    @Override
    public int deleteEnterprisesGarbageById(Long id)
    {
        return enterprisesGarbageMapper.deleteEnterprisesGarbageById(id);
    }
}
