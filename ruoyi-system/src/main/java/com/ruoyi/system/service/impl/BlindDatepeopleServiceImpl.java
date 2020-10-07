package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BlindDatepeopleMapper;
import com.ruoyi.system.domain.BlindDatepeople;
import com.ruoyi.system.service.IBlindDatepeopleService;
import com.ruoyi.common.core.text.Convert;

/**
 * 恋爱人员Service业务层处理
 * 
 * @author oweson
 * @date 2020-10-07
 */
@Service
public class BlindDatepeopleServiceImpl implements IBlindDatepeopleService 
{
    @Autowired
    private BlindDatepeopleMapper blindDatepeopleMapper;

    /**
     * 查询恋爱人员
     * 
     * @param id 恋爱人员ID
     * @return 恋爱人员
     */
    @Override
    public BlindDatepeople selectBlindDatepeopleById(Long id)
    {
        return blindDatepeopleMapper.selectBlindDatepeopleById(id);
    }

    /**
     * 查询恋爱人员列表
     * 
     * @param blindDatepeople 恋爱人员
     * @return 恋爱人员
     */
    @Override
    public List<BlindDatepeople> selectBlindDatepeopleList(BlindDatepeople blindDatepeople)
    {
        return blindDatepeopleMapper.selectBlindDatepeopleList(blindDatepeople);
    }

    /**
     * 新增恋爱人员
     * 
     * @param blindDatepeople 恋爱人员
     * @return 结果
     */
    @Override
    public int insertBlindDatepeople(BlindDatepeople blindDatepeople)
    {
        blindDatepeople.setCreateTime(DateUtils.getNowDate());
        return blindDatepeopleMapper.insertBlindDatepeople(blindDatepeople);
    }

    /**
     * 修改恋爱人员
     * 
     * @param blindDatepeople 恋爱人员
     * @return 结果
     */
    @Override
    public int updateBlindDatepeople(BlindDatepeople blindDatepeople)
    {
        blindDatepeople.setUpdateTime(DateUtils.getNowDate());
        return blindDatepeopleMapper.updateBlindDatepeople(blindDatepeople);
    }

    /**
     * 删除恋爱人员对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBlindDatepeopleByIds(String ids)
    {
        return blindDatepeopleMapper.deleteBlindDatepeopleByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除恋爱人员信息
     * 
     * @param id 恋爱人员ID
     * @return 结果
     */
    @Override
    public int deleteBlindDatepeopleById(Long id)
    {
        return blindDatepeopleMapper.deleteBlindDatepeopleById(id);
    }
}
