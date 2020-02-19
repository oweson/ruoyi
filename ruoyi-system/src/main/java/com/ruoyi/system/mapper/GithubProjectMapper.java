package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.GithubProject;
import java.util.List;

/**
 * github项目Mapper接口
 * 
 * @author ruoyi
 * @date 2020-02-07
 */
public interface GithubProjectMapper 
{
    /**
     * 查询github项目
     * 
     * @param id github项目ID
     * @return github项目
     */
    public GithubProject selectGithubProjectById(Long id);

    /**
     * 查询github项目列表
     * 
     * @param githubProject github项目
     * @return github项目集合
     */
    public List<GithubProject> selectGithubProjectList(GithubProject githubProject);

    /**
     * 新增github项目
     * 
     * @param githubProject github项目
     * @return 结果
     */
    public int insertGithubProject(GithubProject githubProject);

    /**
     * 修改github项目
     * 
     * @param githubProject github项目
     * @return 结果
     */
    public int updateGithubProject(GithubProject githubProject);

    /**
     * 删除github项目
     * 
     * @param id github项目ID
     * @return 结果
     */
    public int deleteGithubProjectById(Long id);

    /**
     * 批量删除github项目
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteGithubProjectByIds(String[] ids);
}
