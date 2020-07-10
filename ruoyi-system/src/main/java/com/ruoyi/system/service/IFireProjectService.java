package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.FireProject;

/**
 * 拥有的项目能力Service接口
 * 
 * @author ruoyi
 * @date 2020-06-03
 */
public interface IFireProjectService 
{
    /**
     * 查询拥有的项目能力
     * 
     * @param id 拥有的项目能力ID
     * @return 拥有的项目能力
     */
    public FireProject selectFireProjectById(Long id);

    /**
     * 查询拥有的项目能力列表
     * 
     * @param fireProject 拥有的项目能力
     * @return 拥有的项目能力集合
     */
    public List<FireProject> selectFireProjectList(FireProject fireProject);

    /**
     * 新增拥有的项目能力
     * 
     * @param fireProject 拥有的项目能力
     * @return 结果
     */
    public int insertFireProject(FireProject fireProject);

    /**
     * 修改拥有的项目能力
     * 
     * @param fireProject 拥有的项目能力
     * @return 结果
     */
    public int updateFireProject(FireProject fireProject);

    /**
     * 批量删除拥有的项目能力
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFireProjectByIds(String ids);

    /**
     * 删除拥有的项目能力信息
     * 
     * @param id 拥有的项目能力ID
     * @return 结果
     */
    public int deleteFireProjectById(Long id);
}
