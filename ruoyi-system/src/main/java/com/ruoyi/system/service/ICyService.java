package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Cy;

/**
 * 成语Service接口
 * 
 * @author ruoyi
 * @date 2020-08-15
 */
public interface ICyService 
{
    /**
     * 查询成语
     * 
     * @param ID 成语ID
     * @return 成语
     */
    public Cy selectCyById(Long ID);

    /**
     * 查询成语列表
     * 
     * @param cy 成语
     * @return 成语集合
     */
    public List<Cy> selectCyList(Cy cy);

    /**
     * 新增成语
     * 
     * @param cy 成语
     * @return 结果
     */
    public int insertCy(Cy cy);

    /**
     * 修改成语
     * 
     * @param cy 成语
     * @return 结果
     */
    public int updateCy(Cy cy);

    /**
     * 批量删除成语
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCyByIds(String ids);

    /**
     * 删除成语信息
     * 
     * @param ID 成语ID
     * @return 结果
     */
    public int deleteCyById(Long ID);
}
