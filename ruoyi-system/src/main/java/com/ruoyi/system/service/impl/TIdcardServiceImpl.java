package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TIdcardMapper;
import com.ruoyi.system.domain.TIdcard;
import com.ruoyi.system.service.ITIdcardService;
import com.ruoyi.common.core.text.Convert;

/**
 * 身份证查询Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-29
 */
@Service
public class TIdcardServiceImpl implements ITIdcardService 
{
    @Autowired
    private TIdcardMapper tIdcardMapper;

    /**
     * 查询身份证查询
     * 
     * @param fCode 身份证查询ID
     * @return 身份证查询
     */
    @Override
    public TIdcard selectTIdcardById(Integer fCode)
    {
        return tIdcardMapper.selectTIdcardById(fCode);
    }

    /**
     * 查询身份证查询列表
     * 
     * @param tIdcard 身份证查询
     * @return 身份证查询
     */
    @Override
    public List<TIdcard> selectTIdcardList(TIdcard tIdcard)
    {
        return tIdcardMapper.selectTIdcardList(tIdcard);
    }

    /**
     * 新增身份证查询
     * 
     * @param tIdcard 身份证查询
     * @return 结果
     */
    @Override
    public int insertTIdcard(TIdcard tIdcard)
    {
        return tIdcardMapper.insertTIdcard(tIdcard);
    }

    /**
     * 修改身份证查询
     * 
     * @param tIdcard 身份证查询
     * @return 结果
     */
    @Override
    public int updateTIdcard(TIdcard tIdcard)
    {
        return tIdcardMapper.updateTIdcard(tIdcard);
    }

    /**
     * 删除身份证查询对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTIdcardByIds(String ids)
    {
        return tIdcardMapper.deleteTIdcardByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除身份证查询信息
     * 
     * @param fCode 身份证查询ID
     * @return 结果
     */
    @Override
    public int deleteTIdcardById(Integer fCode)
    {
        return tIdcardMapper.deleteTIdcardById(fCode);
    }
}
