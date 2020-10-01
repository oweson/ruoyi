package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Schoolall;

/**
 * 高校查询终极版Service接口
 * 
 * @author ruoyi
 * @date 2020-09-29
 */
public interface ISchoolallService 
{
    /**
     * 查询高校查询终极版
     * 
     * @param id 高校查询终极版ID
     * @return 高校查询终极版
     */
    public Schoolall selectSchoolallById(String id);

    /**
     * 查询高校查询终极版列表
     * 
     * @param schoolall 高校查询终极版
     * @return 高校查询终极版集合
     */
    public List<Schoolall> selectSchoolallList(Schoolall schoolall);

    /**
     * 新增高校查询终极版
     * 
     * @param schoolall 高校查询终极版
     * @return 结果
     */
    public int insertSchoolall(Schoolall schoolall);

    /**
     * 修改高校查询终极版
     * 
     * @param schoolall 高校查询终极版
     * @return 结果
     */
    public int updateSchoolall(Schoolall schoolall);

    /**
     * 批量删除高校查询终极版
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSchoolallByIds(String ids);

    /**
     * 删除高校查询终极版信息
     * 
     * @param id 高校查询终极版ID
     * @return 结果
     */
    public int deleteSchoolallById(String id);
}
