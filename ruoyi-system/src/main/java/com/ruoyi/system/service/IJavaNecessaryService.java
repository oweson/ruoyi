package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.JavaNecessary;

/**
 * 求职技术Service接口
 * 
 * @author ruoyi
 * @date 2020-09-26
 */
public interface IJavaNecessaryService 
{
    /**
     * 查询求职技术
     * 
     * @param id 求职技术ID
     * @return 求职技术
     */
    public JavaNecessary selectJavaNecessaryById(Long id);

    /**
     * 查询求职技术列表
     * 
     * @param javaNecessary 求职技术
     * @return 求职技术集合
     */
    public List<JavaNecessary> selectJavaNecessaryList(JavaNecessary javaNecessary);

    /**
     * 新增求职技术
     * 
     * @param javaNecessary 求职技术
     * @return 结果
     */
    public int insertJavaNecessary(JavaNecessary javaNecessary);

    /**
     * 修改求职技术
     * 
     * @param javaNecessary 求职技术
     * @return 结果
     */
    public int updateJavaNecessary(JavaNecessary javaNecessary);

    /**
     * 批量删除求职技术
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJavaNecessaryByIds(String ids);

    /**
     * 删除求职技术信息
     * 
     * @param id 求职技术ID
     * @return 结果
     */
    public int deleteJavaNecessaryById(Long id);
}
