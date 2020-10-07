package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BlindDatepeople;

/**
 * 恋爱人员Service接口
 * 
 * @author oweson
 * @date 2020-10-07
 */
public interface IBlindDatepeopleService 
{
    /**
     * 查询恋爱人员
     * 
     * @param id 恋爱人员ID
     * @return 恋爱人员
     */
    public BlindDatepeople selectBlindDatepeopleById(Long id);

    /**
     * 查询恋爱人员列表
     * 
     * @param blindDatepeople 恋爱人员
     * @return 恋爱人员集合
     */
    public List<BlindDatepeople> selectBlindDatepeopleList(BlindDatepeople blindDatepeople);

    /**
     * 新增恋爱人员
     * 
     * @param blindDatepeople 恋爱人员
     * @return 结果
     */
    public int insertBlindDatepeople(BlindDatepeople blindDatepeople);

    /**
     * 修改恋爱人员
     * 
     * @param blindDatepeople 恋爱人员
     * @return 结果
     */
    public int updateBlindDatepeople(BlindDatepeople blindDatepeople);

    /**
     * 批量删除恋爱人员
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBlindDatepeopleByIds(String ids);

    /**
     * 删除恋爱人员信息
     * 
     * @param id 恋爱人员ID
     * @return 结果
     */
    public int deleteBlindDatepeopleById(Long id);
}
