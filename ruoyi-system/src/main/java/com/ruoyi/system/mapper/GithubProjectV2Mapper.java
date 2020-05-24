package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.GithubProjectv2;

/**
 * github_v2项目Mapper接口
 * 
 * @author ruoyi
 * @date 2020-04-05
 */
public interface GithubProjectv2Mapper 
{
    /**
     * 查询github_v2项目
     * 
     * @param id github_v2项目ID
     * @return github_v2项目
     */
    public GithubProjectv2 selectGithubProjectv2ById(Long id);

    /**
     * 查询github_v2项目列表
     * 
     * @param githubProjectv2 github_v2项目
     * @return github_v2项目集合
     */
    public List<GithubProjectv2> selectGithubProjectv2List(GithubProjectv2 githubProjectv2);

    /**
     * 新增github_v2项目
     * 
     * @param githubProjectv2 github_v2项目
     * @return 结果
     */
    public int insertGithubProjectv2(GithubProjectv2 githubProjectv2);

    /**
     * 修改github_v2项目
     * 
     * @param githubProjectv2 github_v2项目
     * @return 结果
     */
    public int updateGithubProjectv2(GithubProjectv2 githubProjectv2);

    /**
     * 删除github_v2项目
     * 
     * @param id github_v2项目ID
     * @return 结果
     */
    public int deleteGithubProjectv2ById(Long id);

    /**
     * 批量删除github_v2项目
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteGithubProjectv2ByIds(String[] ids);
}
