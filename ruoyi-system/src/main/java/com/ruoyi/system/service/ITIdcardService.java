package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TIdcard;

/**
 * 身份证查询Service接口
 * 
 * @author ruoyi
 * @date 2020-09-29
 */
public interface ITIdcardService 
{
    /**
     * 查询身份证查询
     * 
     * @param fCode 身份证查询ID
     * @return 身份证查询
     */
    public TIdcard selectTIdcardById(Integer fCode);

    /**
     * 查询身份证查询列表
     * 
     * @param tIdcard 身份证查询
     * @return 身份证查询集合
     */
    public List<TIdcard> selectTIdcardList(TIdcard tIdcard);

    /**
     * 新增身份证查询
     * 
     * @param tIdcard 身份证查询
     * @return 结果
     */
    public int insertTIdcard(TIdcard tIdcard);

    /**
     * 修改身份证查询
     * 
     * @param tIdcard 身份证查询
     * @return 结果
     */
    public int updateTIdcard(TIdcard tIdcard);

    /**
     * 批量删除身份证查询
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTIdcardByIds(String ids);

    /**
     * 删除身份证查询信息
     * 
     * @param fCode 身份证查询ID
     * @return 结果
     */
    public int deleteTIdcardById(Integer fCode);
}
