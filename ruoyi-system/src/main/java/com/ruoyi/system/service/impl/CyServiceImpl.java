package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CyMapper;
import com.ruoyi.system.domain.Cy;
import com.ruoyi.system.service.ICyService;
import com.ruoyi.common.core.text.Convert;

/**
 * 成语Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-08-15
 */
@Service
public class CyServiceImpl implements ICyService 
{
    @Autowired
    private CyMapper cyMapper;

    /**
     * 查询成语
     * 
     * @param ID 成语ID
     * @return 成语
     */
    @Override
    public Cy selectCyById(Long ID)
    {
        return cyMapper.selectCyById(ID);
    }

    /**
     * 查询成语列表
     * 
     * @param cy 成语
     * @return 成语
     */
    @Override
    public List<Cy> selectCyList(Cy cy)
    {
        return cyMapper.selectCyList(cy);
    }

    /**
     * 新增成语
     * 
     * @param cy 成语
     * @return 结果
     */
    @Override
    public int insertCy(Cy cy)
    {
        return cyMapper.insertCy(cy);
    }

    /**
     * 修改成语
     * 
     * @param cy 成语
     * @return 结果
     */
    @Override
    public int updateCy(Cy cy)
    {
        return cyMapper.updateCy(cy);
    }

    /**
     * 删除成语对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCyByIds(String ids)
    {
        return cyMapper.deleteCyByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除成语信息
     * 
     * @param ID 成语ID
     * @return 结果
     */
    @Override
    public int deleteCyById(Long ID)
    {
        return cyMapper.deleteCyById(ID);
    }
}
